const objs=document.querySelectorAll("div")

let num=[10,20,30,40,50,100]

for(o of objs){
    console.log(o.innerHTML="curso")
}

for(o in objs){
    console.log(objs[o].innerHTML)
}
console.log(objs)
console.log(num)