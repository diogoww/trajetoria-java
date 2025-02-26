package OrientacaoAObjetos.Enums;

public enum EstadoBrasileiro {
    PARANA ("Parana", "PR"),
    SAO_PAULO ("Sao Paulo", "SP"),
    SANTA_CATARINA ("Santa Catarina", "SC"),
    RIO_GRANDE_DO_SUL ("Rio Grande do Sul", "RS"),
    ;

    private String nome;
    private String sigla;
    private EstadoBrasileiro(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
