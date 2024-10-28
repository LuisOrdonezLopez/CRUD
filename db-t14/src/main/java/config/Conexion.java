package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    static String URL = "jdbc:mysql://db-t14.cyqw7dqunfkc.us-east-1.rds.amazonaws.com:3306/preguntas?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    static String USER = "admin";
    static String PASSWORD = "admin1234";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver de la base de datos: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }

    
}