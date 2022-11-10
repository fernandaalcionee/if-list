package exercicio17;

public class Main {
    public static void main(String[] ags) {

        Main.getAno(2009);
    }

    public static void getAno(double ano) {
        if (ano % 4==0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano não bissexto");
        }
    }
}
