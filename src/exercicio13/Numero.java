package exercicio13;

public class Numero {

    public void numero(Integer numero){

        if (numero == 1) {
            System.out.println("Domingo");
        } else if (numero == 2) {
            System.out.println("Segunda");
        } else if (numero == 3) {
            System.out.println("Terça");
        } else if (numero == 4) {
            System.out.println("Quarta");
        } else if (numero == 5) {
            System.out.println("Quinta");
        } else if (numero == 6) {
            System.out.println("Sexta");
        } else if (numero == 7) {
            System.out.println("Sabado");
        }

        if (numero < 1 && numero > 7) {
            System.out.println("Valor invalido");
        }
    }
}
