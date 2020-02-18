package pruebasmysql;
import java.sql.*;

public class Principal {
    public static void main(String[] args) {
      try {
            String cadenaConexion = "jdbc:mysql://localhost/club_nautico?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Connection conexion = DriverManager.getConnection(cadenaConexion, "root", "1234");
            Statement comando = conexion.createStatement();
            comando.executeUpdate("insert into socios(nombre, curp) values ('John','001')");
            conexion.close();
            System.out.println("se registraron los datos");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
  
    }    
}
