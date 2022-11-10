package exercicio24;

public class Main {
    public static void main(String [] ags) {

        getParOuImpar(2);

    }

    public static void getParOuImpar(int numero) {
        if (numero %2==0) {
            System.out.println("Seu numero é Par!");
        } else {
            System.out.println("Seu numero é impar!");
        }
    }
}
