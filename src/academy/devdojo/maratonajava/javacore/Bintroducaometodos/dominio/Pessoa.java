package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public void imprimi(){
        System.out.println(getNome());
        System.out.println(getIdade());
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
