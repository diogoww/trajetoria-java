package FundamentosJava._3_controledefluxo;

import java.text.NumberFormat;
import java.text.ParseException;

public class excecoesPt2 {
    public static void main(String[] args) {
        try {
            Number valor = NumberFormat.getInstance().parse("1.75");
            Double vd = valor.doubleValue();
            System.out.println(vd);
        } catch (ParseException e) {
            System.err.println("numero invalido");
        }
    }
}
