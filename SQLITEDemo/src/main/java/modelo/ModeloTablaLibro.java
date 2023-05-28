package modelo;

import persistencia.LibroDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

//Implementa table model para poder hacerlo tabla
public class ModeloTablaLibro implements TableModel {
    //CONSTANTE DE COLUMNAS
    public static final int COLUM = 3;

    private ArrayList<Libro> datos;
    //Involucrando la base de datos
    private LibroDAO ldao;
//Constructor por defecto
    public ModeloTablaLibro() {
        ldao = new LibroDAO();

        //Creamos datos e instaciamois
        datos = new ArrayList<>();
    }

    //Constructor sobrecargado
    public ModeloTablaLibro(ArrayList<Libro> datos) {
        this.datos = datos;
        ldao = new LibroDAO(); // Instanciamos o inicializamos el archivo de base de datos
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUM;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch (rowIndex){
            case 0:
                return "id";
            case 1:
                return "Titulo";
            case 2:
                return "Autor";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch (rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
        }
        return null;
    }
//Modificar datos de tabla
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Libro tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getTitulo();
            case 2:
                return tmp.getAutor();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        //con swtich seleccionaremos la columna que queremos modificar
        switch (columnIndex){
            case 0:
              //  datos.get(rowIndex).setId();// Pero no se puede modificar el id
                break;
            case 1:
                datos.get(rowIndex).setTitulo((String) o);//si no regresa nada ponemos el break en cada caso
                break;
            case 2:
                datos.get(rowIndex).setAutor((String) o);
                break;
            default:
                System.out.println("No se modifico nada");
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try {
            ArrayList<Libro> tirar = ldao.obtenerTodo();
            datos = ldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }
}
