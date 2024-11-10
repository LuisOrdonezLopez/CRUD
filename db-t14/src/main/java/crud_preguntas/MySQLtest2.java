package crud_preguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLtest2 {

    public static void main(String[] args) {
        String hostname = "database-ordonez.cyqw7dqunfkc.us-east-1.rds.amazonaws.com";
        
        String jdbcUrl = "jdbc:mysql://"+hostname+":3306/db_ordonez?useSSL=false";
        String username = "admin";
        String password = "admin#12345";
        
        Connection conexion = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            conexion = DriverManager.getConnection(jdbcUrl, username, password);
            if (conexion != null) {
                System.out.println("Conexión exitosa.");
            }
            
            statement = conexion.createStatement();
            
            resultSet = statement.executeQuery("select * from alumnos");
            
            while (resultSet.next()) {
                System.out.print(resultSet.getString(1));
                System.out.print(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
            }
            
            
        } catch (Exception e) {
            System.out.println("Error en la conexión: "+e);
        }
    }
    
}
