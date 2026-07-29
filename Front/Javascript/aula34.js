//const c1=document.getElementById("c1")
//const c1=document.querySelector("#c1")
const cursos=[...document.querySelectorAll('.curso')]

cursos.map((el)=>{
    el.addEventListener('click',(evt)=>{
        const el=evt.target
        el.classList.toggle('destaque');
        console.log(el.id + " foi clicado")
    })
})

// [c1.addEventListener("click",(evt)=>{
//     const el=evt.target
//     el.classList.toggle("destaque")
//
// })]