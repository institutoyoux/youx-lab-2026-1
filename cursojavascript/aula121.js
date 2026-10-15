const f_texto=document.querySelector("#f_texto")
const p_texto=document.querySelector("#p_texto")
const btn_texto=document.querySelector("#btn_texto")

btn_texto.addEventListener("click",(evt)=>{

})

let num=10
const curso="Javascript"
//window.localStorage.setItem("numero",num)
// localStorage.setItem("nome","Bruno")
// localStorage.setItem("canal","CBF Cursos")
// localStorage.setItem("curso",curso)
// alert(localStorage.length)
// alert(localStorage.key(0))//o que esta na posicao 0
// alert(localStorage.getItem("nome"))
// alert(localStorage.getItem("canal"))
// alert(localStorage.getItem("curso"))
localStorage.clear()

sessionStorage.setItem("nome","Bruno")
sessionStorage.setItem("canal","CBF Cursos")
sessionStorage.setItem("curso",curso)


// localStorage.setItem("numero",num)
// localStorage.setItem("numero",33)
//alert(localStorage.getItem("numero"))//o alert mostra o valor da chave numero 