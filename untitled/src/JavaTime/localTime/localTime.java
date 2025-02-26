package JavaTime.localTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class localTime {
    public static void main(String[] args) {
        //manipulação
        /* LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        System.out.println(horaAtual);
        System.out.println(horaAtualMais30Minutos);
        System.out.println(horaAtualMenos2Horas); */

        //comparação
        /* LocalTime horaAtual = LocalTime.now();
        LocalTime horaAtualMenos2Horas = horaAtual.minusHours(2);

        // boolean passado = horaAtual.isBefore(horaAtualMenos2Horas);
        boolean passado = horaAtual.isAfter(horaAtualMenos2Horas);

        System.out.println(passado); */

        //formatação
        /* LocalTime hora = LocalTime.of(13,21,42);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ss-mm-HH");
        String horaFormatada = hora.format(formatter);
        System.out.println(horaFormatada); // 42-21-13 */

        //dados especificos
        LocalTime hora = LocalTime.of(13,21,42);

        System.out.println(hora.getHour());     // 13
        System.out.println(hora.getMinute());   // 21
        System.out.println(hora.getSecond());   // 42
        System.out.println(hora.getNano());     // 0
    }
}
