package exercicio21;

public class Main {
    public static void main(String [] ags ) {

    descontoDoCombustiveis(5);

    }
    public static void descontoDoCombustiveis(double litros) {
        double desconto3 = litros * 0.30;
        double desconto5 = litros * 0.50;

        double desconto4 = litros * 0.40;
        double desconto6 = litros * 0.60;

        double valorDesconto = 0;

        boolean tipoCombustivel = true;

        if(tipoCombustivel == "alcool"){
            if (20 > litros) {
                valorDesconto = desconto3;
            } else {
                valorDesconto = desconto5;
            }
        } else if(tipoCombustivel == "gasolina"){
            if (20 > litros) {
                valorDesconto = desconto4;
            } else {
                valorDesconto = desconto6;
            }
        }

        System.out.println("Seu desconto na "+ tipoCombustivel +" foi de " + valorDesconto);
    }

}
