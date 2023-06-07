package Persistencia;

import modelo.Relojes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RelojesDAO implements InterfazDAO{ //Implementando la interfaz
    //Constructor vacio
    public RelojesDAO(){

    }
//Metodo Insertar
    @Override
    public boolean insertar(Object obj) throws SQLException { // Ya no ocupamos try y catch por que decimos
        //Que este metodo puede dar una excepcion
        String sqlInsert = "INSERT INTO Relojes (marca, correa, inteligente, mecanismo, url) VALUES (?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("RelojesDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((Relojes)obj).getMarca());
        pstm.setString(2,((Relojes)obj).getCorrea());
        pstm.setString(3,((Relojes)obj).getInteligente());
        pstm.setString(4,((Relojes)obj).getMecanismo());
        pstm.setString(5,((Relojes)obj).getUrl());
        rowCount = pstm.executeUpdate();


        return rowCount > 0;
    }
//Metodo Update VER VIDEO 3 PARA SABER SOBRE PREPARED STATEMENT y prepared statement
    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Relojes SET marca = ?, correa = ?, inteligente = ?, mecanismo = ?, url = ? WHERE id = ? ;"; //? es el Comodin
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("RelojesDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((Relojes)obj).getMarca()); //Volviendo libro un Objeto osea un casting
        pstm.setString(2,((Relojes)obj).getCorrea());
        pstm.setString(3,((Relojes)obj).getInteligente());
        pstm.setString(4,((Relojes)obj).getMecanismo());
        pstm.setString(5,((Relojes)obj).getUrl());
        pstm.setInt(6,((Relojes)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Relojes WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("RelojesDB.db").getConnection().prepareStatement(sqlDelete);
        //Establecxiendo valore sdel comodin que nos ayudara a identificar los campos a eliminar
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }
//ver video 5 min 28:00 para entender mejor
    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Relojes";
        ArrayList<Relojes> resultado = new ArrayList<>();
        Statement stn = ConexionSingleton.getInstance("RelojesDB.db").getConnection().createStatement();
        ResultSet rst = stn.executeQuery(sql);
        while (rst.next()){
            resultado.add(new Relojes(rst.getInt(1), rst.getString(2),rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6)));

        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM libros WHERE id = ? ;";
        Relojes reloj = null;

        PreparedStatement pstn = ConexionSingleton.getInstance("RelojesDB.db").getConnection().prepareStatement(sql);

        pstn.setInt(1, Integer.parseInt(id));


        ResultSet rst = pstn.executeQuery();
        if(rst.next()){
            reloj = new Relojes(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getString(4),rst.getString(5),rst.getString(6));
            return reloj;
        }
        return null;
    }
}
