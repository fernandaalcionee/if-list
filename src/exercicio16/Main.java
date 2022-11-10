package exercicio16;

import exercicio1.main;

public class Main {
    public static void main(String [] ags) {

        Main.getEquacao(0, 2, 4);

    }
    public static void getEquacao(int a, int b, int c) {
        double formula = (b*b - 4*a*c);

        if (a <= 0) {
            System.out.println("ERROR");
        }
        else if (formula > 0) {
            System.out.println("Sua equação possui duas raiz igual à: " + formula);
        } else {
            System.out.println("Sua equação possui uma raiz igual à: " + formula);
        }
    }
}
