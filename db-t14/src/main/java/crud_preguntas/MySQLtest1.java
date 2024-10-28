package crud_preguntas;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLtest1 {

    public static void main(String[] args) {
        String hostname = "db-t14.cyqw7dqunfkc.us-east-1.rds.amazonaws.com";
        
        String jdbcUrl = "jdbc:mysql://"+hostname+":3306/preguntas?useSSL=false";
        String username = "admin";
        String password = "admin1234";
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(jdbcUrl, username, password);
            if (con != null) {
                System.out.println("Conexión exitosa.");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar la base de datos."+e);
        }
    }
    
}
