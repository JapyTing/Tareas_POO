import Vista.VentanaLibro;
import controlador.ControladorLibro;
import modelo.Libro;
import persistencia.DemoLibroDB;
import persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC Y JDBC");

        //Agregamos controlador y mandamos la vista
        ControladorLibro controller = new ControladorLibro(view);

    }
}
