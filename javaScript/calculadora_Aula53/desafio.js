function atualizar(event) {
  event.preventDefault();
}

const form = document.getElementById("form");

const valor1 = document.getElementById("valor1");
const valor2 = document.getElementById("valor2");

const btnSoma = document.getElementById("btnSoma");
const btnSubtrair = document.getElementById("btnSubtrair");
const btnMultiplicar = document.getElementById("btnMultiplicar");
const btnDividir = document.getElementById("btnDividir");
const btnPotencia = document.getElementById("btnPotencia");
const caixa3 = document.querySelector("#caixa3");
const resultado = document.querySelector("#res");

function limparInput() {
  document.getElementById("valor1").value = "";
  document.getElementById("valor2").value = "";
}

btnSoma.addEventListener("click", (evt) => {
  evt.preventDefault();
  const num1 = Number(valor1.value);
  const num2 = Number(valor2.value);
  resultado.value = num1 + num2;
  limparInput();
});

btnSubtrair.addEventListener("click", (evt) => {
  evt.preventDefault();
  const num1 = Number(valor1.value);
  const num2 = Number(valor2.value);
  resultado.value = num1 - num2;
  limparInput();
});

btnMultiplicar.addEventListener("click", (evt) => {
  evt.preventDefault();
  const num1 = Number(valor1.value);
  const num2 = Number(valor2.value);
  resultado.value = num1 * num2;
  limparInput();
});

btnDividir.addEventListener("click", (evt) => {
  evt.preventDefault();
  const num1 = Number(valor1.value);
  const num2 = Number(valor2.value);
  resultado.value = num1 / num2;
  limparInput();
});

btnPotencia.addEventListener("click", (evt) => {
  evt.preventDefault();
  const num1 = Number(valor1.value);
  const num2 = Number(valor2.value);
  let res = 1;
  for (let i = 0; i < num2; i++) {
    res *= num1
  }
  resultado.value=res
  limparInput()
})