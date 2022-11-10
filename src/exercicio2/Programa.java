package exercicio2;

public class Programa {
    public double numero;

    public void valor(int n1, int n2) {
        System.out.println("O valor " + n1 + " é " + getSinalDoNumero(n1));
        System.out.println("O valor " + n2 + " é " + getSinalDoNumero(n2));
    }

    public String getSinalDoNumero(int n){
        if(n > 0){
            return "positivo";
        }else if(n < 0){
            return "negativo";
        }else{
            return "neutro";
        }
    }
}
