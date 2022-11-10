package exercicio6;

public class Numero {

    public void getMaiorNumero(double n1, double n2, double n3) {
        if (n1 > n2 && n1 > n3){
            System.out.println("maior " + n1);
        }

        if (n2 > n1 && n2 > n3){
            System.out.println("maior " + n2);
        }

        if (n3 > n1 && n3 > n2){
            System.out.println("maior " + n3);
        }
    }
}
