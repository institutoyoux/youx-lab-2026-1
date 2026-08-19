const caixa1=document.querySelector("#caixa1")
const btn_c1=document.querySelector("#c1")//pegou a div c1
const cursos=[...document.querySelectorAll(".curso")]//pegou a div c1


caixa1.addEventListener("click",(evt)=>{
    console.log("clicou")
})

cursos.map((el)=>{
    el.addEventListener("click",(evt)=>{
        evt.stopPropagation()
    })
})//parou a propagação de todos eventos(.curso).

// //btn_c1.addEventListener("click",(evt)=>{
//     evt.stopPropagation()
// })//parou a propagação de UM evento(html).