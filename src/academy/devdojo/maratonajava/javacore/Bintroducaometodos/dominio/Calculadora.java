package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.security.spec.RSAOtherPrimeInfo;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros03(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }
        return 0;
    }

    public void divideDoisNumeros04(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    //EU QUE FIZ OS DEBAIXO

    public void soma (int n1, int n2){
        System.out.println(n1 + n2);
        return;
    }

    public void multiplica (int n3, int n4){
        System.out.println(n3 * n4);
        return;
    }

    public void divide (int n5, int n6){
        System.out.println(n5 / n6);
        return;
    }

    public void subtrai (int n7, int n8){
        System.out.println(n7 - n8);
        return;
    }

    public double somaRetorna (double m1, double m2){
        return m1 + m2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    //VARARGS

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma+= num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs (int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma+= num;
        }
        System.out.println(soma);
    }

}
