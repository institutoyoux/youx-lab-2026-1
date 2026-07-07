// const query_divTodas=[...document.querySelectorAll('div[class]')]
const query_divTodas=[...document.querySelectorAll('div > p')]
const query_cursosTodos=[...document.querySelectorAll('.curso')]
const query_queryC1=[...document.querySelectorAll('.c1,p')]
const query_queryC2=[...document.querySelectorAll('.c2')]
// const query_cursoEspecial=document.querySelectorAll('#c1')
const query_cursoEspecial=document.querySelectorAll('#c1')[0]

console.log(query_divTodas)
console.log(query_cursosTodos)
console.log(query_queryC1)
console.log(query_queryC2)
console.log(query_cursoEspecial)