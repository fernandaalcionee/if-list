package exercicio8;

public class Produto {

    public void valor(double valor1, double valor2, double valor3) {
        if ( valor1 > valor2 && valor1 > valor3) {
            System.out.println("Você deve comprar o produto numero 1 " );
        }
        if ( valor2 > valor1 && valor2 > valor3) {
            System.out.println("Você deve comprar o produto numero 2");
        }
        if (valor3 > valor1 && valor3 > valor2) {
            System.out.println("Você deve comprar o produto numero 3");
        }
    }
}
