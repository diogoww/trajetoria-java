package JavaCollections.ArrayseColecoes;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List linguagens = new ArrayList();
        linguagens.add("java");
        linguagens.add("c++");
        linguagens.add ("c#");
        linguagens.add("cobol");
        linguagens.remove("java");
        linguagens.add(0, "python");

        System.out.println(linguagens.contains("java"));

        for (Object linguagem:linguagens){
            System.out.println(linguagem);
        }

    }
}
