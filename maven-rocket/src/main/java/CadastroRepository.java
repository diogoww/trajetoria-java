import java.sql.Connection;
import java.util.List;

public class CadastroRepository {
    private Connection conexao;
    public CadastroRepository() {
        conexao = FabricaConexao.getConexao();
    }
    public void salvar(Cadastro cadastro){}
    public void alterar(Cadastro cadastro){}
    public void excluir(Integer id){}
    public List<Cadastro> listar(){
        return  null;
    }
    public Cadastro buscar(){
        return null;
    }
}
