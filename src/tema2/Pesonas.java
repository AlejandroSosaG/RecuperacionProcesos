package tema2;

public class Pesonas extends Thread{

    private Pintura pintura;
    private String persona;
    private int indicePersona;
    public Pesonas(Pintura pintura, String persona){
        this.pintura = pintura;
        this.persona = persona;
        this.indicePersona = 1;
    }
    public void run(){
        while (true){
            this.pintando();
            this.pintura.cogerPinturas(this.indicePersona);
            System.out.println(persona + " ha terminado con los botes de pintura");
            this.pintura.dejarDeposito(this.indicePersona);
        }
    }
    public void pintando(){
        System.out.println(persona + " está preparando una pintura");
        try {
            sleep((long) (Math.random()*5000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
