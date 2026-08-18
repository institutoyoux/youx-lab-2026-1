const caixaCurso = document.querySelector("#caixaCurso");
const btnRemoverCurso=document.querySelector("#btnRemoverCurso");
const btnAdicionarNovoCurso=document.querySelector("#btnAdicionarNovoCurso");
const btnAdicionarAntes = document.querySelector("#btnAdicionarAntes");
const btnAdicionarDepois = document.querySelector("#btnAdicionarDepois");

const cursos = [
    "HTML",
    "CSS",
    "JavaScript",
    "PHP",
    "React",
    "MySQL"
];

const btnCursosSelecionados = document.querySelector("#btnCursosSelecionados");

cursos.map((curso, indice) => {

    const novoElemento = document.createElement("div");
    novoElemento.id = "c" + indice;
    novoElemento.className = "curso c1";
    novoElemento.innerHTML = curso;

    const comandos = document.createElement("div");
    comandos.className = "comandos";

    const rb = document.createElement("input");
    rb.type = "radio";
    rb.name = "rb_curso";

    comandos.appendChild(rb);
    novoElemento.appendChild(comandos);
    caixaCurso.appendChild(novoElemento);

});

btnCursosSelecionados.addEventListener("click", (evt) => {
    const rs=radioSelecionado()
    console.log(rs)
        const cursoSelecionado=rs.parentNode.previousSibling.textContent
        alert("Curso selecionado" + cursoSelecionado)

})
const radioSelecionado = () =>{
    const todosRadios=[...document.querySelectorAll('input[type="radio"]')]
    const radiosSelecionado = todosRadios.filter((ele,ind,arr) => {
            return ele.checked;
    })
    return radiosSelecionado[0]
}

btnRemoverCurso.addEventListener("click", (evt) => {
    const rs=radioSelecionado()
    if(rs!=undefined){

    }else{
        alert("Selecione algum Curso")
    }
    const cursoSelecionado=rs.parentNode.parentNode
    cursoSelecionado.remove()

})
btnAdicionarAntes.addEventListener("click", (evt) => {

})
btnAdicionarDepois.addEventListener("click", (evt) => {

})
//parentNode
//chilNodes[nodenumber]
//firsChild
//lastChild
//nexSibling
//previouSibling