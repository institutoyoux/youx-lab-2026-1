const divValor1 = document.getElementById("valor1")
const sectionDisplay = document.getElementById("display")
let valor1 = "";
let valor2 = "";


const editar = (campo) => {
    const divValor2 = document.getElementById("valor2")
    valor1 = "";
    valor2 = "";

    divValor1.innerText = campo ? campo : "0"
    divValor2 ? divValor2.remove() : null;
    document.querySelector(".sinal").innerText = "";
};

const atualizar = () => {
    const divValor2 = document.getElementById("valor2")
    divValor1.innerText = valor1;
    if (valor2 != "") {
        divValor2.innerText = valor2;
    }
}

const addNumber = (number) => {
    if (!document.getElementById("valor2")) {
        valor1 += number;
        atualizar();
    } else {
        valor2 += number;
        atualizar();
    }
}
const iniciarOperacao = (sinal) => {
    if (valor1 === "") {
        return
    };
    const spanSinal = document.querySelector(".sinal")
    if (spanSinal.innerHTML !== "") {
        return
    }
    spanSinal.innerText = sinal;
    const createValor2 = document.createElement("span");
    createValor2.setAttribute("id", "valor2");
    sectionDisplay.appendChild(createValor2);
}

const total = () => {
    const spanSinal = document.querySelector(".sinal").innerHTML
    if (!spanSinal) {
        return
    }
    if (valor2 == "") {
        return
    }
    let resultado1 = parseFloat(valor1.replace(",", "."))
    let resultado2 = parseFloat(valor2.replace(",", "."))

    if (spanSinal == "+") {
        editar(resultado1 + resultado2)
    }
    if (spanSinal == "X") {
        editar(resultado1 * resultado2)
    }
    if (spanSinal == "-") {
        editar(resultado1 - resultado2)
    }
    if (spanSinal == "÷") {
        editar(resultado1 / resultado2)
    }
    if (spanSinal == "%") {
        editar(resultado2 * (resultado1 / 100))
    }
}

document.querySelectorAll("div[act]").forEach(div => {
    const act = div.getAttribute('act');
    div.addEventListener("click", () => {
        if (act === "number") {
            addNumber(div.innerText);
        }
        if (act === "limpar") {
            editar();
        }
        if (act === "sinal") {
            iniciarOperacao(div.innerText);
        }
        if (act === "total") {
            total();
        }
    })
}
)