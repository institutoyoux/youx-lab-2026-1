const api = axios.create({
    baseURL: 'http://localhost:8080'
})
const statusDici = {
    NAO_INICIADO: {
        texto: "Não iniciado",
        cor: "#475569"
    },
    ANDAMENTO: {
        texto: "Em andamento",
        cor: "#0369A1"
    },
    FINALIZADO: {
        texto: "Finalizado",
        cor: "#15803D"
    }
}
class Tarefa {
    constructor(tarefa) {
        this.id = tarefa.id
        this.nome = tarefa.nome
        this.tipo = tarefa.tipo
        this.dataCadastro = tarefa.dataCadastro
        this.dataTermino = tarefa.dataTermino
        this.status = tarefa.status
    }
    genHtml() {
        const statusFormatado = statusDici[this.status]
        const atrasado = new Date() <= new Date(this.dataTermino)
        let data = this.dataTermino.split("-")
        const linha = document.createElement("tr")
        linha.innerHTML = `<td>${this.nome}</td>
            <td>${this.tipo}</td>
            <td>${data[2] + '/' + data[1] + '/' + data[0]}</td>
            <td>
                <div style="background-color: ${statusFormatado.cor};">${statusFormatado.texto}</div>
            </td>
            <td>
                <div style="background-color: ${atrasado ? '#15803D;' : 'red'}">${atrasado ? 'Em dia' : 'Atrasado'}</div>
            </td>
            <td class="campos">
            <button class="editBtn">Editar</button>
            <button class="delBtn">Deletar</button>
            </td>
            `
        linha.querySelector(".editBtn").addEventListener("click", () => {
            btn.tarefaEditado = this
            editar(this)
        })
        linha.querySelector(".delBtn").addEventListener("click", () => this.excluir())
        return linha;
    }
    async excluir() {
        await api.delete(`/tarefas/${this.id}`)
            .then(response => puxarTarefas())
            .catch(error => {
                alert("Ocorreu um erro ao deletar!")
                console.error(error);
            })
    }
}

const dataCadastroInput = document.getElementById("dataCadastro")
const dataTerminoInput = document.getElementById("dataTermino")
const btn = document.getElementById("btn")
const form = document.querySelector("form")
const table = document.querySelector("#tarefas")
const campos = form.querySelectorAll("input, select")

let hoje = new Date().toLocaleDateString('pt-BR').split("/");
dataCadastroInput.value = hoje[2] + '-' + hoje[1] + '-' + hoje[0];
dataTerminoInput.value = hoje[2] + '-' + hoje[1] + '-' + hoje[0];


btn.addEventListener("click", (event) => {
    event.preventDefault();
    const criando = btn.getAttribute("act") == "criar"

    criando ? salvar() : atualizar()
})

const salvar = async () => {
    const newTarefa = {
        id: form.id.value,
        nome: form.nome.value,
        tipo: form.tipo.value,
        dataCadastro: form.dataCadastro.value,
        dataTermino: form.dataTermino.value,
        status: form.status.value
    }
    await api.post("/tarefas", newTarefa)
        .then(response => puxarTarefas())
        .catch(error => {
            alert("Ocorreu um erro ao criar a tarefa")
            console.error(error);
        })
}

const puxarTarefas = async () => {
    await api.get("/tarefas")
        .then(response => {
            table.innerHTML = `
            <tr>
                <th>Tarefa</th>
                <th>Tipo</th>
                <th>Termino</th>
                <th>Status</th>
                <th>Prazo</th>
                <th>Ações</th>
            </tr>`
            response.data.forEach(tarefa => {
                const newTarefa = new Tarefa(tarefa);
                table.appendChild(newTarefa.genHtml())
            })
        })
}
const editar = (tarefa) => {
    btn.innerHTML = '<i class="bx bx-pencil"></i> Editar Tarefa'
    campos[0].value = tarefa.nome
    campos[1].value = tarefa.tipo
    campos[2].value = tarefa.dataCadastro
    campos[3].value = tarefa.dataTermino
    campos[4].value = tarefa.status
    btn.id = tarefa.id
    btn.setAttribute("act", "editar")
}

const atualizar = async () => {
    const update = {
        nome: campos[0].value,
        tipo: campos[1].value,
        dataCadastro: campos[2].value,
        dataTermino: campos[3].value,
        status: campos[4].value
    }
    await api.put(`/tarefas/${btn.id}`, update)
        .then(response => {
            puxarTarefas()
            campos.forEach(campo => campo.value = '')
            btn.setAttribute("act", "criar")
        })
        .catch(error => {
            alert("Erro ao atualizar a tarefa!")
            console.error(error);
        })
}
puxarTarefas()