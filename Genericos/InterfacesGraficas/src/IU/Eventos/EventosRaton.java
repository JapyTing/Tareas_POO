package IU.Eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Queremos implementar el mnouse listener para que al dar click al boton saludar, el listener agarre la accion y nos salude
public class EventosRaton implements MouseListener {

    //Metodos que implementa mouse listener
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(); //Hacemos que lo que entre en el cuadro de texto se imprima

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    } // Implementamos la interfaz mouselistener
}
