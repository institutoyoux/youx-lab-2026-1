const cursosTodos=[...document.getElementsByClassName('curso')]
const cursoC1=[...document.getElementsByClassName('c1')]
const cursoC2=[...document.getElementsByClassName('c2')]
const cursoEspecial=document.getElementsByClassName('curso')[0]

console.log(cursosTodos)
console.log(cursoC1)
console.log(cursoC2)
console.log(cursoEspecial)

cursoC1.map((el)=>{
    el.classList.add("destaque")
})

cursoC2.map((el)=>{
    el.classList.add("destaqueC2")
})