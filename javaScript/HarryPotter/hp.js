async function Personagem() {
    
  const resposta = await fetch("https://hp-api.onrender.com/api/characters");
  const personagens = await resposta.json();
  const container = document.getElementById("container");

  personagens.forEach((personagem) => {
    const caixa1 = document.createElement("div");
    caixa1.setAttribute("id", personagem.id);
    caixa1.setAttribute("class", "personagem");
    caixa1.innerHTML = `
        <img src=${personagem.image}></img>
        <p>${personagem.name}</p>
        <a href="http://127.0.0.1:5500/HarryPotter/hp2.html?id=${personagem.id}" id="btnMais">More information</a>
        `;
        
    container.appendChild(caixa1);

    const btnMais = document.getElementById("btnMais");
  });
}

Personagem();