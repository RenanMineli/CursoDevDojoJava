package academy.devdojo.maratonajava.introducao;/* Exercicio

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Renan";
        String endereço = "Rua Dardanelos 159, Pq. Novo Oratório Santo André-SP";
        double salário = 8750.50;
        String dataRecebimentoSalário = "13/08/2021";
        String relatorio = "Eu " +nome+ ", morando no endereço " +endereço+ ", confirmo que recebi o salário de " +salário+ ", na data " +dataRecebimentoSalário;

        //DUAS OPÇÕES PARA ESCREVER A FRASE
        System.out.println(relatorio);
        //OU
        System.out.println("Eu " +nome+ ", morando no endereço " +endereço+
                            ", confirmo que recebi o salário de " +salário+ ", na data " +dataRecebimentoSalário);
    }

}
