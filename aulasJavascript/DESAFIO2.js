
let corpoTabela = document.getElementById("corpoTabela")
let nomeTarefa = document.getElementById("nomeDaTarefa")
let TipoTarefa = document.getElementById("tipo")
let dataDeCadastro = document.getElementById("dataDeCadastro")
let dataParaTermino = document.getElementById("dataDeTermino")
let statusTarefa = document.getElementById("status")
let btnCadastrarTarefa = document.getElementById("btnCadastrarTarefa")

const tarefas = []

function limparInputs() {
    nomeTarefa.value = ""
    document.getElementById('tipo').value = "Selecione..."
    dataDeCadastro.value = ""
    dataParaTermino.value = ""
    document.getElementById('status').value = "Selecione..."
}

btnCadastrarTarefa.addEventListener("click", (evt) => {      // criou um evento pro botão, quando ele ser clicado, aparecerá todos os valores que foi declarado                                                          //     
    const nome = document.getElementById("nomeDaTarefa").value
    const tipo = document.getElementById("tipo").value
    if (nome === "" || tipo === "Selecione..." | dataDeCadastro === "" | dataParaTermino === "" | statusTarefa === "Selecione..." ){
        alert ("preencha todos os campos para conseguir cadastrar ")
       return
    }



    const dataAtual = new Date()
    const dataTermino = new Date(dataParaTermino.value)

    const novaTarefa =
    {
        "nome": nomeTarefa.value,
        "tipo": TipoTarefa.value,
        "termino": dataParaTermino.value,
        "status": statusTarefa.value,
        "prazo": dataTermino > dataAtual ? "Em Dia" : "Atrasado"
    }

    tarefas.push(novaTarefa)

    console.log(tarefas);



    const linha = document.createElement("tr")  // criou uma linha 
    
    for (const chave in novaTarefa) {                            // roda por todas chaves da novaTarefa
        let valor = novaTarefa[chave];                         // pega o valor da chave atual     
        let coluna = document.createElement("td")            // cria um novo td
        coluna.innerText = valor                            // adiciona o valor como texto interno do td
        linha.appendChild(coluna)                           // adiciona o "td" como filho da linha 
    }

    limparInputs() 

    let acoes = document.createElement("td")  //criei um td 

    let btnEditar = document.createElement("button") // criei um elemento botao
    btnEditar.setAttribute("class", "btn-editar") // criei uma classe p button
    btnEditar.textContent = "Editar" // usei o textContent pra dar o nome ao botao 

    let btnExcluir = document.createElement("button")
    btnExcluir.setAttribute("class", "btn-deletar")
    btnExcluir.textContent = "Excluir"


    btnExcluir.addEventListener("click", function () {       //dando uma função pro botao 
        linha.remove()
    })

    btnEditar.addEventListener("click", function () {
        nomeTarefa.value = novaTarefa.nome
        TipoTarefa.value = novaTarefa.tipo
        dataDeCadastro.value = novaTarefa.dataDeCadastro
        dataParaTermino.value = novaTarefa.termino
        statusTarefa.value = novaTarefa.status

        linha.remove()


    })


    acoes.appendChild(btnEditar)     //adicionando os botoes dentro de acoes   
    acoes.appendChild(btnExcluir)

    linha.appendChild(acoes)            //adicionando os elementos acoes, dentro da linha
    corpoTabela.appendChild(linha)      //aqui os elementos da linha, está entrando dentro da tabela

})


