const caixaCursos = document.querySelector("#caixaCursos");
const nomeCurso = document.querySelector("#nomeCurso");
const btnAdicionarNovoCurso = document.querySelector("#btnAdicionarNovoCurso");
const btnRemoverCurso = document.querySelector("#btnRemoverCurso");
const btnCursoSelecionado = document.querySelector("#btnCursoSelecionado");
const cursos = ["HTML", "CSS", "JavaScript", "PHP", "React", "MySQL", "ReactNative"];
const criarCurso = (nome) => {

    const novoCurso = document.createElement("div");
    novoCurso.setAttribute("class", "curso");

    const texto = document.createElement("span");
    texto.innerHTML = nome;

    const comandos = document.createElement("div");
    comandos.setAttribute("class", "comandos");

    const rb = document.createElement("input");
    rb.setAttribute("type", "radio");
    rb.setAttribute("name", "rb_curso");

    comandos.appendChild(rb);
    novoCurso.appendChild(texto);
    novoCurso.appendChild(comandos);

    caixaCursos.appendChild(novoCurso);
};

caixaCursos.innerHTML = "";
cursos.forEach((curso) => {
    criarCurso(curso);
});

btnAdicionarNovoCurso.addEventListener("click", () => {

    if (nomeCurso.value.trim() == "") {
        alert("Digite o nome do curso.");
        nomeCurso.focus();
        return;
    }
    criarCurso(nomeCurso.value);
    nomeCurso.value = "";
    nomeCurso.focus();
});

btnCursoSelecionado.addEventListener("click", () => {
    const radio = document.querySelector("input[name='rb_curso']:checked");

    if (!radio) {
        alert("Nenhum curso selecionado.");
        return;
    }
    const curso = radio.parentElement.parentElement.firstChild.innerHTML;
    alert(`Curso selecionado: ${curso}`);
});
btnRemoverCurso.addEventListener("click", () => {
    const radio = document.querySelector("input[name='rb_curso']:checked");
    if (!radio) {
        alert("Selecione um curso para remover.");
        return;
    }
    radio.parentElement.parentElement.remove();
});