package controlador;

import Vista.VentanaLibro;
import modelo.Libro;
import modelo.ModeloTablaLibro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorLibro extends MouseAdapter { //diferencia de implementar es que requerimos traer todos los metodos abstractos, en camnio con extends
    //ya lo hace solo
    private VentanaLibro view;
    private ModeloTablaLibro modelo; //aL DARLE CLICK A CARGAR EL MODELO SE VA A INSTANCIAR y asi
    public ControladorLibro(VentanaLibro view){
        this.view = view;
        modelo = new ModeloTablaLibro(); // Instanciando el modelo de las tablas
        this.view.getTblLibrp().setModel(modelo); // Para que agrege de poc a en poco en caso de noc argar
        this.view.getBtnCargar().addMouseListener(this);
        //Agregamos al boton de agregar la accion
        this.view.getBtnAgregar().addMouseListener(this);

    }
//Como heredamos ya del mouse adaptar podemos poner solamente el metodo que nos hereda
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            //Ya se cargaron la listas  y ahora agregamos la vista
            this.view.getTblLibrp().setModel(modelo);
            this.view.getTblLibrp().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()){
            Libro libro = new Libro();
            libro.setId(0);
            libro.setTitulo(this.view.getTxtTitulo().getText());
            libro.setAutor(this.view.getTxtAutor().getText());
            if (modelo.agregarLibro(libro)){
                JOptionPane.showMessageDialog(view,"Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE );
                this.view.getTblLibrp().updateUI(); // Para que se actualize la base de datos luego luego de agregar algo

            }else{
                JOptionPane.showMessageDialog(view,
                        "No se pudo agregar a la base de datos. Porfavor revise su conexion",
                        "Error al insertar",JOptionPane.ERROR_MESSAGE
                );

            }
        }

        this.view.limpiar();
    }


}
