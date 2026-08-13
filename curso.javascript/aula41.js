const caixa1=document.querySelector("#caixa1");
const btn_c=[...document.querySelectorAll(".curso")]
const c1_2=document.querySelector("#c1_2");
const cursos=["HTML","CSS","Javascript","PHP","React","MySQL"]

cursos.map((el,chave)=>{
    const novoElemento=document.createElement("div")
    novoElemento.setAttribute("id","c"+chave)
    novoElemento.setAttribute("class","curso c1")
    novoElemento.innerHTML=el

    const btn_lixeira=document.createElement("img")
    btn_lixeira.setAttribute("src","./54324.png")
    btn_lixeira.setAttribute("class","btn_lixeira")
    novoElemento.appendChild(btn_lixeira)

    novoElemento.addEventListener("click",(evt)=>{
        caixa1.removeChild(evt.target.parentNode)
    })
    caixa1.appendChild(novoElemento)
})