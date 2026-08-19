const caixa1=document.querySelector("#caixa1")
const btn_c=[...document.querySelectorAll(".curso")]

const c1_2=document.querySelector("#c1_2")
console.log(c1_2.parentElement)//retorna div pai
console.log(c1_2.parentNode.parentNode.children[4])//retorna a div pai e div do pai aí retorna completo, children=filho a posicao taç
// console.log(caixa1.hasChildNodes())
// console.log(btn_c[0].hasChildNodes())
// console.log(btn_c[0].childNodes)

// if(caixa1.children.lenght > 0){//se caixa1 for maior ele retorna
//     console.log("Possui filhos")
// }else{
//     console.log("NÃO possui filhos")
// }

// console.log(caixa1.children.length > 0 ? "Possui filhos" : "Não possui filhos")
// console.log(caixa1.firstElementChild.innerHTML="TESTE")//ele retorna a div e dessa div mudar o inner