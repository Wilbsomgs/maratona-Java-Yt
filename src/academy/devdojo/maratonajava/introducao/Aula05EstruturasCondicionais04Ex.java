package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04Ex {
    public static void main(String[] args) {
        double salario = 45000;
        double taxa1 = 9.70;
        double taxa2 = 37.35;
        double taxa3 = 49.50;
        double resultado =0;


        if(salario > 0 && salario < 34712){
           resultado =  (salario * taxa1) / 100;
        }else if(salario > 34.712 && salario <= 68.507){
            resultado = (salario * taxa2) /100;
        }else {
            resultado = (salario * taxa3) /100;
        }

        System.out.println(resultado);
    }
}
