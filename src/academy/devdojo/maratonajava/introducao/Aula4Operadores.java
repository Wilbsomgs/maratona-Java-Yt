package academy.devdojo.maratonajava.introducao;

public class Aula4Operadores {
    public static void main(String[] args) {
        operadoresAritimetricos();
        operadorLogicos();
    }

    public static void operadoresAritimetricos(){
        // Operadores aritmétricos + - / * %

        int numero1 = 10;
        int numero2 = 20;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        double divisao01 = numero1/ numero2; // numero1(inteiro) numero2(inteiro) resultado inteiro = 0.0

        // usando o casting
        double resultadoDivisao = numero1 / (double) numero2;


        // Exemplo divisão02
        int numero3 = 10;
        double numero4 = 20;
        double divisao02 = numero3 / numero4; // basta uma das variáveis ser do tipo double

        int multiplicacao = numero1 * numero2;
        int restoDivisao = numero1 % numero2;


        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão exemplo01: " + divisao01);
        System.out.println("Divisão exemplo02 " + divisao02);
        System.out.println("Divisao usando o casting: " + resultadoDivisao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Resto divisão: " + restoDivisao);
    }
    public static void operadorLogicos(){
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQuevinte: "  + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+ isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez" + isDezIgualDez);
        System.out.println("isDezDiferenteDez" + isDezDiferenteDez);

        // && (AND) OU (||) NOT (!)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel" + isPlayStationCincoCompravel);
    }

    public static void operadoresDeAtribuicao(){
        // = += -= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; /// 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0.0
        System.out.println("bonus: " + bonus);

        //  ++ --
        int contador = 0;
        contador += 1;
        contador++; // Primeiro executa e depois incrementa
        ++contador; // Primeira incrementa e depois executa
        --contador;
        contador--;
        System.out.println(contador);

    }
}
