package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 40000;
        double valorParcela = 0;

        for (int parcela = 1; parcela <= valorCarro; parcela++){
            valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+parcela+ " R$ " +valorParcela);
        }
    }
}
