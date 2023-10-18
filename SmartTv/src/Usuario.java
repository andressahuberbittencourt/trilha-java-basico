public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("A TV está ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar(); // valida se a tv está ligada após usuário ligá-la
        System.out.println("A TV está ligada? " + smartTV.ligada);

        smartTV.desligar(); // valida se a tv está desligada, após usuário desligá-la
        System.out.println("A TV está ligada? " + smartTV.ligada);

        // validar se a TV está aumentando volume corretamente
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume); // testando aumento de volume com diminuição em seguida
        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        // canal pré configurado ao ligar tv
        System.out.println("Canal atual: " + smartTV.canal);

        // implementando canal escolhido pelo usuário
        smartTV.mudarCanal(46);
        System.out.println("Canal atual: " + smartTV.canal);

    }
}
