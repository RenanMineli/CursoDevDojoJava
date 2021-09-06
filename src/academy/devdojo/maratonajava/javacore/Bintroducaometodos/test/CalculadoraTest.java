package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.soma(20, 10);
        System.out.println("---------------");
        calculadora.multiplica(20,10);
        System.out.println("---------------");
        calculadora.divide(20,10);
        System.out.println("---------------");
        calculadora.subtrai(20,10);

        //////////////////////////////////

        calculadora.somaRetorna(30,20);
        System.out.println(calculadora.somaRetorna(30,20));

    }
}
