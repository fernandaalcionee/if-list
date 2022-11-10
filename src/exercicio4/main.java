package exercicio4;

import java.util.Scanner;

public class main {
    public static void main(String [] ags) {
        letra();
    }

    public static void letra(){
        System.out.println("Digite uma letra");
        Scanner entrada = new Scanner(System.in);
        String letra = entrada.nextLine();

        if ("a" == letra || "e" == letra || "i" == letra || "o" == letra || "u" == letra) {
            System.out.println(" A letra " + letra + " é uma vogal");
        } else {
            System.out.println("A letra " + letra + " é uma consoante");
        }
    }
}