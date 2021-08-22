package academy.devdojo.maratonajava.introducao;

import java.util.concurrent.Delayed;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //imprima todos os números pares de 0 a 1000000
        int resto = 0;
        for (int i = 0; i <= 1000000; i++){
            resto = i % 2;
            if(resto == 0){
                System.out.println(i);
            }
        }

        //OU

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0){
                System.out.println("Segunda maneira " +i);
            }
        }
    }
}
