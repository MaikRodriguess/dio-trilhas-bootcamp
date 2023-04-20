import java.io.IOException;
import java.util.Scanner;

public class TaxaImposto {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
//        DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));
        double impostoTotal;


        TaxaImposto taxaImposto = new TaxaImposto();

        if(renda >= 0.00 && renda <= 2000.00){
            System.out.println("Isento");
        }else {
            impostoTotal = taxaImposto.calculaImposto(renda);
            System.out.printf("R$ %.2f%n", impostoTotal);
        }


    }
    public double calculaImposto(double renda){
        double impostoTotal = 0;

         if (renda >= 2000.01 || renda <= 3000.00) {
            impostoTotal = 1000 * 0.08;

        } if (renda >= 3000.01 && renda <= 4500.00) {
            impostoTotal = impostoTotal +  (renda - 3000.01) * 0.18;

        }if (renda >= 3000.01 && renda > 4500.00) {
            impostoTotal = impostoTotal + 1500 * 0.18;
            impostoTotal = impostoTotal + (renda - 4500) * 0.28;
        }
//
        return impostoTotal;
    }
}