package FundamentosJava._1_sintaxe.je03_indentacao;

public class BoletimEstudantil {
    public static void main (String[] args){
        int mediaFinal = 10;
        if (mediaFinal<6){
            System.out.println("reprovado");
        } else if (mediaFinal==6){
            System.out.println("prova minerva");
        } else {
            System.out.println("aprovado");
        }
    }
}
