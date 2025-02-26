package OrientacaoAObjetos.instanciaConstrutores;

public class Sistema {
    public static void main (String[] args){
        Cliente diogo = new Cliente("Diogo Varaschin");
        System.out.println(diogo.nome);
        System.out.println(diogo.limiteCredito);
        diogo.solicitarCredito(200.0);

        diogo.comprar(50.0);

        Cliente ana = new Cliente("Ana Clara");
        System.out.println(ana.nome);
        System.out.println(ana.limiteCredito);
        ana.solicitarCredito(80.0);

        System.out.println("limite do(a) " + diogo.nome + " " + diogo.limiteCredito);
        System.out.println("limite do(a) " + ana.nome + " " + ana.limiteCredito);
    }
}
