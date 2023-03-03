

public class SmatTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Mudar de canal TV
    public void mudarCanal( int novoCanal){
        canal = novoCanal;
    }

    // Aumenta o volume da TV
     public void  aumentarVolume(){
         // volume = volume + 1;
         volume++;
         System.out.println("Aumentando o volume para: " + volume);
     }
     // Diminui o volume da TV
     public void diminuirVolume(){
         //volume = volume - 1;
         volume--;
         System.out.println("Diminuindo o volume para: " + volume);
     }
    // Ligar TV
    public void ligar(){
        ligada = true;
    }
    // Desligar a TV
    public void desligar(){
        ligada = false;
    }
  // Teste

}