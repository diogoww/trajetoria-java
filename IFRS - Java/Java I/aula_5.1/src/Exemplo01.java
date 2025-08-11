public class Exemplo01 {
    public static void main (String[] args) {
        double n1, n2, n3, n4, res;

        n1 = Double.parseDouble(System.console().readLine());
        n2 = Double.parseDouble(System.console().readLine());
        n3 = Double.parseDouble(System.console().readLine());
        n4 = Double.parseDouble(System.console().readLine());

        res = (n1+n2+n3+n4)/4;
        System.out.println(res);
    }
}
