package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04Ex {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valorParcela >= 1000;


        // valor do carro
        // descobrir quantas parcelas pode dividir o valor do carro sendo que cada parcela tem que ser acima de 1000
        double valorCarro = 40000;
        double parcelaReal = 0;
        for(int i =1; i < valorCarro;i++){
          double valorParcela = valorCarro / i;
          if(valorParcela < 1000){
              break;
          }
            System.out.println("Parcela: " + i + "R$ " + valorParcela);
        }
    }
}
