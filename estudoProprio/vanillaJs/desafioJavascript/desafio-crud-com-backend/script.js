const btn = document.getElementById("btn");
let btnInner = '<i class="bx bx-plus"></i> Cadastrar Tarefa'
const form = document.getElementById("form");
const dataCadastro = document.getElementById("dataCadastro")
const dataTermino = document.getElementById("dataTermino")
const tabela = document.getElementById("tarefas");
let tarefas = [];

let hoje = new Date().toLocaleDateString('pt-BR').split("/");
dataCadastro.value = hoje[2] + '-' + hoje[1] + '-' + hoje[0];
dataTermino.value = hoje[2] + '-' + hoje[1] + '-' + hoje[0];

btn.addEventListener('click', (event) => {
    event.preventDefault();
    if (btn.getAttribute("act") === "criar") {
        criar()
    } else {
        salvar()
    }
})
const limparInputs = () => {
    form.nome.value = ''
    form.status.value = 'NAO_INICIADO'
    form.tipo.value = 'TRABALHO'
    dataCadastro.value = hoje[2] + '-' + hoje[1] + '-' + hoje[0];
    dataTermino.value = hoje[2] + '-' + hoje[1] + '-' + hoje[0];
}
const criar = async () => {
    btn.innerHTML = 'Criando...';
    if (!form.nome.value || !form.status.value || !form.tipo.value || !dataCadastro.value || !dataTermino.value) {
        alert("Dados invalidos!")
        return btn.innerHTML = btnInner;
    }
    await axios.post('http://localhost:8080/tarefas', { "dataCadastro": dataCadastro.value, "dataTermino": dataTermino.value, "nome": form.nome.value, "status": form.status.value, "tipo": form.tipo.value })
    btn.innerHTML = btnInner;
    limparInputs();
    listar();
}

const salvar = async (id) => {
    btn.innerHTML = 'Editando...';
    if (!form.nome.value || !form.status.value || !form.tipo.value || !dataCadastro.value || !dataTermino.value) {
        alert("Dados invalidos!")
        return btn.innerHTML = btnInner;
    }
    await axios.put('http://localhost:8080/tarefas/' + btn.getAttribute('idTarefa'), { "dataCadastro": dataCadastro.value, "dataTermino": dataTermino.value, "nome": form.nome.value, "status": form.status.value, "tipo": form.tipo.value })
    btn.innerHTML = btnInner;
    limparInputs();
    listar();
}

const status = (respostaApi) => {
    if (respostaApi === "NAO_INICIADO") {
        return { texto: "Não iniciado", cor: "#475569" }
    }
    if (respostaApi === "ANDAMENTO") {
        return { texto: "Em andamento", cor: "#0369A1" }
    }
    if (respostaApi === "FINALIZADO") {
        return { texto: "Finalizado", cor: "#15803D" }
    }
}

const editar = (tarefa) => {
    btn.setAttribute('act', 'editar')
    btn.setAttribute('idTarefa', tarefa.id)
    btn.innerHTML = '<i class="bx bx-pencil"></i> Editar Tarefa'
    form.nome.value = tarefa.nome
    form.status.value = tarefa.status
    form.tipo.value = tarefa.tipo
    dataCadastro.value = tarefa.dataCadastro
    dataTermino.value = tarefa.dataTermino
}

const deletar = async (id) => {
    const req = await axios.delete('http://localhost:8080/tarefas/' + id);
    listar();
}

const listar = async () => {
    tabela.innerHTML = `
            <tr>
                <th>Tarefa</th>
                <th>Tipo</th>
                <th>Termino</th>
                <th>Status</th>
                <th>Prazo</th>
                <th>Ações</th>
            </tr>`;
    const req = await axios.get('http://localhost:8080/tarefas')
    tarefas = req.data;
    tarefas.forEach(tarefa => {
        const statusFormatado = status(tarefa.status)
        const atrasado = new Date() <= new Date(tarefa.dataTermino)
        let data = tarefa.dataTermino.split("-")
        const linha = document.createElement('tr');
        linha.innerHTML = `
            <td>${tarefa.nome}</td>
            <td>${tarefa.tipo}</td>
            <td>${data[2] + '/' + data[1] + '/' + data[0]}</td>
            <td>
                <div style="background-color: ${statusFormatado.cor};">${statusFormatado.texto}</div>
            </td>
            <td>
                <div style="background-color: ${atrasado ? '#15803D;' : 'red'}">${atrasado ? 'Em dia' : 'Atrasado'}</div>
            </td>
        `
        const campos = document.createElement('td');
        campos.setAttribute('class', 'campos')
        const del = document.createElement('button');
        const edit = document.createElement('button');
        edit.addEventListener('click', () => editar(tarefa))
        edit.innerText = 'Editar'
        campos.appendChild(edit);

        del.addEventListener('click', () => deletar(tarefa.id))
        del.innerText = 'Deletar'
        del.style.backgroundColor = 'red';
        campos.appendChild(del)
        linha.appendChild(campos)


        tabela.appendChild(linha);
    });
}
listar();