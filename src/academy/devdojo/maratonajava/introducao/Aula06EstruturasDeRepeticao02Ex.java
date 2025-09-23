package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Ex {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        int limite = 1000000;
        for(int i =0; i < limite; i++){
            if(i %2 == 0){
                System.out.println("Número par: " + i);
            }

        }
        int count =0;
        while(count < limite){
            if(count % 2 ==2){
                System.out.println("Número par: " + count);
            }
        }

    }
}
