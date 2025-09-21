package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // Forma 01
        int idade = 19;
        if (idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        }
        System.out.println("Fora do if");

        // Forma 02
        int idade2 = 17;
        boolean isAutorizadoComprarBebida = idade2 >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        // NOT (!)
        if(!isAutorizadoComprarBebida){
            System.out.println("Não autoriado comprar bebida alcólica");
        }
    }
}
