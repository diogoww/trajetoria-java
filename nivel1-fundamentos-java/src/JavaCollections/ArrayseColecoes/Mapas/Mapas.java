package JavaCollections.ArrayseColecoes.Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Mapas {
    public static void main(String[] args) {
        Map <String, String> estados = new HashMap<>();
        estados.put("PR", "Paraná");
        estados.put("SC", "Santa Catarina");
        estados.put("RS", "Rio Grande do Sul");

        Iterator <String> keys = estados.keySet().iterator();

        while (keys.hasNext()){
            String chave = keys.next();
            String valor = estados.get(chave);
            System.out.println("o estado eh " + valor);
        }
    }
}
