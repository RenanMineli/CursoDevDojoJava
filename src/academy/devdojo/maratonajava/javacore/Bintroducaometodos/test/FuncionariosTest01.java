package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios;

public class FuncionariosTest01 {

    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();

        funcionarios.setNome("Luffy");
        funcionarios.setIdade(20);
        funcionarios.setSalarios(new double[]{1200, 987.32, 2000});

        funcionarios.imprimirSalario();
//        funcionarios.imprimiMediaSalario();
    }
}
