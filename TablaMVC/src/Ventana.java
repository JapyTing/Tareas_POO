import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

//Jframe es para crear interfaces
public class Ventana extends JFrame {
    private JLabel lblid;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPeso;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtid;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPeso;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;

    //Tabla
    private JTable tblTabla;

    //Boton para capturar
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;

    //Modelo
    private ModeloTablaJuego modelo;
    //Modelo requiere un arraylist que sera info
    private ArrayList<VideoJuego> info;
    //Contenedor para agregar barra de scroll si la tabla se hace larga
    private JScrollPane scroll;
//Nos vamos a constructo despues a String y posterios seleccionamos none
//Constructor de tipo String del titulo

    //Configurando ventana
    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 700);

        layout = new GridLayout(2, 1); //GRID IMPORTANTE
        this.setLayout(layout); //Agregando el layout


        //Panel 1 componentes
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(60, 144, 111)); //Configurando fondo
        lblid = new JLabel("Id");
        txtid = new JTextField(4);
        panel1.add(lblid);
        panel1.add(txtid);

        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        this.getContentPane().add(panel1, 0);

        lblGenero = new JLabel("Genero");
        txtGenero = new JTextField(15);
        panel1.add(lblGenero);
        panel1.add(txtGenero);
        this.getContentPane().add(panel1, 0);

        lblPeso = new JLabel("Peso (GB)");
        txtPeso = new JTextField(5);
        panel1.add(lblPeso);
        panel1.add(txtPeso);
        this.getContentPane().add(panel1, 0);

        lblPlataforma = new JLabel("Plataforma");
        txtPlataforma = new JTextField(5);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);

        lblDesarrollador = new JLabel("Desarrollador");
        txtDesarrollador = new JTextField(25);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);


//Botones
        btnAgregar = new JButton("Agregar Juegos");
        panel1.add(btnAgregar);

        this.getContentPane().add(panel1, 0);




        //Panel 2 (Tabla)
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(155, 70, 187));
        //Arralist llamada info
        info = new ArrayList<>();
        info.add(new VideoJuego(1, "League of Legends", "Moba", 4.5, "Windows y Mac",
                "Riot Games"));

        modelo = new ModeloTablaJuego(info);
        //Creando tabla
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);




        this.getContentPane().add(panel2, 1);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Ya no requerimos listener para cerrar
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoJuego nuevo = new VideoJuego();
                nuevo.setId(Integer.parseInt(txtid.getText())); // Casting de datos convierte String a entero
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoGB(Double.parseDouble(txtPeso.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDesarrollador.getText());
                //info.add(nuevo) ;//Para aniadir a la lista
                modelo.agregarJuego(nuevo);
                tblTabla.updateUI(); //Para ir actualizando la tabla e incorporar los datos para que sea visible

            }
        });

        this.setVisible(true);




    }
}
