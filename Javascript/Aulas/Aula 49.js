const p_array=document.querySelector("#array")
const txt_pesquisar=document.querySelector("#txt_pesquisar")
const btnVerificar=document.querySelector("#btnVerificar")
const resultado=document.querySelector("#resultado")

const elementos_array=[19,5,3,8,1]
p_array.innerHTML="["+elementos_array+"]"

btnVerificar.addEventListener("click",(evt)=>{
    const ret=elementos_array.some((e,i)=>{
        if(e<18){
            resultado.innerHTML="Array não na posição " +i
        }
        return e>=18
    })
    if(ret){
        resultado.innerHTML="OK"
    }
    console.log(ret)
})