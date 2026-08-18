class Tarefa{
  constructor(tarefa){
    this.nome= tarefa.nome
    this.tipo= tarefa.tipo
    this.dataCadastro= tarefa.inicio
    this.dataTermino= tarefa.final
    this.status= tarefa.status
  }
  gerarHTML(){
    const prazoTarefa = prazo(this.dataTermino);
    const tarefaLinha=document.createElement('tr')
    tarefaLinha.innerHTML=`<td class="colunaNome">${this.nome}</td><td class="colunaTipo">${this.tipo}</td>
      <td class="colunaInicio">${this.dataCadastro}</td><td class="colunaTermino">${this.dataTermino}</td>
      <td class="cinza coluna">${this.status}</td><td class="${prazoTarefa.cor} coluna">${prazoTarefa.text}</td>
      <button class="btnEditar">EDITAR</button><button class="btnExcluir" >EXCLUIR</button>`;
      const prazoTarefaEditar=prazoTarefa.querySelector('.btnEditar')
      prazoTarefaEditar.addEventListener('click',()=>{
        this.editar()
      })
      return tarefaLinha
  }
  editar(){
    alert('ai')
  }
}





const enviar = document.getElementById("enviar");
const form = document.getElementById("form");

function verificar() {
  const acao = enviar.getAttribute("acao");
  if (acao === "cadastrar") {
    cadastrar();
  } else {
    const idTarefa = enviar.getAttribute("idTarefa");
    editar(idTarefa);
  }
}

async function cadastrar() {
  enviar.innerHTML = "Criando...";
  const corpo = {
    nome: form.nome.value,
    tipo: form.tipo.value,
    dataCadastro: form.inicio.value,
    dataTermino: form.final.value,
    status: form.status.value,
  };
  try {
    const requisicao = await fetch("http://localhost:8080/tarefas", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(corpo),
    });
    carregarTarefa();
  } catch (error) {
    alert("ERRO ao criar tarefa");
  }
  enviar.innerHTML = "+ Cadastrar Tarefa";
}

async function editar(tarefa) {
    // document.getElementById('nome').value = 
    // document.getElementById('tipo').value = 
    // document.getElementById('inicio').value = 
    // document.getElementById('final').value = 
  //   document.getElementById('status').value = 
  //   const corpo = {
  //   nome: form.nome.value,
  //   tipo: form.tipo.value,
  //   dataCadastro: form.inicio.value,
  //   dataTermino: form.final.value,
  //   status: form.status.value,
  // };
  try {
    const requisicao = await fetch("http://localhost:8080/tarefas/" + tarefa.id, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(corpo),
    });
  } catch (error) {
    alert("ERRO ao atualizar tarefa");
  }
}

function prazo(data) {
  const hoje = new Date();
  const dataTarefa = new Date(data);
  if (hoje <= dataTarefa) {
    return { text: "EM DIA", cor: "verde" };
  } else {
    return { text: "ATRASADO", cor: "vermelho" };
  }
}

async function carregarTarefa() {
  try {
    const requisicao = await fetch("http://localhost:8080/tarefas", {
      method: "GET",
      headers: { "Content-Type": "application/json" },
    });

    const tarefas = await requisicao.json();
    const tabela = document.getElementById("tabela");
    tabela.innerHTML = "";

    tarefas.forEach((tarefa) => {
      const newTarefa=new Tarefa(tarefa)
      tabela.appendChild(newTarefa.gerarHTML());
    });
    permitirClicarExcluir()
  } catch (error) {
    console.log(error)
    alert("ERRO ao obter tarefas");
  }
}

async function excluir(id) {
    try{
        const requisicao = await fetch("http://localhost:8080/tarefas/"+id, {
        method: "DELETE",
        headers: { "Content-Type": "application/json" },
    });
    carregarTarefa()
    }catch(error){
        alert('ERRO ao excluir tarefa')
    }
}

function permitirClicarExcluir() {
  const btnExcluir = document.querySelectorAll('.btnExcluir')
  btnExcluir.forEach(btn=>{
    btn.addEventListener('click',()=>{
        excluir(btn.getAttribute('tarefaId'))
    })
  })
}

enviar.addEventListener("click", (evt) => {
  evt.preventDefault();
  verificar();
});

carregarTarefa();
