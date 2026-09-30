const teclasnum=[...document.querySelectorAll(".num")]
const teclasOp=[...document.querySelectorAll(".op")]
const teclasRes=document.querySelector(".res")
const display=document.querySelector(".display")
const ton=document.getElementById("ton")
const tlimpar=document.getElementById("tlimpar")

teclasnum.forEach((el)=>{
    el.addEventListener("click",(evt)=>{
        display.innerHTML+=evt.target.innerHTML

    })
})
teclasOp.forEach((el)=>{
    el.addEventListener("click",(evt)=>{
        display.innerHTML+=evt.target.innerHTML

    })
})

tlimpar.addEventListener("click",(evt)=>{
    display.innerHTML="0"
})