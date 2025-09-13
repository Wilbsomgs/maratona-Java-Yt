package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolenan
        int idade = 10;
        long numeroGrande = 10000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char charactere = 'M';
        char charactereTabelaAsk = 65;
        char charactereUniCode = '\u0041';

        System.out.println("Idade: " + idade + " anos");
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(charactere);
        System.out.println(charactereTabelaAsk);
        System.out.println(charactereUniCode);
    }
}
