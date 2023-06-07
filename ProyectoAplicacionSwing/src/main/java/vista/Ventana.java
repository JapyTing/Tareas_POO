package vista;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

//Creando la interfaz grafica
public class Ventana  extends JFrame {

    //Etiquetas
    private JLabel lblId;
    private JLabel lblMarca;
    private JLabel lblCorrea;
    private JLabel lblInteligente;
    private JLabel lblMecanismo;
    private JLabel lblUrl;
    private JLabel lblImagen;
    private JLabel lblEliminar;
//Actualizar
    private JLabel IdActualizar;
    private JLabel marcaNueva;
    private JLabel correaNueva;
    private JLabel inteligenteNueva;
    private JLabel mecanismoNueva;
    private JLabel urlNueva;

//Campos de texto
    private JTextField txtId;
    private JTextField txtMarca;
    private JTextField txtCorrea;
    private JTextField txtInteligente;
    private JTextField txtMecanismo;
    private JTextField txtUrl;
    private JTextField txtEliminar;

//Actualizar
    private JTextField txtidActualizar;
    private JTextField txtMarcaNueva;
    private JTextField txtCorreaNueva;
    private JTextField txtInteligenteNueva;
    private JTextField txtMecanismoNueva;
    private JTextField txtUrlNueva;
//Botones
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnActualizar;
    private JButton btnEliminar;

//Tabla
    private JTable tblRelojes;
    private JScrollPane scrollPane;
    private GridLayout layout;
    private JScrollBar scrollBar;

//Paneles
    private JPanel panel1; //Formulario para dar de alta relojes
    private JPanel panel2; //Tabla para mostrar los relojes de la base de datos
    private JPanel panel3; //Imagen del reloj correspondiente al registro seleccionado del panel 2
    private JPanel panel4; //Operaciones para eliminar y actualizar los campos de la tabla

//Connfiguracion de elementos de interfaz y su disenio

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,800); // Tamanio ventana
//Layout configuracion
        layout = new GridLayout(2,2); // Layout para los 4 paneles (habra 4 posiciones por eso decimos que es 2 x 2 )
        this.getContentPane().setLayout(layout); // Colocando nuestro layaout en el panel
//Paneles

 //Panel 1
        panel1 = new JPanel(new FlowLayout()); //Investigar///
        panel1.setBackground(new Color(58, 118, 171, 163));
        //Colocando componentes del formulario

        lblId = new JLabel("Id");
        lblMarca = new JLabel("Marca");
        lblCorrea = new JLabel("Correa");
        lblInteligente = new JLabel("Inteligente");
        lblMecanismo = new JLabel("Mecanismo");
        lblUrl = new JLabel("Url");

        txtId = new JTextField(3);
        txtId.setText("0");
        txtId.setEnabled(false);

        txtMarca = new JTextField(10);
        txtCorrea = new JTextField(10);
        txtInteligente = new JTextField(4);
        txtMecanismo = new JTextField(16);
        txtUrl = new JTextField(26);

        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblCorrea);
        panel1.add(txtCorrea);
        panel1.add(lblInteligente);
        panel1.add(txtInteligente);
        panel1.add(lblMecanismo);
        panel1.add(txtMecanismo);
        panel1.add(lblUrl);
        panel1.add(txtUrl);
        panel1.add(btnAgregar);

 //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(50, 155, 171));

        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);

        tblRelojes = new JTable(); // Tabla sin modelo, solo es la pura interfaz
        //Para esto se manejara en el Controlador

        scrollPane = new JScrollPane(tblRelojes);


        panel2.add(scrollPane);


 //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(98, 149, 201));
        panel3.setLayout(new FlowLayout()); // Recuadro para la imagen

        //Cargar imagen de internet
       // URL url = new URL();


        lblImagen = new JLabel(".////");
        panel3.add(lblImagen);


 //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(171, 219, 245));

        IdActualizar = new JLabel("Id a Actualizar");
        marcaNueva = new JLabel("Marca Nueva");
        correaNueva= new JLabel("Correa Nueva");
        inteligenteNueva = new JLabel("Inteligente Nuevo");
        mecanismoNueva = new JLabel("Mecanismo Nuevo");
        urlNueva = new JLabel("Url Nueva");
        lblEliminar = new JLabel("ID del registro");

        txtidActualizar = new JTextField(3);
        txtidActualizar.setText("0");
        txtidActualizar.setEnabled(true); // Ponemos true para buscar id  23:12

        txtMarcaNueva = new JTextField(10);
        txtCorreaNueva = new JTextField(10);
        txtInteligenteNueva = new JTextField(4);
        txtMecanismoNueva = new JTextField(16);
        txtUrlNueva = new JTextField(26);
        txtEliminar = new JTextField(4);

        btnActualizar = new JButton("Actualizar Registro");
        btnEliminar = new JButton("Eliminar Registro");

        panel4.add(IdActualizar);
        panel4.add(txtidActualizar);
        panel4.add(marcaNueva);
        panel4.add(txtMarcaNueva);
        panel4.add(correaNueva);
        panel4.add(txtCorreaNueva);
        panel4.add(inteligenteNueva);
        panel4.add(txtInteligenteNueva);
        panel4.add(mecanismoNueva);
        panel4.add(txtMecanismoNueva);
        panel4.add(urlNueva);
        panel4.add(txtUrlNueva);
        panel4.add(btnActualizar);
        panel4.add(lblEliminar);
        panel4.add(txtEliminar);
        panel4.add(btnEliminar);


        //Agregando paneles
        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Evento de cerrar programa
        this.setVisible(true); // Poniendo Visible nuestra interfaz
    }


    //Metodos de acceso para CONTROLADOR


    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblCorrea() {
        return lblCorrea;
    }

    public void setLblCorrea(JLabel lblCorrea) {
        this.lblCorrea = lblCorrea;
    }

    public JLabel getLblInteligente() {
        return lblInteligente;
    }

    public void setLblInteligente(JLabel lblInteligente) {
        this.lblInteligente = lblInteligente;
    }

    public JLabel getLblMecanismo() {
        return lblMecanismo;
    }

    public void setLblMecanismo(JLabel lblMecanismo) {
        this.lblMecanismo = lblMecanismo;
    }

    public JLabel getLblUrl() {
        return lblUrl;
    }

    public void setLblUrl(JLabel lblUrl) {
        this.lblUrl = lblUrl;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtCorrea() {
        return txtCorrea;
    }

    public void setTxtCorrea(JTextField txtCorrea) {
        this.txtCorrea = txtCorrea;
    }

    public JTextField getTxtInteligente() {
        return txtInteligente;
    }

    public void setTxtInteligente(JTextField txtInteligente) {
        this.txtInteligente = txtInteligente;
    }

    public JTextField getTxtMecanismo() {
        return txtMecanismo;
    }

    public void setTxtMecanismo(JTextField txtMecanismo) {
        this.txtMecanismo = txtMecanismo;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(JTextField txtUrl) {
        this.txtUrl = txtUrl;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTable getTblRelojes() {
        return tblRelojes;
    }

    public void setTblRelojes(JTable tblRelojes) {
        this.tblRelojes = tblRelojes;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getIdActualizar() {
        return IdActualizar;
    }

    public void setIdActualizar(JLabel idActualizar) {
        IdActualizar = idActualizar;
    }

    public JLabel getMarcaNueva() {
        return marcaNueva;
    }

    public void setMarcaNueva(JLabel marcaNueva) {
        this.marcaNueva = marcaNueva;
    }

    public JLabel getCorreaNueva() {
        return correaNueva;
    }

    public void setCorreaNueva(JLabel correaNueva) {
        this.correaNueva = correaNueva;
    }

    public JLabel getInteligenteNueva() {
        return inteligenteNueva;
    }

    public void setInteligenteNueva(JLabel inteligenteNueva) {
        this.inteligenteNueva = inteligenteNueva;
    }

    public JLabel getMecanismoNueva() {
        return mecanismoNueva;
    }

    public void setMecanismoNueva(JLabel mecanismoNueva) {
        this.mecanismoNueva = mecanismoNueva;
    }

    public JLabel getUrlNueva() {
        return urlNueva;
    }

    public void setUrlNueva(JLabel urlNueva) {
        this.urlNueva = urlNueva;
    }

    public JTextField getTxtidActualizar() {
        return txtidActualizar;
    }

    public void setTxtidActualizar(JTextField txtidActualizar) {
        this.txtidActualizar = txtidActualizar;
    }

    public JTextField getTxtMarcaNueva() {
        return txtMarcaNueva;
    }

    public void setTxtMarcaNueva(JTextField txtMarcaNueva) {
        this.txtMarcaNueva = txtMarcaNueva;
    }

    public JTextField getTxtCorreaNueva() {
        return txtCorreaNueva;
    }

    public void setTxtCorreaNueva(JTextField txtCorreaNueva) {
        this.txtCorreaNueva = txtCorreaNueva;
    }

    public JTextField getTxtInteligenteNueva() {
        return txtInteligenteNueva;
    }

    public void setTxtInteligenteNueva(JTextField txtInteligenteNueva) {
        this.txtInteligenteNueva = txtInteligenteNueva;
    }

    public JTextField getTxtMecanismoNueva() {
        return txtMecanismoNueva;
    }

    public void setTxtMecanismoNueva(JTextField txtMecanismoNueva) {
        this.txtMecanismoNueva = txtMecanismoNueva;
    }

    public JTextField getTxtUrlNueva() {
        return txtUrlNueva;
    }

    public void setTxtUrlNueva(JTextField txtUrlNueva) {
        this.txtUrlNueva = txtUrlNueva;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JLabel getLblEliminar() {
        return lblEliminar;
    }

    public void setLblEliminar(JLabel lblEliminar) {
        this.lblEliminar = lblEliminar;
    }

    public JTextField getTxtEliminar() {
        return txtEliminar;
    }

    public void setTxtEliminar(JTextField txtEliminar) {
        this.txtEliminar = txtEliminar;
    }

    public void limpiar(){
        txtMarca.setText("");
        txtCorrea.setText("");
        txtInteligente.setText("");
        txtMecanismo.setText("");
        txtUrl.setText("");
        txtMarcaNueva.setText("");
        txtCorreaNueva.setText("");
        txtInteligenteNueva.setText("");
        txtMecanismoNueva.setText("");
        txtUrlNueva.setText("");
        txtEliminar.setText("");
    }
}
