const divTodas=[...document.getElementsByTagName("div")]
const cursosTodos=[...document.getElementsByClassName("curso")]
const cursosc1=[...document.getElementsByClassName("c1")]
const cursosc2=[...document.getElementsByClassName("c2")]
const cursoEspecial=document.getElementsByClassName("Curso")

//const query_divTodas=[...document.querySelectorAll("div[class]")]
const query_divTodas=[...document.querySelectorAll("div > p")]
const query_cursosc1=[...document.querySelectorAll(".c1,p")]
const query_cursosc2=[...document.querySelectorAll(".c2")]
//const query_cursoEspecial=document.querySelectorAll("#c1")[0]
const query_cursoEspecial=document.querySelectorAll("#c1")[0]

console.log(query_divTodas)
// console.log(query_cursosc2)

// console.log(divTodas)
// console.log(cursosTodos)
// console.log(cursosc1)
// console.log(cursosc2)
// console.log(cursoEspecial)

// cursosc2.map((el)=>{
//     el.classList.add("destaque")//passar elemento por elemento e adiciono uma classe nesses elementos
// })