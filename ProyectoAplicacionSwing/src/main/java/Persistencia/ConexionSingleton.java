package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance; //Atributo accesible para acceder a una instancia
    private Connection connection; //La instancia tendra conexion

    private ConexionSingleton(String database) {
        this.baseDatos = database; //Estableciendo base de datos
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos); //Creando conexion
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ConexionSingleton getInstance(String baseDatos) { //Recibe nombre de la base de datos
        if(_instance == null){
            _instance = new ConexionSingleton(baseDatos); // Si se cumple nos mandara la base de datos
        }else{
            System.out.println("Ya fué creada."); // Si se crea otra conexion entonces nos dira que ya fue creada la base, evitando crear varias coneexiones (Conexion singleton)
        }
        return _instance;
    }


    public Connection getConnection() {
        return connection;
    }

}
