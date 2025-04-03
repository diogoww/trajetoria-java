import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JDBCPostgres {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/rocket_db";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "postgres");
            Connection conn = DriverManager.getConnection(url, props);
            System.out.println("conexão realizada com sucesso!");

            String instrucaoSQL = "INSERT INTO public.tab_cadastro (nome, idade) VALUES(?, ?);";
            String nome = "ana clara";
            Integer idade = 25;

            PreparedStatement pst = conn.prepareStatement(instrucaoSQL);
            pst.setString(1, nome);
            pst.setInt(2, idade);

            pst.execute();
            System.out.println("cadastro inserido com sucesso");

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
