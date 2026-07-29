const caixa1=document.querySelector('#caixa1')
const btn_c1=document.querySelector('#c1')
const cursos=[...document.querySelectorAll('.curso')]

caixa1.addEventListener('click', (evt)=>{
    caixa1.classList.toggle('active')
    console.log('clicou')
    console.log(evt)
})

cursos.map((el)=>{
  el.addEventListener('click', (e)=>{
      evt.stopPropagation()
  })
})