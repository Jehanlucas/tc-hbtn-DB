import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAOImpl implements ClienteDAO{


    @Override
    public Connection connect(String urlConexao) {
        return null;
    }

    @Override
    public void createTable(String urlConexao) {

    }

    @Override
    public void insert(String url_conexao, Cliente cliente) {

    }

    @Override
    public void selectAll(String urlConexao) {

    }

    @Override
    public void update(String urlConexao, int id, String name, Integer idade) {

    }

    @Override
    public void delete(String urlConexao, int id) {

    }
}
