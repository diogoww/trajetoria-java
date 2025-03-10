package JavaCollections.ArrayseColecoes.Genericss;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List <String> prateleira = new ArrayList<>();
        prateleira.add("jeep");
        prateleira.add("ford ka");
        prateleira.add("camaro");
        prateleira.add("frontier");
        prateleira.add("gol");
        prateleira.add("civic");
        prateleira.add("hilux");
        //prateleira.add(3);
        //prateleira.add(true);

        Collections.sort(prateleira);
        Collections.reverse(prateleira);
        Collections.shuffle(prateleira);

        for (String carrinho: prateleira){
            System.out.println(carrinho);
        }
    }
}
