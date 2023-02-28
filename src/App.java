public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("O volume que está na TV é " + smartTv.volume);

        System.out.println("A TV está: " + smartTv.ligada);
        System.out.println("O canal que está na TV é: " + smartTv.canal);

        smartTv.mudarCanal(13);

        smartTv.ligar();
        System.out.println("Novo status da TV: " + smartTv.ligada);
        System.out.println("O novo canal na TV é: " + smartTv.canal);

    }
}
