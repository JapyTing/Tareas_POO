package modelo;

import Persistencia.RelojesDAO;
import vista.Ventana;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaReloj implements TableModel {

    public static final int col = 6;

//Arraylist de los datos
    private ArrayList <Relojes> datos;
    private RelojesDAO ldao;
    //Constructor por defecto que instancia ldao RelojDAO
    public ModeloTablaReloj(){
        ldao = new RelojesDAO();
        datos = new ArrayList<>();//Instanciando datos
    }

    public ModeloTablaReloj(ArrayList<Relojes> datos) {
        this.datos = datos;
        ldao = new RelojesDAO(); // Instanciando las operaciones para cargar base de datos al modelo de la tabla
    }

//Metodos abstractos
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return col;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Marca";
            case 2:
                return "Correa";
            case 3:
                return "Inteligente";
            case 4:
                return "Mecanismo";
            case 5:
                return "URL";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            //Tipo de dato que regresara
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;



        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Relojes tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getMarca();
            case 2:
                return tmp.getCorrea();
            case 3:
                return tmp.getInteligente();
            case 4:
                return tmp.getMecanismo();
            case 5:
                return tmp.getUrl();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //modificar datos  de id
            case 1:
                datos.get(rowIndex).setMarca( (String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setCorrea( (String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setInteligente( (String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setMecanismo( (String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrl( (String) aValue);
                break;
            default:
                System.out.println("No se modifica nada");

        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    //Obteniendo y usando el metodo de obtener los registros de RELOJDAO para cargar hacia el modelo de la tabla
    public void cargarDatos(){
        try {
            ArrayList<Relojes> tirar = ldao.obtenerTodo();
            System.out.println(tirar);
            datos = ldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle);

        }

    }
    //Agregar datos //Recibe libro y dara libro de salida
    public boolean agregarReloj (Relojes relojes){
        boolean resultado = false;
        try {
            if (ldao.insertar(relojes)){
                datos.add(relojes);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        return  resultado;
    }

    public boolean update (Relojes relojes) {
        boolean resultado = false;
        try {
            if (ldao.update(relojes)) {
                datos.add(relojes);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public boolean delete(Relojes relojes){
        boolean resultado = false;
        try {
            if (ldao.delete(String.valueOf(relojes))){
                datos.add(relojes);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException sqle){
            System.out.println();
        }
        return resultado;
    }
    public Relojes imagen(int rowIndex){
        return datos.get(rowIndex);
    }


}
