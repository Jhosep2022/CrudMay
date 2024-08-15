package loginandsignup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    // Ajusta la URL para incluir el nombre correcto de la base de datos 'CrudBaseDatos'
    private static final String URL = "jdbc:mysql://localhost:3306/CrudBaseDatos?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "jose";

    public static Connection getConnection() throws SQLException {
        // Asegúrate de cargar el driver JDBC, esto es necesario en algunas configuraciones
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC driver not found", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
