package FundamentosJava._4_OrientacaoAObjetos.instanciaConstrutores;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;
    public void solicitarCredito (Double valorSolicitado){
        limiteCredito = valorSolicitado;
    }
    public void comprar(Double valorProduto){
        limiteCredito = limiteCredito - valorProduto;
    }
    public Cliente(String nomeInformado){
        nome = nomeInformado;
    }
}
