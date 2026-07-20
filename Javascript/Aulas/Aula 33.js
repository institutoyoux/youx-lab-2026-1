const divTodas=[...document.getElementsByTagName("div")]
const cursoTodos=[...document.getElementsByClassName("curso")]
const cursoC1=[...document.getElementsByClassName("c1")]
const cursoC2=[...document.getElementsByClassName("c2")]
const cursoEspecial=document.getElementById("c1")

//const query_divTodas=[...document.querySelectorAll("div[class]")]
const query_divTodas=[...document.querySelectorAll("div > p")]
const query_cursoTodos=[...document.querySelectorAll(".curso")]
const query_cursosC1=[...document.querySelectorAll(".c1,p")]
const query_cursosC2=[...document.querySelectorAll(".c2")]
//const query_cursoEspecial=document.querySelectorAll("#c1")
const query_cursoEspecial=document.querySelectorAll("#c1")[0]

console.log(divTodas)
// console.log(cursoTodos)
// console.log(cursoc1)
// console.log(cursoc2)
//console.log(cursoEspecial)
// cursoC1.map((el)=>{
//     el.classList.add("destaque")
// })