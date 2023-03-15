package one.digitalinnovation.oo;

public class RodarAplicacao {
    public static void main(String[] args) {

         // Carro 1
        Carro carro1 = new Carro();
        carro1.setCor("Vermelho");
        carro1.setModelo("BMX Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println("Capacidade Por litro: " + carro1.getCapacidadeTanque());
        System.out.printf("Total valor tanque R$:%.2f.",carro1.totalValorTanque(5.31));

        System.out.println("\n--------------------------------");

        // Carro 2

        Carro carro2 = new Carro("Preto", "Fiat Uno", 48);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println("Capacidade Por litro: " + carro2.getCapacidadeTanque());
        System.out.printf("Total valor tanque R$:%.2f.",carro2.totalValorTanque(5.31));

    }
}
