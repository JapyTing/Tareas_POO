package controlador;

import Persistencia.ConexionSingleton;
import Persistencia.RelojesDAO;
import controlador.ControladorReloj;



//Acciones de la base de datos

import modelo.ModeloTablaReloj;
import modelo.Relojes;
import vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorReloj extends MouseAdapter {
    //Declarando la accion de click o view y el modelo para cargar datos
    private Ventana view;
    private ModeloTablaReloj modelo; // Interactua con el modelo y del modelo hacia la base de datos
    public ControladorReloj(Ventana view) {
        //Agregar botones aqui
        this.view = view;
        modelo = new ModeloTablaReloj(); // Se crea el modelo instanciando tabla
        this.view.getTblRelojes().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblRelojes().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //Boton cargar
        //Identificar los diferentes botones agregando funcion del boton CARGAR
        if (e.getSource() == this.view.getBtnCargar()){
            //Al dar click al boton cargar pasara lo siguiente
            modelo.cargarDatos(); //Se cargan los datos
            //Asignamos a la ventana ese modelo
            this.view.getTblRelojes().setModel(modelo);
            this.view.getTblRelojes().updateUI();

        }

        //BotonAgregar
        if (e.getSource() == this.view.getBtnAgregar()){
            Relojes relojes = new Relojes(); //Creando reloj vacio.
            relojes.setId(0); // No se usara este termino
            relojes.setMarca(this.view.getTxtMarca().getText()); // El set vendra de la vista y el recuadro de texto
            relojes.setCorrea(this.view.getTxtCorrea().getText());
            relojes.setInteligente(this.view.getTxtInteligente().getText());
            relojes.setMecanismo((this.view.getTxtMecanismo().getText()));
            relojes.setUrl(this.view.getTxtUrl().getText());
            if (modelo.agregarReloj(relojes)){
                JOptionPane.showMessageDialog(view, "Se agrego correctamente",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblRelojes().updateUI();
            } else {
                JOptionPane.showMessageDialog(view,
                        "No se pudo agregar a la base de datos. Revise su conexion",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE );
            }
            this.view.limpiar();

        }

        //BotonActualizar
        if (e.getSource() == this.view.getBtnActualizar()) {
            int confirmacion = JOptionPane.showConfirmDialog(view, "Esta seguro que desea actualizar un registro?",
                    "Actualizar Datos", JOptionPane.YES_NO_OPTION);
            if (confirmacion == 0) {
                Relojes relojes = new Relojes();
                relojes.setId(Integer.parseInt((String) this.view.getTxtidActualizar().getText()));
                relojes.setMarca(this.view.getTxtMarcaNueva().getText()); // El set vendra de la vista y el recuadro de texto
                relojes.setCorrea(this.view.getTxtCorreaNueva().getText());
                relojes.setInteligente(this.view.getTxtInteligenteNueva().getText());
                relojes.setMecanismo((this.view.getTxtMecanismoNueva().getText()));
                relojes.setUrl(this.view.getTxtUrlNueva().getText());
                this.view.getTblRelojes().updateUI();
                if (modelo.update(relojes)) {
                    JOptionPane.showMessageDialog(view, "Se actualizo correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblRelojes().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "Error al actualizar", "Aviso", JOptionPane.ERROR_MESSAGE);

                }
                this.view.limpiar();
            } else {
                this.view.limpiar();
            }
        }

        //BotonEliminar
        if (e.getSource() == this.view.getBtnEliminar()) {
            int confirmacion = JOptionPane.showConfirmDialog(view, "¿Está seguro?", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                try {
                    String sqlDelete = "DELETE FROM Relojes WHERE id=?";
                    PreparedStatement pstm = ConexionSingleton.getInstance("RelojesDB.db").getConnection().prepareStatement(sqlDelete);
                    pstm.setInt(1, Integer.parseInt(this.view.getTxtEliminar().getText()));
                    pstm.executeUpdate();
                    JOptionPane.showMessageDialog(view, "Se eliminó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblRelojes().updateUI();
                    this.view.limpiar();
                } catch (NumberFormatException | SQLException ex) {
                    JOptionPane.showMessageDialog(view, "Error al eliminar", "Aviso", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        }

        //Imagen
        if (e.getSource() == this.view.getTblRelojes()){
            int rowIndex = this.view.getTblRelojes().getSelectedRow();
            modelo.imagen(rowIndex);
            Relojes temp = modelo.imagen(rowIndex);
            this.view.getLblImagen().setText("");
            this.view.getLblImagen().setIcon(temp.createIcon());
        }


        }
}

