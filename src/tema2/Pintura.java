package tema2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Pintura {
    private boolean[] depositos;
    public Pintura(int numContenedores){this.depositos = new boolean[numContenedores];}
    public int cian(int i){
        if(i == 0){
            return this.depositos.length - 1;
        }else{
            return i - 1;
        }
    }
    public int magenta(int i){
        if(i == 0){
            return this.depositos.length - 1;
        }else{
            return i - 1;
        }
    }
    public int amarillo(int i){
        if(i == 0){
            return this.depositos.length - 1;
        }else{
            return i - 1;
        }
    }
    public synchronized void cogerPinturas(int i){

        while(depositos[cian(i)] || depositos[magenta(i)] || depositos[amarillo(i)]){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Pintura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        depositos[cian(i)] = true;
        depositos[magenta(i)] = true;
        depositos[amarillo(i)] = true;
    }
    public synchronized void dejarDeposito(int i){
        depositos[cian(i)] = false;
        depositos[magenta(i)] = false;
        depositos[amarillo(i)] = false;
    }
}
