const caixaCurso=document.querySelector("#caixaCursos")
const btn_c=[...document.querySelectorAll(".curso")]
const c1_2=document.querySelector("#c1_2")
const cursos=["HTML", "CSS", "Javascript", "PHP", "React", "MySQL", "ReactNative"]
const btnCursoSelecionado=document.getElementById("btnCursoSelecionado")
const btnRemoverCurso=document.getElementById("btnRemoverCurso")
const btnAdicionarNovoCursoAntes=document.getElementById("btnAdicionarNovoCursoAntes")
const btnAdicionarNovoCursoDepois=document.getElementById("btnAdicionarNovoCursoDepois")
const nomeCurso=document.getElementById("nomeCurso")

let indice = 0;

const tirarSelecao=()=>{
    const cursoSelecionados=[...document.querySelectorAll(".selecionado")]
    cursoSelecionados.map((el)=>{
        el.classList.remove("selecionado")
    })
}
    
const criarNovoCurso=(curso)=>{
    const novoElemento=document.createElement("div")
    novoElemento.setAttribute("id", "c"+indice)
    novoElemento.setAttribute("class","curso c1")
    novoElemento.innerHTML=curso
    novoElemento.addEventListener("click",(evt)=>{
        evt.target.classList.toggle("selecionado")
    })
    return novoElemento
}

cursos.map((el,chave)=>{
    const novoElemento = criarNovoCurso(el)
    caixaCurso.appendChild(novoElemento)
    indice++

})

const cursosSelecionado=()=>{
    const todosRadios=[...document.querySelectorAll("input[type=radio]")]
    return cursosSelecionado[0]
}

btnCursoSelecionado.addEventListener("click",(evt)=>{
    try{
        alert("Curso selecionado: " + cursosSelecionado().innerHTML)
    }catch(ex){
        alert("Selecione um curso")
    }
})

btnRemoverCurso.addEventListener("click",(evt)=>{
    const cs=cursosSelecionado
    if(cs!=undefined){
        cs.remove()
    }else{
        alert("Selecione um curso")
    }
})

btnAdicionarNovoCursoAntes.addEventListener("click",(evt)=>{
        try{
        if(nomeCurso.value!=""){
            const novoCurso=criarNovoCurso(nomeCurso.value)
            caixaCurso.insertBefore(novoCurso,cursosSelecionado())
        }else{
            alert("Digite o nome do curso!")
        }
    }catch(ex){
        alert("Selecione um curso!")
    }
})

btnAdicionarNovoCursoDepois.addEventListener("click",(evt)=>{
    try{
        if(nomeCurso.value!=""){
            const novoCurso=criarNovoCurso(nomeCurso.value)
            caixaCurso.insertBefore(novoCurso,cursosSelecionado().nextSibling)
        }else{
            alert("Digite o nome do curso!")
        }
    }catch(ex){
        alert("Selecione um curso!")
    }
})
