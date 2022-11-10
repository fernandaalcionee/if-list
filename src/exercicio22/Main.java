package exercicio22;

public class Main {
    public static void main(String[] ags) {

        Main.getNumeroMaiorOuMenor(74, 8);
    }

    private static void getNumeroMaiorOuMenor(int numero1, int numero2) {
        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        } else {
            System.out.println(numero2 + " é maior que " + numero1);
        }
    }
}
