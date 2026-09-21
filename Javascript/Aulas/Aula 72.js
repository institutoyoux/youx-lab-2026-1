const teclasNum=[...document.querySelectorAll(".num")]
const teclasOp=[...document.querySelectorAll(".teclaOp")]
const teclasRes=document.querySelector(".res")
const display=document.querySelector(".display")
const ton=document.getElementById("ton")
const tlimpar=document.getElementById("tlimpar")
const tigual=document.getElementById("tigual")

let sinal=false
let decima = false

teclasNum.forEach((el)=>{
    el.addEventListener("click",(evt)=>{
        sinal=false
        if (evt.target.innerHTML == ",") {
            if (!decima) {
                decima = true
                if (display.innerHTML == "0") {
                    display.innerHTML = "0,"
                } else {
                    display.innerHTML += evt.target.innerHTML
                }
            }
        }else{
            if(display.innerHTML == "0"){
                display.innerHTML = ""
            }
            display.innerHTML += evt.target.innerHTML
        }
    })
})
teclasOp.forEach((el)=>{
    el.addEventListener("click",(evt)=>{
        if (!sinal){
            sinal = true
            if (display.innerHTML == "0"){
                display.innerHTML = ""
            }
            if (evt.target.innerHTML == "x"){
                display.innerHTML += "*"
            }else {
                display.innerHTML += evt.target.innerHTML
            }
        }
    })
})
tlimpar.addEventListener("click",(evt)=>{
    sinal = false
    decima = false
    display.innerHTML="0"
})

tigual.addEventListener("click",(evt)=>{
    sinal = false
    decima = false
    const res=eval(display.innerHTML)
    display.innerHTML=res
})


