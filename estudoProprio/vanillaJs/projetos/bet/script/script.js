!token ? window.location.href = '/auth/login/' : '';


const form = document.querySelector("form")
const btn = document.querySelector(".submit")
const cells = document.querySelectorAll(".cell")
btn.addEventListener("click", (event) => {
    event.preventDefault();
    if (btn.getAttribute("act") === "saque") {
        sacar()
    } else {
        apostar()
    }
})
const apostar = async () => {
    logReq.post("/game/new", { value: form.value.value })
        .then(data => {
            btn.innerText = "Sacar"
            btn.setAttribute("act", "saque")
            cells.forEach(cell => {
                cell.removeAttribute("disabled")
            })
        })
        .catch(error => {
            if (error.response.data.message) {
                alert(error.response.data.message)
            } else {
                alert("Ocorreu um erro ao fazer a aposta!")
            }
        })
}

cells.forEach(cell => {
    cell.addEventListener("click", () => {
        abrirCell(cell.id)
    })
})
const abrirCell = async (id) => {
    logReq.post("/game/open", { cell: id })
        .then(response => {
            if (response.data.status === 'LOSE') {
                document.getElementById(id).style.backgroundColor = 'red'
                alert("Você perdeu!")
                fecharJogo();
            } else {
                document.getElementById(id).style.backgroundColor = 'green'
            }
        })
        .catch(error => alert('Erro ao abrir cell'))
}

const atualizarSaldo = async () => {
    logReq.get("/me")
        .then(response => {
            const balance = `R$ ${response.data.user.balance}`.replace(".", ",").split(",")
            if (balance.length > 1) {
            document.getElementById("balance").innerText = balance[0] + "," + balance[1].substring(0, 2);
            } else {
                document.getElementById("balance").innerText = balance[0] + "," + '00'
            }
        })
}
atualizarSaldo()

const fecharJogo = () => {
    atualizarSaldo()
    cells.forEach(cell => {
        cell.style.backgroundColor = 'var(--primary)'
        cell.setAttribute("disabled", "")
    })
    btn.removeAttribute("act")
    btn.innerText = "Apostar"
}

const sacar = () => {
    logReq.post("/game/close")
        .then(response => { fecharJogo() })
        .catch(error => { alert("Ocorreu um erro ao encerrar") })
}