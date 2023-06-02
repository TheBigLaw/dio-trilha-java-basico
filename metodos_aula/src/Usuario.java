public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        System.out.println ("TV esta ligada? " + smartTv.ligada);
        System.out.println ("Canal: " + smartTv.canal);
        System.out.println ("Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.subirCanal();

        System.out.println ("TV esta ligada? " + smartTv.ligada);
        System.out.println ("Canal: " + smartTv.canal);
        System.out.println ("Volume: " + smartTv.volume);


    }
}
