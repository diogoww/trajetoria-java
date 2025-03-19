import com.sun.jdi.request.ExceptionRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class CadastroRepository {
    private Connection conexao;
    public CadastroRepository() {
        conexao = FabricaConexao.getConexao();
    }
    public void incluir(Cadastro cadastro){
        try {
            String instrucaoSQL = "INSERT INTO public.tab_cadastro (nome, idade) VALUES(?, ?);";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSQL);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());

            pst.execute();
            System.out.println("cadastro INSERIDO com sucesso");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void alterar(Cadastro cadastro){
        try {
            String instrucaoSQL = "UPDATE public.tab_cadastro SET nome=?, idade=? WHERE id=?";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSQL);
            pst.setString(1, cadastro.getNome());
            pst.setInt(2, cadastro.getIdade());
            pst.setInt(3, cadastro.getId());

            pst.execute();
            System.out.println("cadastro ALTERADO com sucesso");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public void excluir(Integer id){
        try {
            String instrucaoSQL = "DELETE FROM public.tab_cadastro WHERE id=?";
            PreparedStatement pst = conexao.prepareStatement(instrucaoSQL);
            pst.setInt(1, id);

            pst.execute();
            System.out.println("cadastro EXCLUIDO com sucesso");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public List<Cadastro> listar(){
        return  null;
    }
    public Cadastro buscar(){
        return null;
    }
}
