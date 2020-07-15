package libro.cap03.pruebahsqldb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionJavaHSQLDB {

    public static void main(String[] args) throws SQLException {
        
        String url = "jdbc:hsqldb:hsql://localhost/";
        String user = "SA";
        String password = "";
        					//Para ingresar a un catalogo dhttps://marketplace.eclipse.org/content/hsqldb-database-server-plugine tipo file tenemos que obtener la conexión de esta manera:
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            				//si estaba creado obtiene la conexión a ese catalogo y si no simplemente lo crea
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Customer");
            
            while(rs.next()) 
            {
                
                Long id = rs.getLong("ID");
                String firstname = rs.getString("FIRSTNAME");
                String lastname = rs.getString("LASTNAME");
                String street = rs.getString("STREET");
                String city = rs.getString("CITY");
                
                String out = String.format("%d, %s, %s, %s, %s", id, firstname, lastname, street, city);
                
                System.out.println(out);
            }
        }
    }
}