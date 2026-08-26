
// Objeto que representa uma tarefa.
// Pense nele como uma ficha com os dados que serão enviados para a API.
const corpo = {
  nome: "opa",
  tipo: "TRABALHO",
  dataCadastro: "2011-01-19",
  dataTermino: "2027-02-23",
  status: "FINALIZADO",
};

// Função responsável por CRIAR uma tarefa no servidor.
const req_post = async () => {
  try {
    // fetch = "vai lá no servidor e faz uma requisição"
    const requisicao = await fetch(
      "http://192.168.3.249:8080/tarefas",
      {
        method: "POST", // POST = enviar/criar dados
        headers: {
          // Estamos avisando que vamos enviar um JSON
          "Content-Type": "application/json",
        },

        // Converte o objeto JavaScript para texto JSON
        body: JSON.stringify(corpo),
      }
    );

    // Pega a resposta do servidor e transforma em objeto JS
    return await requisicao.json();
  } catch (error) {
    // Se der qualquer erro, mostra um alerta
    alert("Deu erro aqui paezão");
  }
};

// Função responsável por DELETAR uma tarefa.
const req_del = async (id) => {
  try {
    // id é o identificador da tarefa.
    // Exemplo:
    // id = 5
    // URL final:
    // http://192.168.3.249:8080/tarefas/5
    const requisicao = await fetch(
      "http://192.168.3.249:8080/tarefas/" + id,
      {
        method: "DELETE", // DELETE = apagar algo
        headers: {
          "Content-Type": "application/json",
        },
      }
    );

  } catch (error) {
    alert("Deu erro aqui paezão");
  }
};

// Função responsável por BUSCAR todas as tarefas.
const req_get = async () => {
  try {

    // Faz uma requisição para buscar os dados
    const requisicao = await fetch(
      "http://192.168.3.249:8080/tarefas",
      {
        method: "GET", // GET = pegar informações
        headers: {
          "Content-Type": "application/json",
        },
      }
    );

    // Converte a resposta da API para objeto JavaScript
    return requisicao.json();

  } catch (error) {
    alert("Deu erro aqui paezão");
  }
};

/*
RESUMO DOS MÉTODOS HTTP:

GET    -> buscar dados
POST   -> criar dados
PUT    -> atualizar tudo
PATCH  -> atualizar só uma parte
DELETE -> apagar dados
*/


// Função responsável por mostrar as tarefas na tela.
const renderizarAPI = async () => {

  // Espera a API devolver todas as tarefas
  const tarefas = await req_get();

  // Percorre cada tarefa recebida
  tarefas.forEach((tarefa) => {

    // Cria uma tag <p>
    const novaLinha = document.createElement("p");

    // Coloca o nome da tarefa dentro da tag
    // e cria um botão para deletar a tarefa
    novaLinha.innerHTML =
      `Nome: ${tarefa.nome}
       <button onclick="req_del('${tarefa.id}')">
         Deletar
       </button>`;

    // Adiciona a tag criada no final do body da página
    document.body.appendChild(novaLinha);
  });
};

/*
O que acontece quando renderizarAPI() é executada?

1. req_get() busca as tarefas na API.
2. A API devolve uma lista de tarefas.
3. forEach percorre essa lista uma por uma.
4. Para cada tarefa:
   - cria um <p>
   - escreve o nome da tarefa
   - cria um botão "Deletar"
5. O <p> é colocado na página.

Exemplo:

API devolve:

[
  { id: 1, nome: "Estudar" },
  { id: 2, nome: "Treinar" }
]

Resultado na tela:

Nome: Estudar [Deletar]
Nome: Treinar [Deletar]

Se clicar em "Deletar" da tarefa Estudar:

req_del(1)

A API recebe:

DELETE http://192.168.3.249:8080/tarefas/1

E apaga a tarefa de id 1.
*/
