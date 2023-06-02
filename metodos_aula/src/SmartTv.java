
public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar (){
        ligada = true;
        System.out.println("A TV esta ligada...");
    }

    public void desligar (){
        ligada = false;
    }
    
    public void aumentarVolume (){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }    

    public void abaixarVolume (){
        volume--;
        System.out.println("Abaixando volume para " + volume);
    }

    public void subirCanal (){
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void descerCanal (){
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }

}
