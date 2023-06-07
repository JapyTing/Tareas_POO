import java.sql.*;
import org.sqlite.JDBC;
public class DemoConexionSQLite {
    //Declaramos metodo main para asi declarar el driver de conexion y hacerlo variable de java
    public static void main(String[] args) {
        //Estableciendo que archivo conectaremos
        String DB_URL = "jdbc:sqlite:RelojesDB.db"; //Nombre base de datos
        //Estableciendo variable conexion
        Connection conexion = null;

        //Cargando driver, puede existir un error al cargar la clase, por eso
        //Implementaremos un try y cathc para tratarlo

        try{
            Class.forName("org.sqlite.JDBC");
            //Relizando conexion y obteniendola de la variable DB_URL
            conexion = DriverManager.getConnection(DB_URL);

            //Se obtiene el statement d ela conexion ya realizada, si no se realiza la conexion se nos informara
            //Si hay conexion se crea el statement, si hay statement nos permite realizar una consulta
            Statement stm = conexion.createStatement();
            //Relizar consultas
            ResultSet rst = stm.executeQuery("SELECT * FROM relojes; "); // Con query podemos hacer operaciones en la base de datos
            //Iterando sobre la tabla para obtener sus columna 1 y 2
            while (rst.next()){
                System.out.println(rst.getString(1) + " " + rst.getString(2));
            }
            conexion.close();;


        }catch (ClassNotFoundException cne){
            cne.printStackTrace();
        }catch (SQLException sqle){
            //Comoo el recurso puede fallar en tiempo de ejecucion ponemos otro catch
            sqle.printStackTrace(); // Por si ocurre un error nos indica el stackTrac cual es el error
        }


    }
}
