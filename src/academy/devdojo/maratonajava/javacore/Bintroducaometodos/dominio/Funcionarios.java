package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionarios {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimirSalario(){
        System.out.println("-----------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
        for (double salario: salarios){
            System.out.print(salario + " ");
        }
        imprimiMediaSalario();
    }

    public void imprimiMediaSalario(){
        if(salarios == null){
            return;
        }
        double media = 0;
        for (double salario: salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial " + media);
    }
}
