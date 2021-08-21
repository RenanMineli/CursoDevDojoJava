package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //€ 0 - 20.711	     36,65%
    //€ 20.712 - 68.507	 38,10%
    //€ 68.508+	         51,75%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 36.65/100;
        double segundaFaixa = 38.10/100;
        double terceiraFaixa = 51.75/100;
        double imposto = 0;

        if(salarioAnual <= 20711){
            imposto = salarioAnual * (primeiraFaixa);
        }else if (salarioAnual >= 20712 && salarioAnual <= 68507){
            imposto = salarioAnual * (segundaFaixa);
        }else{
            imposto = salarioAnual * (terceiraFaixa);
        }
        System.out.println("Você paga anualmente com base no seu salário de " +salarioAnual+ " um imposto no valor de "+imposto);
    }
}
