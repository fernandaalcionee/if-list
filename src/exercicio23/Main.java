package exercicio23;

public class Main {
    public static void main(String [] ags) {

        Main.getMaiorNumero(8, 5, 58);

    }

    public static void getMaiorNumero(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println("Maior numero " + numero1 + ". Menor numero: " + numero2 );
        }

        if (numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
            System.out.println("Maior numero " + numero1 + ". Menor numero: " + numero3 );
        }

        if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
            System.out.println("Maior numero " + numero2 + ". Menor numero: " + numero1 );
        }

        if (numero2 > numero1 && numero2 > numero3 && numero3 > numero1){
            System.out.println("Maior numero " + numero2 + ". Menor numero: " + numero3);
        }

        if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
            System.out.println("Maior numero " + numero3 + ". Menor numero: " + numero1 );
        }

        if (numero3 > numero1 && numero3 > numero2 && numero2 > numero1){
            System.out.println("Maior numero " + numero3 + ". Menor numero: " + numero2 );
        }
    }
}
