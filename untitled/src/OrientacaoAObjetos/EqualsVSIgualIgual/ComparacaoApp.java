package OrientacaoAObjetos.EqualsVSIgualIgual;

public class ComparacaoApp {
    public static void main(String[] args) {
        // stack vs heap
        //Integer i1 = 128;
        //Integer i2 = Integer.parseInt("128");
        String string = "diogo varaschin";
        String string1 = new String("diogo varaschin");
        System.out.println(string1.equals(string));
    }
}
