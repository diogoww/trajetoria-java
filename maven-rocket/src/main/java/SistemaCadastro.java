public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = new Cadastro();
        cadastro.setNome("Lionel Messi");
        cadastro.setIdade(99);
        cadastro.setId(4);

        repository.excluir(4);
    }
}
