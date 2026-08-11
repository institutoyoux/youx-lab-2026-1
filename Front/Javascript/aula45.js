const caixaCurso = document.querySelector("#caixaCurso");
const btnRemoverCurso = document.querySelector("#btnRemoverCurso");
const btnAdicionarNovoCurso = document.querySelector("#btnAdicionarNovoCurso");
const btnAdicionarAntes = document.querySelector("#btnAdicionarAntes");
const btnAdicionarDepois = document.querySelector("#btnAdicionarDepois");
const btnCursosSelecionados = document.querySelector("#btnCursosSelecionados");
const nomeCurso= document.querySelector("#nomeCurso");

const cursos = [
    "HTML",
    "CSS",
    "JavaScript",
    "PHP",
    "React",
    "MySQL"
];
let indice = 0;

const criarNovoCurso = (curso) => {
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
    indice++;
    return novoElemento;
}

cursos.map((curso) => {
    criarNovoCurso(curso);
});
const radioSelecionado = () => {
    const todosRadios = [...document.querySelectorAll('input[type="radio"]')];
    const radiosSelecionado = todosRadios.filter((ele) => {
        return ele.checked;
    });
    return radiosSelecionado[0];
}
btnCursosSelecionados.addEventListener("click", () => {
    const rs = radioSelecionado();
    if (rs == undefined) {
        alert("Selecione um curso.");
        return;
    }
    const cursoSelecionado = rs.parentNode.previousSibling.textContent;
    alert("Curso selecionado: " + cursoSelecionado);
});

btnRemoverCurso.addEventListener("click", () => {
    const rs = radioSelecionado();
    if (rs == undefined) {
        alert("Selecione algum Curso");
        return;
    }
    const cursoSelecionado = rs.parentNode.parentNode;
    cursoSelecionado.remove();
});

btnAdicionarAntes.addEventListener("click", (evt) => {
    const rs = radioSelecionado();
    try{
        if(nomeCurso.value!="") {
            const cursoSelecionado = rs.parentNode.parentNode
            const novoCurso=criarNovoCurso(nomeCurso.value);
            caixaCurso.insertBefore(novoCurso,cursoSelecionado.nextSibling);
            alert(CursoSelecionado)
        }else{
            alert("Digite o nome do curso")
        }
    }catch (ex){
        alert("selecione algum curso")
    }
});

btnAdicionarDepois.addEventListener("click", (evt) => {
    const rs = radioSelecionado();
    try{
        if (nomeCurso.value!="") {
            const cursoSelecionado = rs.parentNode.parentNode
            const novoCurso = criarNovoCurso(nomeCurso.value);
            caixaCurso.insertBefore(novoCurso, cursoSelecionado.nextSibling);
        } else {
            alert("Digite o nome do curso")
        }
    }catch(ex){
        alert("selecione algum curso")
    }
});