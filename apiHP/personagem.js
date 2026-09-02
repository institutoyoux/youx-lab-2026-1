const nome= document.getElementById("nome")
const genero=document.getElementById("genero")
const casa=document.getElementById("casa")
const especie=document.getElementById("especie")
const paltrono=document.getElementById("paltrono")
const btnVoltar=document.getElementById("btnVoltar")
const imgPersonagens=document.getElementById("imgPersonagens")


const containerPrincipal = document.getElementById("containerPrincipal")
const parametros= new URLSearchParams(window.location.search); 
console.log(parametros);


let id= parametros.get("id")
console.log(id);


const endpoint= `https://hp-api.onrender.com/api/character/${id}`
fetch(endpoint)
    .then(res=>res.json())
    .then(persona=>{
        
        console.log(persona[0].name)
    
        console.log(persona);
        imgPersonagens.setAttribute("src", persona[0].image)
        nome.innerHTML =`Nome: ${persona[0].name}` 
        genero.innerHTML=`Genero: ${persona[0].gender}` 
        casa.innerHTML= `Casa: ${persona[0].house}`
        especie.innerHTML= `Especie: ${persona[0].species}` 
        paltrono.innerHTML= `Paltrono: ${persona[0].patronus}`
        imgPersonagens.setAttribute("src", persona[0].image)



    })




// const pId = document.createElement("p")
// pId.innerText = id
// containerPrincipal.appendChild(pId)