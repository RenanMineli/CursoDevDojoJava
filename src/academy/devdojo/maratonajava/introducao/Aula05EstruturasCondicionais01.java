package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
//        if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcoólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcoólica");
        }
//        if (isAutorizadoComprarBebida == false) {
        if (!isAutorizadoComprarBebida) { // ! > siginifica "não", está negando a variavel isAutoridadeComprarBebida
            System.out.println("Não Autorizado a comprar bebida alcoólica");
        }
    }
}