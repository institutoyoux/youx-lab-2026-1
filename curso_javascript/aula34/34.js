//const c1=document.getElementById("c1")
//const c1=document.querySelector("#c1")
const cursos=[...document.querySelectorAll(".cursos")]

cursos.map((el)=>{
    el.addEventListener("click",(evt)=>{
        const el=evt.target
        el.classList.add("destaque")
        console.log(el.innerHTML + " foi clicado ");
    })
})

/* function msg(){
     alert("clicou")
} */

// c1.addEventListener("click",(evt)=>{
//     const el=evt.target
//     el.classList.add("destaque")
// })