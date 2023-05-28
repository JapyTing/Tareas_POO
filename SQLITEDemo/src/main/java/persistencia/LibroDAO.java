package persistencia;

import modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
//Implementando los metodos de Buscar,AGgregar libro en una interfaz
//Es el dataAcces del
public class LibroDAO  implements InterfazDAO{
    public LibroDAO() {
    }

    @Override
    public boolean insertat(Object obj) throws SQLException {
        //No necesitamos un try y catch por que decimos que el metodo ya puede dar una excepcion
        String sqlInsert = "INSERT INTO libros (titulo, autor) VALUES(?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Libro)obj).getTitulo()); //Volviendo libro un Objeto osea un casting
        pstm.setString(2,((Libro)obj).getAutor());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE libros SET titulo = ?, autor = ? WHERE id = ? ;"; //? es el Comodin
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("LibrosDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Libro)obj).getTitulo()); //Volviendo libro un Objeto osea un casting
        pstm.setString(2,((Libro)obj).getAutor());
        pstm.setInt(3,((Libro)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM libros WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlDelete);
        //Establecxiendo valore sdel comodin que nos ayudara a identificar los campos a eliminar
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM libros";
        ArrayList<Libro> resultado = new ArrayList<>();
            Statement stn = ConexionSingleton.getInstance("librosDB.db").getConnection().createStatement();
            ResultSet rst = stn.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Libro(rst.getInt(1), rst.getString(2),rst.getString(3)));

            }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM libros WHERE id = ? ;";
        Libro libro = null;

        PreparedStatement pstn = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sql);

        pstn.setInt(1, Integer.parseInt(id));


        ResultSet rst = pstn.executeQuery();
        if(rst.next()){
            libro = new Libro(rst.getInt(1), rst.getString(2), rst.getString(3));
            return libro;
        }
        return null;
    }
}
