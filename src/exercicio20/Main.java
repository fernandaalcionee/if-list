package exercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String [] ags) {

        Integer contador = 0;

        getPerguntas(contador);

    }

    public static void getPerguntas(Integer contador) {
        System.out.println("Telefonou para a vítima?");
        Scanner myObj = new Scanner(System.in);
        String telefonouParaVitima = myObj.nextLine();  // Read user input
        if (telefonouParaVitima.equals("sim")) {
            contador += 1;
        }

        System.out.println("Esteve no local do crime?");
        String esteveNoLocal = myObj.nextLine();  // Read user input
        if (esteveNoLocal.equals("sim")) {
            contador += 1;
        }

        System.out.println("Mora perto da vítima?");
        String moravaComAVitima = myObj.nextLine(); // Read user input
        if (moravaComAVitima.equals("sim")) {
            contador +=1;
        }

        System.out.println("Devia para a vítima?");
        String deviaParaAvitima =  myObj.nextLine(); // Read user input
        if (deviaParaAvitima.equals("sim")) {
            contador += 1;
        }

        System.out.println("Já trabalhou com a vítima?");
        String jaTrabalhoComAvitima = myObj.nextLine(); // Read user input
        if (jaTrabalhoComAvitima.equals("sim")) {
            contador +=1;
        }

        if (contador == 2) {
            System.out.println("Suspeito");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assassino");
        }

        System.out.println(contador);
    }
}
