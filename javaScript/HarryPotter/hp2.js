async function Informacoes() {
  const parametros = window.location.search;
  const id = parametros.replace("?id=", "");
  const resposta = await fetch(
    `https://hp-api.onrender.com/api/character/${id}`,
  );
  const informacoes = await resposta.json();
  const container = document.getElementById("container");

  const caixa1 = document.createElement("div");
  caixa1.setAttribute("class", "informacoes");
  caixa1.innerHTML = `
        <div>
            <img src=${informacoes[0].image}></img>
        </div>
        <div>
            <h2>${informacoes[0].name}</h2>
            <p>Gender: ${informacoes[0].gender}</p>
            <p>Specie:: ${informacoes[0].species}</p>
            <p>House: ${informacoes[0].house}</p>
            <p>Ancestry: ${informacoes[0].ancestry}</p>
            <p>Patronus: ${informacoes[0].patronus}</p>
            <a href="http://127.0.0.1:5500/hp.html">Back</a>
        </div>
        `;
  container.appendChild(caixa1);
}

Informacoes();
