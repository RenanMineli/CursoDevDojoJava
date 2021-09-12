package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios02 {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimiSalario(){
        System.out.println(nome);
        System.out.println(idade);
        for (double salario: salarios){
            System.out.print(salario + " ");
        }
    }

}
