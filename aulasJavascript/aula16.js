const objs=document.getElementsByTagName("div") 

let num=[10,20,30,40,50]

//for(let i=0;i<num.length;i++){
//    console.log(num[i])
//}

//length---> percorrer o numero de elementos 

for(n in objs){
    console.log(objs[n].innerHTML)     //----> pegar elementos
}

for(n of objs){ 
    console.log(n.innerHTML="Curso" )     //---> pegar posicoes
    //console.log(n)
}