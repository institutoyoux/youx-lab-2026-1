function capturarValor() {
    var nome = document.getElementById("name").value;
    var sobrenome = document.getElementById("lastname").value;
    var email = document.getElementById("email").value;
    var senha = document.getElementById("senha").value;

    console.log("Nome: " + nome + " " + sobrenome);
    console.log("Email: " + email);
    console.log("Senha: " + senha);
}
