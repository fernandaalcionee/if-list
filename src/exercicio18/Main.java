package exercicio18;

public class Main {

    public static void main(String [] ags) {

        Main.getPositivoOuNegativo(100);
}

    public static void getPositivoOuNegativo(int numero) {

        if (numero > 0 ) {
            System.out.println("Seu numero é positivo");
        } else {
            System.out.println("Seu numero é negativo");
        }

        if (numero % 2  == 0) {
            System.out.println("E Par!");
        } else {
            System.out.println("E Impar!");
        }
    }
}
