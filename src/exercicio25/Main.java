package exercicio25;

public class Main {
    public static void main(String [] ags) {

        Main.getRaio(9);

    }

    public static void getRaio(double raio) {
        double diâmetro = (raio * 2);
        double comprimento = (2 * 3.14 * raio);
        double area = (3.14 * raio * raio);

        System.out.println("Seu diamentro é: " + diâmetro + ". Seu comprimento é: " + comprimento +
                ". E area é: " + area);

    }
}
