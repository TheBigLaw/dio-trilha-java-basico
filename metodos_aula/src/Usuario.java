public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println ("TV esta ligada? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println ("Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println ("Volume: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println ("Volume: " + smartTv.volume);
        smartTv.subirCanal();
        System.out.println ("Canal: " + smartTv.canal);
        smartTv.subirCanal();
        System.out.println ("Canal: " + smartTv.canal);
        
    }
}
