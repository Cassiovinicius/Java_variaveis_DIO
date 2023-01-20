public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual ? " + smartTv.canal);
        smartTv.mudarCanal(20);
        System.out.println("Canal atual ? " + smartTv.canal);

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("volume atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status -> tv ligada "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status -> tv ligada "+ smartTv.ligada);
        

    }
}
