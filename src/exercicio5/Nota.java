package exercicio5;

public class Nota {
    public double nota;

    public void nota(double nota) {
        //
        if (nota >= 7 && nota <= 9) {
            System.out.println("Parabéns, você foi aprovada. Sua media foi: " + nota);
        } else if (nota == 10) {
            System.out.println(" Parabéns você foi aprovado com distinção. Sua media fico " + nota);
        } else if (nota < 7) {
            System.out.println("Infelizmente você foi reprovado, sua media foi " + nota);
        }
    }
}