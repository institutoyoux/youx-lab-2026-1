const table = document.querySelector("#tarefas");
const btn = document.getElementById("btn");
const form = document.querySelector("form")
let idEditando = false;
btn.addEventListener("click", (e) => {
    e.preventDefault();
    idEditando ? editar(idEditando) : salvar()
})

class Tarefa {
    constructor(id, nome, tipo, dataCadastro, dataTermino, status) {
        this.id = id
        this.nome = nome
        this.tipo = tipo
        this.dataCadastro = dataCadastro
        this.dataTermino = dataTermino
        this.status = status
        this.estaEmDia = new Date(dataTermino) >= new Date()
    }
}


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


const tarefaService = {
    criar(tarefa) {
        return new Tarefa(
            tarefa.id,
            tarefa.nome,
            tarefa.tipo,
            tarefa.dataCadastro,
            tarefa.dataTermino,
            tarefa.status
        )
    },
    gerarHtml(tarefa) {
        const estaEmDia = tarefa.estaEmDia ? ['#15803D', 'Em dia'] : ['red', 'Atrasada']
        const tr = document.createElement("tr")
        tr.innerHTML = `
        <td class="nome"></td>
        <td class="tipo"></td>
        <td class="data"></td>
        <td class="status">
        <div></div>
        </td>
        <td class="emDia">
        <div style="background-color: ${estaEmDia[0]}">${estaEmDia[1]}</div>
        </td>
        <td class="campos">
        <button class="editBtn">Editar</button>
        <button class="delBtn">Deletar</button>
        </td>
        `
        tr.querySelector(".delBtn").addEventListener("click", () => {
            apiService.deletar(tarefa.id)
        })
        tr.querySelector(".editBtn").addEventListener("click", () => {
            idEditando = tarefa.id
            btn.innerHTML = '<i class="bx bx-pencil"></i> Editar tarefa'
            form.nome.value = tarefa.nome
            form.tipo.value = tarefa.tipo
            form.dataCadastro.value = tarefa.dataCadastro
            form.dataTermino.value = tarefa.dataTermino
            form.status.value = tarefa.status
        })
        tr.querySelectorAll("td").forEach(td => {
            switch (td.className) {
                case 'nome':
                    td.innerText = tarefa.nome
                    break

                case 'tipo':
                    td.innerText = tarefa.tipo
                    break

                case 'data':
                    td.innerText = tarefa.dataTermino.split("-").slice().reverse().join("/")
                    break

                case 'status':
                    td.querySelector("div").innerText = statusDici[tarefa.status].texto
                    td.querySelector("div").style.backgroundColor = statusDici[tarefa.status].cor
                    break
                case 'campos':
                break
                default: ''
            }
        })
        return tr;
    }
}

const api = axios.create({
    baseURL: "http://localhost:8080",
})

const apiService = {
    puxarTarefas() {
        table.innerHTML = `
            <tr>
                <th>Tarefa</th>
                <th>Tipo</th>
                <th>Termino</th>
                <th>Status</th>
                <th>Prazo</th>
                <th>Ações</th>
            </tr>`
        api.get("/tarefas")
            .then(response => {
                response.data.forEach(tarefa => {
                    table.appendChild(tarefaService.gerarHtml(tarefaService.criar(tarefa)))
                })
            })
            .catch(error => {
                alert("Erro ao obter as tarefas")
                console.error(error);
            })
    },
    criar(tarefa) {
        api.post("/tarefas", tarefa)
            .then(respose => this.puxarTarefas())
            .catch(error => {
                alert("Erro ao criar a tarefa!")
                console.error(error);
            })
    },
    atualizar(id, tarefa) {
        api.put("/tarefas/"+id, tarefa)
            .then(respose => this.puxarTarefas())
            .catch(error => {
                alert("Erro ao atualizar a tarefa!")
                console.error(error);
            })
    },
    deletar(id) {
        api.delete("/tarefas/"+id)
        .then(response => this.puxarTarefas())
        .catch(error => {
            alert("Erro ao deletar a tarefa!")
            console.error(error);
        })
    }
}
const limparInputs = () => {
    const hoje = new Date().toLocaleDateString('pt-BR').split("/");
    const hojeFormatado = hoje[2] + '-' + hoje[1] + '-' + hoje[0];
    form.nome.value = ''
    form.tipo.value = 'TRABALHO'
    form.dataCadastro.value = hojeFormatado
    form.dataTermino.value = hojeFormatado
    form.status.value = 'NAO_INICIADO'
}
const salvar = () => {
    const newTarefa = {
        nome: form.nome.value,
        tipo: form.tipo.value,
        dataCadastro: form.dataCadastro.value,
        dataTermino: form.dataTermino.value,
        status: form.status.value
    }
    apiService.criar(newTarefa)
    limparInputs()
}
const editar = (idTarefa) => {
    const updateTarefa = {
        nome: form.nome.value,
        tipo: form.tipo.value,
        dataCadastro: form.dataCadastro.value,
        dataTermino: form.dataTermino.value,
        status: form.status.value
    }
    apiService.atualizar(idTarefa, updateTarefa)
    idEditando = false
    limparInputs()
}
apiService.puxarTarefas()
limparInputs()