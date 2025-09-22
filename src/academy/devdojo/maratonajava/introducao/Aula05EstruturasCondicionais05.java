package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como doming
        byte dia = 5;
        // switch aceita valores como:
        // char, int, byte, enum, short, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Domingo");
                break;
            case 3:
                System.out.println("Domingo");
                break;
            case 4:
                System.out.println("Domingo");
                break;
            case 5:
                System.out.println("Domingo");
                break;
            case 6:
                System.out.println("Domingo");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        // Exemplo 2
        char sexo = 'M';
        switch (sexo){
            case 1:
                System.out.println("Masculino");
                break;
            case 2:
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
