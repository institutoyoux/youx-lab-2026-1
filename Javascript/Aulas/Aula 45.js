const caixaCursos = document.querySelector("#caixaCursos");
const btnRemoverCurso = document.querySelector("#btnRemoverCurso");
const btnCursoSelecionado = document.querySelector("#btnCursoSelecionado");

const cursos = [
    "HTML",
    "CSS",
    "JavaScript",
    "PHP",
    "React",
    "MySQL",
    "ReactNative"
];

const btnAdicionarNovoCursoAntes =
    document.getElementById("btnAdicionarNovoCursoAntes");

const btnAdicionarNovoCursoDepois =
    document.getElementById("btnAdicionarNovoCursoDepois");

const nomeCurso = document.getElementById("nomeCurso");


let indice = 0;


const criarNovoCurso = (curso) => {

    const novoElemento = document.createElement("div");

    novoElemento.setAttribute("id", "c" + indice);
    novoElemento.setAttribute("class", "curso");

    novoElemento.innerText = curso;


    const comandos = document.createElement("div");

    comandos.setAttribute("class", "comandos");


    const rb = document.createElement("input");

    rb.setAttribute("type", "radio");
    rb.setAttribute("name", "rb_curso");


    comandos.appendChild(rb);

    novoElemento.appendChild(comandos);


    return novoElemento;
};


cursos.map((el, chave) => {

    const novoElemento = criarNovoCurso(el);

    caixaCursos.appendChild(novoElemento);

    indice++;
});


const radioSelecionado = () => {

    const todosRadios = [
        ...document.querySelectorAll("input[type=radio]")
    ];

    const radioSelecionado = todosRadios.filter((ele, ind, arr) => {

        return ele.checked;

    });

    return radioSelecionado[0];
};


btnCursoSelecionado.addEventListener("click", (evt) => {

    const rs = radioSelecionado();

    if (rs != undefined) {

        const cursoSelecionado =
            rs.parentNode.previousSibling.textContent;

        alert("Curso Selecionado: " + cursoSelecionado);

    } else {

        alert("Selecione um Curso");
    }
});


btnRemoverCurso.addEventListener("click", (evt) => {

    const rs = radioSelecionado();

    if (rs != undefined) {

        const cursoSelecionado =
            rs.parentNode.parentNode;

        const nome =
            cursoSelecionado.textContent;

        cursoSelecionado.remove();

        alert("Curso Removido: " + nome);

    } else {

        alert("Selecione um Curso");
    }
});


btnAdicionarNovoCursoAntes.addEventListener("click", (evt) => {

    const rs = radioSelecionado();

    try {

        const cursoSelecionado =
            rs.parentNode.parentNode;

        const novoCurso =
            criarNovoCurso(nomeCurso.value);

        caixaCursos.insertBefore(
            novoCurso,
            cursoSelecionado
        );

        indice++;

    } catch (ex) {

        alert("Seleciona um curso ai ne");
    }
});


btnAdicionarNovoCursoDepois.addEventListener("click", (evt) => {

    const rs = radioSelecionado();

    try {

        const cursoSelecionado =
            rs.parentNode.parentNode;

        const novoCurso =
            criarNovoCurso(nomeCurso.value);

        caixaCursos.insertBefore(
            novoCurso,
            cursoSelecionado.nextSibling
        );

        indice++;

    } catch (ex) {

        alert("Seleciona um curso ai ne");
    }
});