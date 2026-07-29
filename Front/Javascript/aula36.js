const caixa1 = document.querySelector("#caixa1");
const caixa2 = document.querySelector("#caixa2");
const btn = document.querySelector("#btn_transferir");

const todosCursos = [...document.querySelectorAll(".curso")];

todosCursos.forEach((el) => {
    el.addEventListener("click", (evt) => {
        evt.target.classList.toggle("selecionados");
    });
});
btn.addEventListener("click", () => {
    const cursosSelecionados = [...document.querySelectorAll(".selecionados")];
    cursosSelecionados.forEach((curso) => {
        curso.classList.remove("selecionados");
        if (curso.parentElement.id === "caixa1") {
            caixa2.appendChild(curso);
        } else {
            caixa1.appendChild(curso);
        }
    });
});