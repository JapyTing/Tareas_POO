import java.sql.*;
import java.sql.Connection;
import org.sqlite.JDBC;

public class DemoConexion {
    public static void main(String[] args) {
        //Driver de conexion
        String DB_URL = "jdbc:sqlite:LibrosDB.db";
        Connection conexion = null;
        //Cargar drivert


        try{
            Class.forName("org.sqlite.JDBC"); //Importarlo implicitamente
            conexion = DriverManager.getConnection(DB_URL);
            Statement stm = conexion.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM libros; ");//Consultas
            while (rst.next()){
                System.out.println(rst.getString(1) + " " + rst.getString(2));
            }

        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }catch (SQLException sqle){
            sqle.printStackTrace();

        }

    }
}
