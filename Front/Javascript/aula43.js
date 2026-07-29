const caixaCurso = document.querySelector("#caixaCurso");
const btn_c = [...document.querySelectorAll(".curso")];
const c1_2 = document.querySelector("#c1_2");

const cursos = [
    "HTML",
    "CSS",
    "JavaScript",
    "PHP",
    "React",
    "MySQL",
    "ReactNative"
];

const btnCursosSelecionados = document.getElementById("btnCursosSelecionados");

cursos.map((el, chave) => {
    const novoElemento = document.createElement("div");
    novoElemento.setAttribute("id", "c" + chave);
    novoElemento.setAttribute("class", "curso c1");
    novoElemento.innerHTML = el;

    const comandos = document.createElement("div");
    comandos.setAttribute("class", "comandos");

    const rb = document.createElement("input");
    rb.setAttribute("type", "radio");
    rb.setAttribute("name", "rb_curso");

    comandos.appendChild(rb);
    novoElemento.appendChild(comandos);
    caixaCurso.appendChild(novoElemento);
});

btnCursosSelecionados.addEventListener("click", () => {
    const todosRadios = document.querySelectorAll('input[type="radio"]');
    console.log(todosRadios);
});