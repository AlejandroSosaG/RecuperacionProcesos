package tema2;

public class Main {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(3);
        for (int i = 1; i <= 3; i++) {
            Pesonas pesona1 = new Pesonas(pintura, "Shakira");
            Pesonas pesona2 = new Pesonas(pintura, "Piqué");
            Pesonas pesona3 = new Pesonas(pintura, "Clara");
            pesona1.setPriority(1);
            pesona2.setPriority(5);
            pesona3.setPriority(10);
            pesona1.start();
            pesona2.start();
            pesona3.start();
        }
    }
}
