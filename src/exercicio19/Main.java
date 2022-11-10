package exercicio19;

public class Main {
    public static void main(String [] ags) {

        Main.getNumero(-2,3);

    }

    public static void getNumero(int numero1, int numero2) {
        System.out.println("O primeiro "+ numero1 +" numero é "+sinalNumero(numero1) + " e é " + getParOuImpar(numero1));
        System.out.println("O segundo "+ numero2 +"numero é "+sinalNumero(numero2) + " e é " + getParOuImpar(numero2));
    }

    public static String getParOuImpar(int n1){
        if (n1 % 2==0) {
            return "par";
        } else {
            return "impar";
        }
    }
    public static String sinalNumero(int n){
        if(n>0){
            return "positovo";
        }else{
            return "negativo";
        }
    }
}
