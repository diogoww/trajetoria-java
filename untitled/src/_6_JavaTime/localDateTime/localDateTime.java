package _6_JavaTime.localDateTime;

public class localDateTime {
    public static void main(String[] args) {
        //manipulacao
        /* LocalDateTime dataHora = LocalDateTime.of(2023,6,25, 16,25);
        LocalDateTime proximoMes = dataHora.plusMonths(1);
        LocalDateTime dataHoraComMenos15Minutos = dataHora.minusMinutes(15);
        LocalDateTime dataHoraDefinindoSegundoZero = dataHora.withSecond(33); */

        //comparacao
        /* LocalDateTime dataHora1 = LocalDateTime.of(2023,6,25, 16,25);
        LocalDateTime dataHora2 = LocalDateTime.of(2023,6,25, 16,25,17);

        // comparando dois objetos data/hora em sua totalidade
        boolean dataHoraIgual = dataHora1.equals(dataHora2); //false

        // comparando dígito específico de uma data e hora
        boolean dataHoraDigitoIgual = dataHora1.getDayOfMonth()==dataHora2.getDayOfMonth(); //true */

    }
}
