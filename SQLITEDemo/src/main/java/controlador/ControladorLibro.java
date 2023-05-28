package controlador;

import Vista.VentanaLibro;
import modelo.ModeloTablaLibro;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorLibro extends MouseAdapter { //diferencia de implementar es que requerimos traer todos los metodos abstractos, en camnio con extends
    //ya lo hace solo
    private VentanaLibro view;
    private ModeloTablaLibro modelo; //aL DARLE CLICK A CARGAR EL MODELO SE VA A INSTANCIAR y asi
    public ControladorLibro(VentanaLibro view){
        this.view = view;
        this.view.getBtnCargar().addMouseListener(this);

    }
//Como heredamos ya del mouse adaptar podemos poner solamente el metodo que nos hereda
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo = new ModeloTablaLibro();
            modelo.cargarDatos();
            //Ya se cargaron la listas  y ahora agregamos la vista
            this.view.getTblLibrp().setModel(modelo);
            this.view.getTblLibrp().updateUI();
        }
    }
}
