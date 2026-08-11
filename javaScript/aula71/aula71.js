const teclasNum=[...document.querySelectorAll('.num')]
const teclasOp=[...document.querySelectorAll('.op')]
const teclaRes=document.querySelector('.res')
const display=document.querySelector('.display')
const tOn=document.getElementById('ton')
const tLimpar=document.getElementById('tlimpar')


teclasNum.forEach((el)=>{
    el.addEventListener('click',(evt)=>{
        display.innerHTML+=evt.target.innerHTML
    })
})

teclasOp.forEach((el)=>{
    el.addEventListener('click',(evt)=>{
        display.innerHTML+=evt.target.innerHTML
    })
})

tLimpar.addEventListener('click',(evt)=>{
    display.innerHTML='0'
})