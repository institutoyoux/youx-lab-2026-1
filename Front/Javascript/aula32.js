const cursosTodos=[...document.getElementsByClassName('curso')]
const cursosC1=[...document.getElementsByClassName('C1')]
const cursosC2=[...document.getElementsByClassName('C2')]
const cursoExpecial=document.getElementsByClassName('curso')[6]

console.log(cursosTodos)
console.log(cursosC1)
console.log(cursosC2)
console.log(cursoExpecial)

cursosC1.map((el)=>{
    el.classList.add("destaques")
})