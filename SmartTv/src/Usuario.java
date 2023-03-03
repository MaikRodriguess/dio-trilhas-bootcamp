public class Usuario {
    public static void main(String[] args) {
        SmatTv smatTv = new SmatTv();

        // Mudanças de volume TV
        smatTv.diminuirVolume();
        smatTv.diminuirVolume();
        smatTv.diminuirVolume();
        smatTv.aumentarVolume();

        System.out.println("Canal Atual: " + smatTv.canal);

        // Mudando do canal
        smatTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smatTv.canal);


        System.out.println("Volume Atual: " + smatTv.volume);
        System.out.println("TV está ligada?: " + smatTv.ligada);
        System.out.println("Volume Atual: " + smatTv.volume);


        smatTv.ligar();
        System.out.println("Novo Status -> TV ligada?: " + smatTv.ligada);

        // Desligar TV
        smatTv.desligar();
        System.out.println("Novo Status -> TV ligada? " + smatTv.ligada);



    }
}
