package exercicio3;

public class Programa {
    public String letra;

    public void letra(String letra) {
        if ("f" == letra) {
            System.out.println(letra + "-feminio ");
        } else if ("m" == letra) {
            System.out.println(letra  + "-Masculino ");
        } else {
            System.out.println("invalido");
        }
    }
}