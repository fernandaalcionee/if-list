package exercicio7;

public class Numero {

    public void numero(double n1, double n2, double n3){
        double maiorNumero = getMaiorNumero(n1,n2,n3);
        System.out.println("O maior numero é " + maiorNumero + " e o menor é: " + n2);
    }

    public double getMaiorNumero(double n1, double n2, double n3) {
        if (n1 > n2 && n1 > n3){
            return n1;
        }

        if (n2 > n1 && n2 > n3){
            return n2;
        }

        return n3;
    }
}
