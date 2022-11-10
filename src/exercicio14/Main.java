package exercicio14;

public class Main {
    public static void main(String [] ags) {

        Main.getNotaPorMedia(9, 2);

    }

    public static void getNotaPorMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) /2;
        String nota = "";

        if (media<=10.0 && media>9.0)
            nota = "A";

        if (media<=9.0 && media>7.5)
            nota = "B";

        if (media<=7.5 && media>6.0)
            nota = "C";

        if (media<=6.0 && media>4.0)
            nota = "D";

        if (media<=4.0 && media>0.0)
            nota = "E";

        System.out.println("Sua media foi " + media + " e sua nota é: "+ nota);
    }
}
