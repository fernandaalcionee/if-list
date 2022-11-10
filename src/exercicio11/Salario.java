package exercicio11;

    public class Salario {

        public double aumento(double salario) {
            double aumento = 0;
            String porcetagem = null;

            if (salario < 280) {
                aumento = salario * 0.20;
                porcetagem = "20%";
            } else if (salario > 280 && salario < 700) {
                aumento = salario * 0.15;
                porcetagem = "15%";
            } else if (salario > 700 && salario < 1500) {
                aumento = salario * 0.10;
                porcetagem = "10%";
            } else if (salario > 1500) {
                aumento = salario * 0.10;
                porcetagem = "10%";
            }

            System.out.println("O salario antes do reajuste é " + salario + ". " + "O porcentual aplicado é "
                    + porcetagem + " O valor do aumento foi " + aumento + " Após o aumento  seu salario fico: " + (aumento + salario));

        return aumento;
    }
}
