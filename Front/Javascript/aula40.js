const caixa2 = document.querySelector("#caixa2");
const btn = document.querySelector("#btnAdicionar");

btn.addEventListener("click", () => {

    const nome = prompt("Digite o curso:");

    if(nome != ""){

        const novo = document.createElement("div");

        novo.classList.add("curso");
        novo.innerHTML = nome;
        caixa2.appendChild(novo);

    }
});
const caixa1 = document.querySelector('#caixa1');
const btn_c = [...document.querySelectorAll('.curso')];
const c1_2 = document.querySelector('#c1_2');

const novoElemento = document.createElement("div");
novoElemento.innerHTML = "BACK-END";
novoElemento.classList.add("curso");

caixa1.appendChild(novoElemento);