public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = new Cadastro();
        cadastro.setNome("Lionel Messi da Silva");
        cadastro.setIdade(32);

        repository.salvar(cadastro);
    }
}
