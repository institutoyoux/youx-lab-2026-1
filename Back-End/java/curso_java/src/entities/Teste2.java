package entities;

public class Teste2 {
    private String nome;
    private int idade;
    private double altura;
    private String name;
    private double price;
    private double numero;

    public Teste2(String name, double price, String nome, int idade, double altura, double numero){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.name = name;
        this.price = price;
        this.numero = numero;
    }

    public Teste2(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getNumero(){
        return numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumero(double numero){
        this.numero = numero;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

