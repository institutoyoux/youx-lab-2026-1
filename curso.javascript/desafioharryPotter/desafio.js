const personagens=document.getElementById("#container-personagens")

fetch('https://hp-api.onrender.com/api/characters')
.then(r=>r.json())
.then((dados)=>{
    for (const p of dados) {
        p_nome="Nome:" + p.name
        p_nasc="Data de Nascimento:" + p.dateOfBirth
        p_informacao="ID:" + p.id
        p_especie="Especie:" + p.species

        console.log(p_nome)
        console.log(p_nasc)
        console.log(p_informacao)
        console.log(p_especie)
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