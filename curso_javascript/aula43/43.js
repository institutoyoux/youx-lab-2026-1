const caixaCurso=document.querySelector("#caixaCursos")
const btn_c=[...document.querySelectorAll(".curso")]
const c1_2=document.querySelector("#c1_2")
const cursos=["HTML", "CSS", "Javascript", "PHP", "React", "MySQL", "ReactNative"]
const btnCursoSelecionado=document.getElementById("btnCursoelecionados")

cursos.map((el,chave)=>{
    const novoElemento=document.createElement("div")
    novoElemento.setAttribute("id", "c"+chave)
    novoElemento.setAttribute("class","curso c1")
    novoElemento.innerHTML=el

    const comandos=document.createElement("div")
    comandos.setAttribute("class", "comandos")

    const rb=document.createElement("input")
    rb.setAttribute("type","radio")
    rb.setAttribute("name","rb_cursos")

    comandos.appendChild(rb)

    novoElemento.appendChild(comandos)

    caixaCurso.appendChild(novoElemento)

})

btnCursoSelecionado.addEventListener("click",(evt)=>{
    const todosRadios=[...document.querySelectorAll("input[type=radio]")]
    let radioSelecionado=todosRadios((ele,ind,arr)=>{
        return ele.checked
    })
    radioSelecionado=radioSelecionado[0]
    // const Cursoelecionados=radioSelecionado.parentNode.parentNode.firstChild.textContent
    const Cursoelecionados=radioSelecionado.parentNode.previousSibling
    alert("Curso selecionado: " + Cursoelecionados)
   // console.log(todosRadios)
    //console.log(radioSelecionado)
    //console.log(Cursoelecionados)
})