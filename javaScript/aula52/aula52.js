const caixa=document.querySelector('#caixa')

let cores=['azul','verde','vermelho',['claro','escuro','médio']]
let cursos=['HTML','JavaScript','CSS',cores]

// cursos.push('C++') adicionar ao final
// cursos.push('C#')
// cursos.unshift('Java') adicionar ao topo
// cursos.shift() remover a linha do topo
// cursos.pop() serve para excluir a ultima linha
// cursos.pop()
// cursos.pop()
// cursos.pop()

console.log(cursos[3][3][2])

cursos.map((el)=>{
    let p=document.createElement('p')
    p.innerHTML=el
    caixa.appendChild(p)
})