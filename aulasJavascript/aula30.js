//html ----> raiz / root
// |--> head
// | --> body 
//        |div ----> "id"
//        |script     



const dc1=document.getElementById('c1')  //----> pegar o Elementento pelo id
const dc2=document.getElementById('c2')
const dc3=document.getElementById('c3')
const dc4=document.getElementById('c4')
const dc5=document.getElementById('c5')
const dc6=document.getElementById('c6')

const arrayElementos=[dc1,dc2,dc3,dc4,dc5,dc6]

//for(d of arrayElementos)
    //d.innerHTML="cfb cursos"

arrayElementos.map((e)=>{
    e.innerHTML="cfb cursos"
    console.log(e)
})

// quando quiser percorrer e iterar todos os elementos, de preferencia ao map, por ser mais facil e moderno


//console.log(arrayElementos)

//console.log(dc1)
//console.log(dc1.id)
//console.log(dc1.innerHTML)
//dc1.innerHTML="cfb cursos"