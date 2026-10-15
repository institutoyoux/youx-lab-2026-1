const endpoint = "https://hp-api.onrender.com/api/characters";
fetch(endpoint)
  .then((resposta) => resposta.json())
  .then((personagens) => {
    const divPersonagens = document.getElementById("personagens");
    for (personagem of personagens) {
        const divPersonagem = document.createElement("div")
        divPersonagem.setAttribute("id", `${personagem.id}`)
        divPersonagem.setAttribute('class', 'personagem')

        const divImagens = document.createElement("div")
        const imgPersonagem = document.createElement("img")
        imgPersonagem.setAttribute("src", `${personagem.image}`)
        imgPersonagem.classList.add("image")
        divImagens.appendChild(imgPersonagem)
        divPersonagem.appendChild(divImagens)

        const p = document.createElement("p");
        p.setAttribute("id", "personagem");
        p.innerText = `Nome:${personagem.name}`;
        divPersonagem.appendChild(p)
        
        const u = document.createElement("p");
        u.setAttribute("patronus", "patronomo");
        u.innerText = `Patronus:${personagem.patronus}`;
        divPersonagem.appendChild(u)
        
        const g = document.createElement("p");
        g.setAttribute("gender", "gender");
        g.innerText = `Gender:${personagem.gender}`;
        divPersonagem.appendChild(g)
        
        const h = document.createElement("p");
        h.setAttribute("house", "house");
        h.innerText = `House:${personagem.house}`;
        divPersonagem.appendChild(h)

        divPersonagens.appendChild(divPersonagem)
    }
  })