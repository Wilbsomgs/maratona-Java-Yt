package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

/**
 * Crie variáveis par os compos descritos abaixo entre <> e imprima a seguinte mensage:
 *
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>
 * na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Marcos Aurélio Gomes";
        String endereco = "Rua Vicente Paz, 30";
        double salario = 1993.45;
        String dataRecebimentoSalario = "21/02/2023";

        System.out.println("Eu " + nome + " morando no endereço " + endereco + "confirmo que " +
                "recebi  o salário de " + salario + ", na data " + dataRecebimentoSalario);
    }
}
