let tarefas = [
];

const sectionTarefas = document.getElementById("tarefas");

const compararDatas = (data1) => {
    data1 = new Date(data1);
    data2 = new Date();
    if (data1 > data2) {
        return 'Em dia';
    } else if (data1 == data2) {
        return 'Vence hoje!'
    }
    return 'Atrasada'
}
const listar = (tarefas) => {
    sectionTarefas.innerHTML = '';
    tarefas.forEach((tarefa) => {
        const newTarefa = document.createElement("div");
        const id = tarefa.id;
        newTarefa.setAttribute("id", id);
        newTarefa.setAttribute("class", "tarefa")
        const btn = `<button class="check sucess"><i class='bx bx-check'></i></button>`;
        let com = tarefa.status === "completed";
        newTarefa.innerHTML = `
        ${com ? btn : `
        <button class="check" onclick="check(this, '${id}')"></button>`} 
        <div><span>${tarefa.name}</span><p>${com ? '' : compararDatas(tarefa.date)}</p></div>
        <i onclick="abrirMenu('${tarefa.id}', '${tarefa.name}', '${tarefa.date}', '${tarefa.status}')" class='act bx bxs-pencil'></i>
        <i onclick="excluirTarefa(${tarefa.id})" class='act bx bxs-trash-alt'></i>
    `;
        sectionTarefas.appendChild(newTarefa);
    })
}


const check = (button, id) => {
    tarefas.forEach((tarefa) => {
        if (tarefa.id == id) {
            tarefa.status = 'completed';
            button.innerHTML = "<i class='bx bx-check'></i>"
            button.setAttribute('class', 'check sucess')
        }
    })
}
const fechar = (id) => {
    document.getElementById(id).style.display = 'none';
}

const allStatus = ['nStarted', 'pending', 'completed'];
const selecionar = (status) => {
    allStatus.forEach((id) => {
        if (id != status) {
            document.getElementById(id).removeAttribute('select')
        } else {
            document.getElementById(id).setAttribute('select', 'true')
        }
    })
}

const criarTarefa = (evento) => {
    evento.preventDefault();
    const nome = document.getElementById("nome").value;
    if (!nome) {
        return
    }
    const type = document.getElementById("tipo").value;
    const data = document.getElementById("data").value;
    const status = document.querySelectorAll("[select]")[0].id;
    const newTarefa = { id: tarefas.length, name: nome, type: type, date: data, status: status }
    tarefas.push(newTarefa);
    listar(tarefas);
    document.getElementById('form').style.display = 'none';
}
const editar = (event, id) => {
    event.preventDefault();
    const form = document.getElementById('form');
    const nome = document.getElementById("nome").value;
    const type = document.getElementById("tipo").value;
    const data = document.getElementById("data").value;
    const status = document.querySelectorAll("[select]")[0].id;
    tarefas.forEach((tarefa) => {
        if (tarefa.id == id) {
            tarefa.name = nome;
            tarefa.type = type;
            tarefa.date = data;
            tarefa.status = status;
            form.remove()
            listar(tarefas)
        }
    })
}
const excluirTarefa = (id) => {
    tarefas = tarefas.filter(tarefa => tarefa.id != id);
    listar(tarefas);
}

listar(tarefas)

const abrirMenu = (id, nome, data, status) => {
    let menu;
    if (nome && data && status) {
        menu = `
        <div class="top"><h1>Editar tarefa</h1> <i onclick="fechar('form')" class="bx bx-x"></i></div>
        <label>Nome:</label>
        <input type="text" id="nome" value='${nome}'/>
        <label>Tipo:</label>
        <select id="tipo">
            <option>Trabalho</option>
            <option>Estudo</option>
            <option>Pessoal</option>
            <option>Outro</option>
        </select>
        <label>Vencimento:</label>
        <input type="date" value="${data}" id="data">
        <div class="status">
            <span id="nStarted" onclick="selecionar(this.id)" select>Não iniciado</span>
            <span id="pending" onclick="selecionar(this.id)">Em andamento</span>
            <span id="completed" onclick="selecionar(this.id)">Finalizado</span>
        </div>
        <button class="submit">Salvar tarefa</button>`;
    } else {
        menu = `
        <div class="top"><h1>Criar tarefa</h1> <i onclick="fechar('form')" class="bx bx-x"></i></div>
        <label>Nome:</label>
        <input type="text" id="nome" />
        <label>Tipo:</label>
        <select id="tipo">
            <option>Trabalho</option>
            <option>Estudo</option>
            <option>Pessoal</option>
            <option>Outro</option>
        </select>
        <label>Vencimento:</label>
        <input type="date" value="2026-07-16" id="data">
        <div class="status">
            <span id="nStarted" onclick="selecionar(this.id)" select>Não iniciado</span>
            <span id="pending" onclick="selecionar(this.id)">Em andamento</span>
            <span id="completed" onclick="selecionar(this.id)">Finalizado</span>
        </div>
        <button class="submit">Criar tarefa</button>`;

    }
    const form = document.createElement('form');
    form.setAttribute("class", 'add');
    form.setAttribute('id', 'form');
    form.setAttribute('onsubmit', !nome ? 'criarTarefa(event)' : `editar(event, ${id})`);
    form.innerHTML = menu;
    const later = document.getElementById('form')
    later ? later.remove() : null;
    document.body.appendChild(form)
}
abrirMenu()