public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracter = 65;
        String nome = "Goku";

        System.out.println("A idade é " +idade+ " anos");
        System.out.println(falso);
        System.out.println("char " +caracter);
        System.out.println(idade);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " +nome);
    }
}
