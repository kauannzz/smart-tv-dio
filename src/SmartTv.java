public class SmartTv {
    
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    //Não retorna nada, por isso o método é void
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++; //aumenta em +1
    }

    public void diminuirVolume(){
        volume--; //diminui o volume em -1
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal; 
    }
}
