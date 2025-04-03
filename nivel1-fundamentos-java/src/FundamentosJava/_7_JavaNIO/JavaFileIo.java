package FundamentosJava._7_JavaNIO;
import java.io.File;
import java.io.IOException;

public class JavaFileIo {
    public static void main(String[] args) {
        File diretorio = new File("c:\\rocket\\curso-java");
        System.out.println("diretorio existe? " + diretorio.exists());
        if (!diretorio.exists()){
            diretorio.mkdir();
            System.out.println("foi criado o diretorio");
        }

        try {
            File arquivo = new File(diretorio, "aula-java.txt");
            System.out.println(arquivo.exists());
            arquivo.createNewFile();
            System.out.println(arquivo.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
