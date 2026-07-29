function tarefa(event) {
    event.preventDefault()

}

const btnCadastrar = document.getElementById('criarTarefa')


const caixa3 = document.getElementById('caixa3')

function limparInput() {
    document.getElementById('nome').value = ""
    document.getElementById('tipo').value = "SELECIONE..."
    document.getElementById('inicio').value = ""
    document.getElementById('final').value = ""
    document.getElementById('status').value = "SELECIONE..."
}



let tarefas = []

let linhaEditando = null
let idEditando = null

limparInput()

btnCadastrar.addEventListener('click', () => {
    const form = document.getElementById('form')
    if (!form.nome.value || !form.inicio.value || !form.final.value || !form.tipo.value) {
        alert('Digite as informações')
        return
    }
    if (form.inicio.value > form.final.value) {
        alert('Data inválida')
        return
    }
    if (form.status.value == 'SELECIONE...' || form.tipo.value == 'SELECIONE...') {
        alert('Digite as informações')
        return
    }
    const tabela = document.getElementById('tabela')
    const novaLinha = document.createElement('tr')

    const colunaNome = document.createElement('td')
    colunaNome.innerText = form.nome.value
    colunaNome.setAttribute('class', 'colunaNome')
    novaLinha.appendChild(colunaNome)
    // tabela.appendChild(novaLinha)

    const colunaTipo = document.createElement('td')
    colunaTipo.innerText = form.tipo.value
    colunaTipo.setAttribute('class', 'colunaTipo')
    novaLinha.appendChild(colunaTipo)
    // tabela.appendChild(novaLinha)

    const colunaInicio = document.createElement('td')
    colunaInicio.innerText = form.inicio.value
    colunaInicio.setAttribute('class', 'colunaInicio')
    novaLinha.appendChild(colunaInicio)
    // tabela.appendChild(novaLinha)

    const colunaTermino = document.createElement('td')
    colunaTermino.innerText = form.final.value
    colunaTermino.setAttribute('class', 'colunaTermino')
    novaLinha.appendChild(colunaTermino)
    // tabela.appendChild(novaLinha)

    const colunaStatus = document.createElement('td')
    colunaStatus.innerText = form.status.value
    colunaStatus.setAttribute('class', 'colunaStatus')
    colunaStatus.setAttribute('id', 'coluna')
    if (form.status.value == 'EM ANDAMENTO') {
        colunaStatus.setAttribute('class','azul')
    } else if (form.status.value == 'NÃO INICIADO') {
        colunaStatus.setAttribute('class','cinza')
    } else if (form.status.value == 'FINALIZADO') {
        colunaStatus.setAttribute('class','verde')
    }
    novaLinha.appendChild(colunaStatus)

    tarefas.push({ id: tarefas.length + 1, nome: form.nome.value, inicio: form.inicio.value, final: form.final.value, status: form.status.value, tipo: form.tipo.value })


    let prazo = ""
    const hoje = new Date()
    const dataTarefa = new Date(form.final.value)
    const colunaPrazo = document.createElement('td')
    if (hoje <= dataTarefa) {
        prazo = 'EM DIA'
        colunaPrazo.setAttribute('class','verde')
    } else {
        prazo = 'ATRASADO'
        colunaPrazo.setAttribute('class','vermelho')
    }
    colunaPrazo.innerText = prazo
    colunaPrazo.setAttribute('id', 'coluna')
    novaLinha.appendChild(colunaPrazo)
    novaLinha.setAttribute('id', tarefas.length)
    // tabela.appendChild(novaLinha)

    const btnEditar = document.createElement('button')
    btnEditar.setAttribute('id', 'btnEditar')
    btnEditar.innerText = 'EDITAR'
    novaLinha.appendChild(btnEditar)
    // tabela.appendChild(novaLinha)

    const btnExcluir = document.createElement('button')
    btnExcluir.setAttribute('id', 'btnExcluir')
    btnExcluir.innerText = 'EXCLUIR'
    novaLinha.appendChild(btnExcluir)
    // tabela.appendChild(novaLinha)

    btnExcluir.addEventListener('click', () => {
        novaLinha.remove()
    })



    btnEditar.addEventListener('click', () => {

        btnCadastrar.innerText = "ATUALIZAR"
        tarefas.forEach(tarefa => {

            if (tarefa.id == btnEditar.parentNode.id) {
                btnCadastrar.innerText = 'ATUALIZAR'
                document.getElementById('nome').value = tarefa.nome

                document.getElementById('tipo').value = tarefa.tipo

                document.getElementById('status').value = tarefa.status

                document.getElementById('inicio').value = tarefa.inicio

                document.getElementById('final').value = tarefa.final
                // const linhaAntiga = btnEditar.parentNode.id
                // linhaAntiga.replaceWith(novaLinha)
                novaLinha.remove()

                
            }
        })
    })
    tabela.appendChild(novaLinha)
    limparInput()
    btnCadastrar.innerText= '+ Cadastrar Tarefa'
})