package tema1;

import java.io.File;
import java.io.IOException;

public class LanzaProceso {
    public static void main(String[] args) {
        String[] comando = {"java", "tema1.NotasAlumnos"};
        for (int i = 1; i <= 10; i++) {
            ProcessBuilder pb = new ProcessBuilder(comando);
            File file = new File("C:\\Users\\asosa\\Documents\\RecuperacionProcesos\\src\\tema1\\file" + i + ".txt");
            pb.redirectOutput(file);
            try {
                pb.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            lanzarMedia(file, i);
        }
        lanzarMaximo();
    }
    public static void lanzarMedia(File file, int i) {
        String[] comando = {"java", "tema1.MediaNumeros" + " Alumno " + i};
        File file1 = new File("C:\\Users\\asosa\\Documents\\RecuperacionProcesos\\src\\tema1\\medias.txt");
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.redirectInput(file);
        pb.redirectOutput(ProcessBuilder.Redirect.appendTo(file1));
        try {
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void lanzarMaximo() {
        String[] comando = {"java", "tema1.NumeroMaximo"};
        File file = new File("C:\\Users\\asosa\\Documents\\RecuperacionProcesos\\src\\tema1\\medias.txt");
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.redirectInput(file);
        pb.inheritIO();
        try {
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
