package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionarios02;

public class FuncionariosTest02 {
    public static void main(String[] args) {
        Funcionarios02 funcionarios02 = new Funcionarios02();

        funcionarios02.nome = "Renan";
        funcionarios02.idade = 21;
        funcionarios02.salarios = new double[]{5000, 8500.50, 15000};


        funcionarios02.imprimiSalario();
    }
}
