const nomeT = document.getElementById("nomeT")
const dataC = document.getElementById("dataC")
const dataT = document.getElementById("dataT")
const tipo = document.getElementById("tipo")
const status = document.getElementById("status")
const btn_cadastrar = document.getElementById("btn-cadastrar")
const corpo_tabela = document.getElementById("corpo_tabela")

function limpar(){
    nomeT.value = ""
    dataC.value = ""
    dataT.value = ""
    tipo.value = ""
    status.value = ""
}

btn_cadastrar.addEventListener("click", (evt) => {

    evt.preventDefault()
    const dataCadastro = new Date(dataC.value)
    const dataTermino = new Date(dataT.value)
    const nomeTarefa = nomeT.value
    const tipoTarefa = tipo.value
    const statusTarefa = status.value

    const dataAtual = new Date()

    const linha = document.createElement("tr")

    const colunaNome = document.createElement("td")
    colunaNome.innerText = nomeTarefa
    linha.appendChild(colunaNome)


    const colunaTipo = document.createElement("td")
    colunaTipo.innerText = tipoTarefa
    linha.appendChild(colunaTipo)

    const colunaCadastro = document.createElement("td")
    colunaCadastro.innerText = dataCadastro.toLocaleDateString('pt-BR')
    linha.appendChild(colunaCadastro)

    const colunaTermino = document.createElement("td")
    colunaTermino.innerText = dataTermino.toLocaleDateString('pt-BR')
    linha.appendChild(colunaTermino)

    const colunaStatus = document.createElement("td")
    colunaStatus.innerText = statusTarefa
    switch (statusTarefa) {
        case "FINALIZADO":
            colunaStatus.setAttribute("class", "status_finalizado")
            break;
        case "EM ANDAMENTO":
            colunaStatus.setAttribute("class", "status_emAndamento")
            break;
        case "NÃO INICIADO":
            colunaStatus.setAttribute("class", "status_naoIniciado")
            break;
    }
    linha.appendChild(colunaStatus)

    const colunaPrazo = document.createElement("td")
    if ((statusTarefa == "FINALIZADO") || (dataTermino > dataAtual)) {

        colunaPrazo.innerText = "EM DIA"
        colunaPrazo.setAttribute("class", "prazo_emdia")
    }
    else {
        colunaPrazo.innerText = "ATRASADO"
        colunaPrazo.setAttribute("class", "prazo_atrasado")
    }
    linha.appendChild(colunaPrazo)


    const colunaAcoes = document.createElement("td")

    const botaoDeletar = document.createElement("button")
    botaoDeletar.innerHTML = "DELETAR"
    botaoDeletar.setAttribute("class", "btn_deletar")
    colunaAcoes.appendChild(botaoDeletar)

    const botaoEditar = document.createElement("button")
    botaoEditar.innerHTML = "EDITAR"
    botaoEditar.setAttribute("class", "btn_editar")
    colunaAcoes.appendChild(botaoEditar)
    linha.appendChild(colunaAcoes)
    
    botaoDeletar.addEventListener("click", (evt) => {
        linha.remove()
        // console.log(nomeTarefa);
        
    })
    
    botaoEditar.addEventListener("click", (evt) => {
        nomeT.value = nomeTarefa
        dataC.value = dataCadastro.toLocaleDateString('sv-SE')
        dataT.value = dataTermino.toLocaleDateString('sv-SE')
        tipo.value = tipoTarefa
        status.value = statusTarefa
        linha.remove()
        btn_cadastrar.innerText = "ATUALIZAR"
    })

    corpo_tabela.appendChild(linha) // faz mostrar na tabela
    btn_cadastrar.innerText = " + CADASTRAR TAREFA "
    limpar()
})