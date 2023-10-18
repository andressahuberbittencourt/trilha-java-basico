public class SmartTV {
    
    boolean ligada = false;
    int canal = 1, volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++; // volume = volume + 1;
        System.out.println("Aumentando o volume para: " + volume);

    }
    public void diminuirVolume(){
        volume--; // volume = volume - 1;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++; // canal = canal + 1;
        System.out.println("Aumentando o canal para: " + canal);

    }
    public void diminuirCanal(){
        canal--; // canal = canal - 1;
        System.out.println("Diminuindo o canal para: " + canal);
    }
    public void mudarCanal(int novoCanal){ // o usuário escolhe o canal que quiser
        canal = novoCanal;
    }
}
