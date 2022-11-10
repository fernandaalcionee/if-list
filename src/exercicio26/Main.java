package exercicio26;

import java.util.Scanner;

public class Main {
    public static void main(String[] ags) {

        int idade;
        Main.getIdadeParaDoacao();
    }


    public static void getIdadeParaDoacao() {
        System.out.println("Qual é sua idade?");
        Scanner myObj = new Scanner(System.in);
        String scanner = myObj.nextLine();
        Integer idadeMaxima = Integer.valueOf(scanner);

        if (idadeMaxima >= 18 && idadeMaxima <= 67) {
            System.out.println("Você pode doar sangue");
        } else {
            System.out.println("Você não pode doar sangue");
        }
    }
}

