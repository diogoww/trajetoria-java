package JavaTime.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class localDateSample {
    public static void main(String[] args) {
        //Instanciação
        /* LocalDate dataAtual = LocalDate.now();
        LocalDate meuAniversario = LocalDate.of(2025, 2, 24);

        System.out.println(dataAtual);
        System.out.println(meuAniversario);

        String stringDataBr = "24/02/2025";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataConcreta = LocalDate.parse(stringDataBr,formatter);
        System.out.println(dataConcreta);

        //manipulação
        LocalDate aniversarioDiogo = LocalDate.of(2026,2,24);

        LocalDate dataQueTera15Anos = aniversarioDiogo.plusYears(15); // aumenta x quantidade de anos

        System.out.println(dataQueTera15Anos);

        //comparação
        LocalDate data1 = LocalDate.of(2023,2,24);
        LocalDate data2 = LocalDate.of(2024,2,24);

        //data2 está após a data 1? true
        System.out.println(data2.isAfter(data1));

        //data2 está antes que data 1? flase
        System.out.println(data2.isBefore(data1));

        //data2 é igual a data 1? false
        System.out.println(data2.isEqual(data1)); */

        //formatação
        LocalDate data = LocalDate.of(2025,2,24);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(data); // 2023-01-13
        System.out.println(formatter.format(data)); // 24/02/2025
    }
}
