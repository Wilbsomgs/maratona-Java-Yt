package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06Ex {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte day = 2;
        switch (day) {
            case 1:
            case 2:
                System.out.println("FDS");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
        }
    }
}
