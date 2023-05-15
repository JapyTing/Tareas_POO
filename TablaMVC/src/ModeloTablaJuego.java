import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaJuego implements TableModel {
    public static final int COLS= 6; //Columnas es una constante
    ArrayList<VideoJuego> datos; //Una lista de los juegos que se ingresaran que contendra generico de videojuegos

    public ModeloTablaJuego(ArrayList<VideoJuego> datos) {//Constructor sobrecargado que reciva un arraylist de datos iniciales a mostrar
        this.datos = datos;
    }
//Metodos Abstractos de TableModel
    //Configuramos nuestros campos dependiendo de los atributos establecidos en la clase VideoJuegos

    @Override
    public int getRowCount() { //De la arraylist
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS; //6 campos de videojuiegos lo regresamos con constante arriba
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columName = ""; //Establecemos variable para crear el nombre de las columnas
        switch (columnIndex){ //Sera el numero de columna
            case 0:
                columName = "id";
                break;
            case 1:
                columName = "Nombre";
                break;
            case 2:
                columName = "Genero";
                break;
            case 3:
                columName = "Peso";
                break;
            case 4:
                columName = "Plataforma";
                break;
            case 5:
                columName = "Desarrollador";
                break;

        }

        return columName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            case 4:
                return String.class;
            case 5:
                return String.class;

        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { //Como regresar la informacion
        VideoJuego tmp = datos.get(rowIndex);
        //Obteniendo columnas
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getGenero();
            case 3:
                return tmp.getPesoGB();
            case 4:
                return tmp.getPlataforma();
            case 5:
                return tmp.getDesarrollador();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//Esta se evento para modificar datos
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void agregarJuego(VideoJuego juego){
        this.datos.add(juego);
    }
}
