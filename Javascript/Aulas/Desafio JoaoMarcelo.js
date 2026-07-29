const nomes = ["Ana", "alfredo", "Leo", "Julia", "João"]
const filtroA = (nome) => {
    return nome[0].toUpperCase() === "a".toUpperCase();
};
const nomesComA = nomes.filter(filtroA);

console.log(nomesComA);