package tema1;

import java.util.Scanner;

public class NumeroMaximo {
    public static void main(String[] args) {
        double max = 0;
        double numero;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()) {
            numero = sc.nextDouble();
            if (numero>max) max = numero;
        }
        System.out.println(max);
        sc.close();
    }
}
