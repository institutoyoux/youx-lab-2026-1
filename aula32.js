const cursosTodos=[...document.getElementsByClassName("curso")]
const cursosc1=[...document.getElementsByClassName("c1")]
const cursosc2=[...document.getElementsByClassName("c2")]
const cursoEspecial=document.getElementsByClassName("Curso")[6]

console.log(cursosTodos)
console.log(cursosc1)
console.log(cursosc2)
console.log(cursoEspecial)

cursosc2.map((el)=>{
    el.classList.add("destaque")//passar elemento por elemento e adiciono uma classe nesses elementos
})