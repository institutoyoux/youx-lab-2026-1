const caixaCurso = document.querySelector("#caixaCurso");

const cursos = [
    "HTML",
    "CSS",
    "JavaScript",
    "PHP",
    "React",
    "MySQL",
    "ReactNative"
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

btnCursosSelecionados.addEventListener("click", () => {

    const todosRadios = [...document.querySelectorAll('input[type="radio"]')];
    const radioSelecionados = todosRadios.filter((radio) => {
        return radio.checked;
    });
    radioSelecionado=radioSelecionados[0]
    //const cursoSelecionado=radioSelecionado.parentNode.parentNode.firstChild.textContent
    const cursoSelecionado=radioSelecionado.parentNode.previousSibling.textContent
    alert("Curso selecionado: " + cursoSelecionado)
    // console.log(todosRadios);
    // console.log(radioSelecionados);
    // console.log(radioSelecionados);

});