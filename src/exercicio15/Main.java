package exercicio15;

public class Main {
    public static void main(String [] ags) {

        Main.getLadoDoTriangulo(1, 5, 1);

    }
    public static void getLadoDoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        }

        else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
            System.out.println("Triângulo Isósceles");
        }

        else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3) {
            System.out.println("Triângulo Escaleno");

        } else {
            System.out.println("Não é um triângulo ");
        }
    }
}

