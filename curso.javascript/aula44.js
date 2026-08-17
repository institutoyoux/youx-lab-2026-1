const caixaCursos = document.querySelector("#caixaCursos")
const btn_c=[...document.querySelectorAll(".curso")]
const c1_2=document.querySelector("#c1_2")
const btnCursoSelecionado = document.querySelector("#btnCursoSelecionado")
const cursos = ["HTML", "CSS", "JavaScript", "PHP", "React", "MySQL", "ReactNative"]
const btnRemoverCurso = document.getElementById("btnRemoverCurso")
const btnAdicionarNovoCurso = document.querySelector("#btnAdicionarNovoCurso");

cursos.map((el,chave)=>{
    const novoElemento=document.createElement("div")
    novoElemento.setAttribute("id","c"+ chave)
    novoElemento.setAttribute("class","curso c1")
    novoElemento.innerText=el

    const comandos=document.createElement('div')
    comandos.setAttribute("class","comandos")

    const rb=document.createElement("input")
    rb.setAttribute("type","radio")
    rb.setAttribute("name","rb_curso")

    comandos.appendChild(rb)

    novoElemento.appendChild(comandos)

    caixaCursos.appendChild(novoElemento)

})

const radioSelecionado=()=>{
    const todosRadios=[...document.querySelectorAll("input[type=radio]")]
    const radioSelecionado=todosRadios.filter((ele,ind,arr)=>{
        return ele.checked
    })
    return radioSelecionado[0]
}

btnCursoSelecionado.addEventListener("click",(evt)=>{
    const rs = radioSelecionado()
    if(rs!=undefined) {
        const cursoSelecionado = rs.parentNode.previousSibling.textContent
        alert("Curso Selecionado: " + cursoSelecionado)
    }else{
        alert("Selecione um Curso")
    }
})

btnRemoverCurso.addEventListener("click",(evt)=> {
    const rs = radioSelecionado()
    if(rs!=undefined) {
        const cursoSelecionado=rs.parentNode.parentNode
        cursoSelecionado.remove()
        alert("Curso Removido: "+ cursoSelecionado.textContent)
    }else{
        alert("Selecione um Curso")
    }
})

//parentNode
//chilNodes[nodenumber]
//firsChild
//lastChild
//nexSibling
//previouSibling