package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImprimiEstudante {
    public void imprimiEstudante(Estudante estudante) {

        System.out.println("------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
