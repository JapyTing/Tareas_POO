import controlador.ControladorReloj;
import vista.Ventana;
import modelo.Relojes;
import Persistencia.RelojesDAO;


public class Main {
    public static void main(String[] args) {

        Ventana ventana = new Ventana("Relojes");
        //Agregando controlador
        ControladorReloj controller = new ControladorReloj(ventana);
    }
}
