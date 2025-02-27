package FundamentosJava._7_JavaNIO;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");

            // byte[] bytesArquivo =  Files.readAllBytes(path);
            List<String> nomes = new ArrayList<>();
            nomes.add("DIOGO VARASCHIN");
            nomes.add("LIONEL MESSI");
            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(n->conteudo.append(n + "\n"));
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
