const btnAdicionarTarefa = document.getElementById("btnAdicionarTarefa")

btnAdicionarTarefa.addEventListener("click", (evt)=>{
    const nomeTarefaInput = document.getElementById("nomeTarefa")
    const dataCadastroInput = document.getElementById("dataCadastro")
    const dataTerminoInput = document.getElementById("dataTermino")
    const tipoInput = document.getElementById("tipo")
    const statusInput = document.getElementById("status")
    const corpoTabela = document.getElementById("corpoTabela")
    
    const linha = document.createElement("tr")
    
   
    const colunaNome = document.createElement("td")
    colunaNome.textContent = nomeTarefaInput.value;
    linha.appendChild(colunaNome)
    
    console.log(tipoInput.value);
    const colunaTipo = document.createElement("td")
    colunaTipo.textContent = tipoInput.value;
    linha.appendChild(colunaTipo)
    
    const colunaDataCadastro = document.createElement("td")
    colunaDataCadastro.textContent = dataCadastroInput.value;
    linha.appendChild(colunaDataCadastro)

    const colunaDataTermino = document.createElement("td")
    colunaDataTermino.textContent = dataTerminoInput.value;
    linha.appendChild(colunaDataTermino)

    const colunaStatus = document.createElement("td")
    const colunaStatusTexto = document.createElement("p")
    
    colunaStatusTexto.textContent = statusInput.value;
    colunaStatusTexto.classList.add("etiqueta")

    switch (statusInput.value) {
        case "Em andamento":
            colunaStatusTexto.classList.add("emAndamento")
            break;

        case "Não iniciado":
            colunaStatusTexto.classList.add("naoIniciado")
            break;

        case "Finalizado":
            colunaStatusTexto.classList.add("finalizado")
            break;

        default:
            colunaStatusTexto.style.backgroundColor = 'black'
            break;
    }

    colunaStatus.appendChild(colunaStatusTexto)
    linha.appendChild(colunaStatus)
    
    const colunaPrazo = document.createElement("td")
    const colunaPrazoTexto = document.createElement("p")

    let dataAtual = new Date()
    let dataTermino = new Date(dataTerminoInput.value)
    
    if (dataTermino < dataAtual){
        colunaPrazoTexto.textContent = "Atrasado";
        colunaPrazoTexto.classList.add("atrasado")
    }else{
        colunaPrazoTexto.textContent= "Em dia";
        colunaPrazoTexto.classList.add("emDia")
    }
    
    colunaPrazoTexto.classList.add("etiqueta")

    colunaPrazo.appendChild(colunaPrazoTexto)

    linha.appendChild(colunaPrazo)

    const colunaBotoes = document.createElement("td")

    const btnEditar = document.createElement("button")
    btnEditar.textContent = "Editar"
    btnEditar.classList.add("botaoEditar")


    btnEditar.addEventListener("click", function(){
        nomeTarefaInput.value = colunaNome.textContent
        tipoInput.value = colunaTipo.textContent
        dataCadastroInput.value = colunaDataCadastro.textContent
        dataTerminoInput.value = colunaDataTermino.textContent
        statusInput.value = colunaStatus.textContent

        linha.remove()

        btnAdicionarTarefa.textContent = "+ Confirmar edição"
    }) 

    const btnDeletar = document.createElement("button")
    btnDeletar.textContent = "Deletar"
    btnDeletar.classList.add("botaoDeletar")

    btnDeletar.addEventListener("click", function(){
        linha.remove()
    })


    const divAcoes= document.createElement("div")
    divAcoes.classList.add("colunaAcoes")

    divAcoes.appendChild(btnEditar)
    divAcoes.appendChild(btnDeletar)

    colunaBotoes.appendChild(divAcoes)

    linha.appendChild(colunaBotoes)

    corpoTabela.appendChild(linha)

    btnAdicionarTarefa.textContent = "+ Cadastrar Tarefa"

})