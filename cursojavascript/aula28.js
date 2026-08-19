// const cursos=['HTML','CSS','Javascript','PHP','React']
// cursos.map((el,i)=>{
// console.log("Curso: " + el + " - Posição do curso: " + i)
// })

// const cursos=['HTML','CSS','Javascript','PHP','React']
// let c=cursos.map((el,i)=>{
//     return "<div>"+el+"</div>"
// })

// console.log(c)

// let el=document.getElementsByName("div")
// el=[...el]
// console.log(el)
// el.map((e,i)=>{
//     e.innerHTML="CBF Cursos"
// })

// const el=document.getElementsByName("div")
// cons val=Array.prototype.map.call(el,({innerHTML})=>innerHTML)
// console.log(val)

// const converterInt=(e)=>parseInt(e)
// let num=['1','2','3','4','5']
// num.map(converterInt)
// console.log(num)

const converterInt=(e)=>parseInt(e)
const dobrar=(e)=>e*2
let num=['1','2','3','4','5'].map(dobrar)
console.log(num)