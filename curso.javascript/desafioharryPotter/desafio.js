fetch('https://hp-api.onrender.com/api/characters')
    .then(r => r.json())
    .then((dados) => {
    const personagens = document.getElementById("container-personagens")
        for (let personagem of dados) {
            const card=document.createElement("a")
            card.className = "card"
            
            card.setAttribute("href", "/desafioharryPotter/personagem.html?id=" + personagem.id)


            const nome = document.createElement("div")
            const nascimento = document.createElement("div")
            const especie = document.createElement("div")
            const imagem = document.createElement("img")
           


            nome.innerHTML = "Nome: " + personagem.name
            nascimento.innerHTML = "Nascimento: " + personagem.dateOfBirth,
            especie.innerHTML = "Especie: " + personagem.species
            

            imagem.src=personagem.image 


            card.appendChild(nome)
            card.appendChild(nascimento)
            card.appendChild(especie)
            card.appendChild(imagem)
            personagens.appendChild(card)


        }
    })














// {
//     "id": "9e3f7ce4-b9a7-4244-b709-dae5c1f1d4a8",
//     "name": "Harry Potter",
//     "alternate_names": [
//       "The Boy Who Lived",
//       "The Chosen One",
//       "Undesirable No. 1",
//       "Potty"
//     ],
//     "species": "human",
//     "gender": "male",
//     "house": "Gryffindor",
//     "dateOfBirth": "31-07-1980",
//     "yearOfBirth": 1980,
//     "wizard": true,
//     "ancestry": "half-blood",
//     "eyeColour": "green",
//     "hairColour": "black",
//     "wand": {
//       "wood": "holly",
//       "core": "phoenix tail feather",
//       "length": 11
//     },
//     "patronus": "stag",
//     "hogwartsStudent": true,
//     "hogwartsStaff": false,
//     "actor": "Daniel Radcliffe",
//     "alternate_actors": [],
//     "alive": true,
//     "image": "https://ik.imagekit.io/hpapi/harry.jpg"
//   }