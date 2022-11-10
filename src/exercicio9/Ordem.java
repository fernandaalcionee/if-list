package exercicio9;

    public class Ordem {


        public void numero(double n1, double n2, double n3) {
            double maiorNumero = getMaiorNumero(n1, n2, n3);
            double numeroIntermediario = getNumeroIntermediario(n1, n2, n3);
            double menorNumero = getMenorNumero(n1, n2, n3);

            System.out.println("Maior numero: " + maiorNumero);
            System.out.println("Numero intermediario: " + numeroIntermediario);
            System.out.println("Menor numero: " + menorNumero);
        }

        public double getMaiorNumero(double n1, double n2, double n3) {
            if (n1 > n2 && n1 > n3) {
                return n1;
            }

            if (n2 > n1 && n2 > n3) {
                return n2;
            }

            return n3;
        }

        public double getNumeroIntermediario(double n1, double n2, double n3) {
            if ((n1 > n2 && n1 < n3) || (n2 > n1 && n3 < n1)) {
                return n1;
            }

            if ((n2 > n1 && n2 < n3) || (n1 > n2 && n3 < n2)) {
                return n2;
            }

            return n3;

        }

    public double getMenorNumero(double n1, double n2, double n3) {
        if (n2 < n1 && n2 <n3 ) {
            return n2;
        }

        if (n1 < n2 && n1 < n3) {
            return n1;
        }

        return n3;
    }
}
