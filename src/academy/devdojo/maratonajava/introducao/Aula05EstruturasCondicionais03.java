package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);


        //Operador ternário
        // String resultado = (condition) ? true : false;
        String resultado2 = salario > 500 ? "Eu vou doar 500 pro DevDojo" : "Eu ainda não tenho condições, mas vou ter";
        System.out.println("Resultado2 " + resultado2);
    }
}
