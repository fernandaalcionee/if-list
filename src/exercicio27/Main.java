package exercicio27;

import java.util.Scanner;

public class Main {
    public static void main(String [] ags) {

    Main.getData();

    }

    public static void getData() {
        Integer diaDoAniversario = fazPergunta("Que dia é seu aniversario?");
        if (diaDoAniversario > 31) {
            System.out.println("Dia invalido");
        }

        Integer mesDoAniversario = fazPergunta("Qual é o mes do seu aniversario?");
        if (mesDoAniversario > 12) {
            System.out.println("Mes invalido");
        }

        System.out.println("Qual é o ano do seu aniversario?");
        String anoDoAniversario = getInputUsuario();
        int anoDoAniversarioInt = Integer.parseInt(anoDoAniversario);
        if (anoDoAniversarioInt > 2013) {
            System.out.println("Ano invalido");
        }

        System.out.println("Seu aniversario é: " + diaDoAniversario + " | " + mesDoAniversario + " | " + anoDoAniversario);
    }

    public static Integer fazPergunta(String mesangem){
        System.out.println(mesangem);
        return Integer.valueOf(getInputUsuario());
    }
    private static String getInputUsuario() {
        return new Scanner(System.in).nextLine();
    }
}
