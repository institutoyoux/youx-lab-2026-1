const caixaCurso = document.querySelector("#caixaCurso");
const btnRemoverCurso = document.querySelector("#btnRemoverCurso");
const btnAdicionarNovoCurso = document.querySelector("#btnAdicionarNovoCurso");
const btnAdicionarAntes = document.querySelector("#btnAdicionarAntes");
const btnAdicionarDepois = document.querySelector("#btnAdicionarDepois");
const btnCursosSelecionados = document.querySelector("#btnCursosSelecionados");
const nomeCurso = document.querySelector("#nomeCurso");

const cursos = [
    "𝙃𝙏𝙈𝙇"
    , "𝘾𝙎𝙎"
    , "𝙅𝙖𝙫𝙖𝙎𝙘𝙧𝙞𝙥𝙩"
    , "𝙋𝙃𝙋"
    , "𝙍𝙚𝙖𝙘𝙩"
    , "𝙈𝙮𝙎𝙌𝙇"];
let indice = 0;

const tirarSelecao=()=>{
    const cursoSelecionado=[...document.querySelectorAll(".selecionado")]
    cursoSelecionado.map((el)=>{
        el.classList.remove("selecionado")
    })
}

const criarNovoCurso = (curso, adicionarNaLista = false) => {
    const novoElemento = document.createElement("div");
    novoElemento.id = "c" + indice;
    novoElemento.className = "curso c1";
    novoElemento.innerHTML = curso;
    novoElemento.addEventListener("click",(evt)=>{
        tirarSelecao()
        evt.target.classList.toggle("selecionado")
    })

    if (adicionarNaLista) {
        caixaCurso.appendChild(novoElemento);
    }

    indice++;
    return novoElemento;
}
cursos.map((curso) => {
    criarNovoCurso(curso, true);
});

const cursoSelecionado = () => {
    const cursosSelecionado = [...document.querySelectorAll(".selecionado")]
    return cursosSelecionado[0];
}

btnCursosSelecionados.addEventListener("click", (evt) => {
    try {
        alert("Curso selecionado: " + cursoSelecionado().innerHTML);
    }catch(ex) {
        alert("Selecione um curso")
    }
});

btnRemoverCurso.addEventListener("click", () => {
    const cs = cursoSelecionado();
    if (cs != undefined) {
      cs.remove()
    }else{
        alert("Selecione um curso")
    }

});

btnAdicionarAntes.addEventListener("click", (evt) => {
    try {
        if (nomeCurso.value!=""){
            const novoCurso = criarNovoCurso(nomeCurso.value);
            caixaCurso.insertBefore(novoCurso, cursoSelecionado());

        }else{
            alert("Digite o nome do curso");
        }
    } catch (ex) {
        alert("Seleciona um curso");
    }
});

btnAdicionarDepois.addEventListener("click", (evt) => {
    try {
        if (nomeCurso.value!="") {
            const novoCurso = criarNovoCurso(nomeCurso.value);
            caixaCurso.insertBefore(novoCurso, cursoSelecionado().nextSibling);

        }else {
            alert("Digite o nome do curso");
        }
    }catch (ex) {
        alert("selecione algum curso");
    }
});