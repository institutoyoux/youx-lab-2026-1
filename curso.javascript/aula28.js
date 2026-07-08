// MAP vai interar toda a coleçao.
//map se usa pra percorrer valores


/*
const cursos=['HTML, CSS', 'Javascript', 'PHP', 'React']
cursos.map((el,i)=>{
    console.log("Curso:" + el + " - Posiçao do curso:" + i)
})
*/

/*
const cursos=['HTML','CSS','Javascript','PHP','React']
let c=cursos.map((el,i)=>{
    return "<div>"+el+"</div>"
})

console.log(c)
*/


// let elemento=document.getElementsByTagName('div')
// elemento=[...elemento]
// elemento.map((e, i)=>{
//     console.log(e.innerHTML)
// })



//const cursos=['HTML','CSS','Javascript','PHP','React']
//let c=cursos.map((el,i)=>{
//    return el
//})
//console.log(c)


// let elemento=document.getElementsByTagName("div")
// elemento=[...elemento]
// console.log(elemento)
// elemento.map((e,i)=>{
//     e.innerHTML="CFB Cursos"
// })


// const elemento=document.getElementsByTagName("div")
// const valores=Array.prototype.map.call(el,({innerHTML})=>innerHTML)
// console.log(valores)

const converterInt=(elemento)=>parseInt(elemento)
const dobrar=(elemento)=>elemento*2
let num=['1','2','3','4','5'].map(dobrar)
console.log(num)

