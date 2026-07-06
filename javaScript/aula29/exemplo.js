class Aluno {
    constructor(nome_completo,idade,cpf){
        this.primeiroNome = nome_completo[0];
        this.sobreNome = nome_completo[1];
        this.idade = idade;
        this.cpf = cpf;
    }

    getAnoNascimento(anoAtual){
        return anoAtual - this.idade;
    }

}

const meuAluno = new Aluno(["josé","silva"],30,1234)
const anoNascimento = meuAluno.getAnoNascimento(2026)

console.log(anoNascimento)