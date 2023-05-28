package persistencia;
//Esta clase no es definitiva, se usara para usar conexion con conexion simple y explicar la clase statement de jdbc

import modelo.Libro;

import java.sql.*;
import java.util.ArrayList;

//PreparedStatement es mejor para errores
public class DemoLibroDB {

    public DemoLibroDB() {
    }

//Video 3
    //Dos tipos de insert, como se complica con insert solo y con el prepared es facil
    public void insertStatement(){
        String elTitulo = "Arrancae la vida";
        String elAutor = "Angeles Matreta";

        //Creacion objeto statement
        try {
            Statement stm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().createStatement();
            String sqlInsert = "INSERT INTO LIBROS(titulo,autor) VALUES('"+elTitulo+"', '"+elAutor+"')"; //Esto se vuelve complejo con mas campos
            int rowCount = stm.executeUpdate(sqlInsert);
            System.out.println("Se insertaron " + rowCount + " registros");
        } catch (SQLException sqle){
            System.out.println("Error al conectar" + sqle.getMessage());
        }

    }
//Mas fac9il insertar datos a la base de datos con este metodo
    public void insertPreparedStatement(){
        String elTitulo = "El principito";
        String elAutor = "No me acuerdo";
        String sqlInsert = "INSERT INTO libros (titulo, autor) VALUES (?, ?)";
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, elTitulo);
            pstm.setString(2,elAutor);
            int rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");

        } catch (SQLException sqle){
            System.out.println("Error prepared statement " + sqle.getMessage());
        }

    }



//video 4
    //oTROS METODOS DE BASE DE DATOS

    public boolean insertarLibro(Libro libro){
        String sqlInsert = "INSERT INTO libros (titulo, autor) VALUES (?, ?)";
        int rowCount = 0;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, libro.getTitulo());
            pstm.setString(2,libro.getAutor());
            rowCount = pstm.executeUpdate();
        } catch (SQLException sqle){
            System.out.println("Error prepared statement " + sqle.getMessage());
        }
    return rowCount > 0;
    }

    //Buscar libro por id
    public Libro buscarLibroPorId(int id){
        String sql = "SELECT * FROM libros WHERE id = ? ;";
        Libro libro = null;
        try {
            PreparedStatement pstn = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sql);

            pstn.setInt(1, id);


            ResultSet rst = pstn.executeQuery();
            if(rst.next()){
                libro = new Libro(rst.getInt(1), rst.getString(2), rst.getString(3));

            }

        }catch (SQLException sqle){
            System.out.println("Error al buscar");
        }
        return libro;
    }

    //Obtener Todos los libros
    public ArrayList<Libro> obtenerTodos(){
        String sql = "SELECT * FROM libros";
        ArrayList<Libro> resultado = new ArrayList<>();
        try{
            Statement stn = ConexionSingleton.getInstance("librosDB.db").getConnection().createStatement();
            ResultSet rst = stn.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Libro(rst.getInt(1), rst.getString(2),rst.getString(3)));

            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
}
