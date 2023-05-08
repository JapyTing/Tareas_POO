import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaSwing extends JFrame {
    private JLabel etiqueta1;
    private JTextField txtGrados;
    private JButton boton01;
    private JLabel lblResultado;
    private FlowLayout layout; //Para disposiciones


    //Configuracion de la interfaz
    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        //Creando layout
        layout = new FlowLayout();
        //En vez de agregar los componentes directamente sobre la clase como en AWT agregamos un content paint que es un contenedor de tipo panel
        //para organizar mejor los componentes

        this.getContentPane().setLayout(layout); //Como lo vamos a poner en ese panel, lo tenemos que obtener
        //por metodos de acceso para el atributo contentPane

        //Agregamos el primer elemento al contenPane
        etiqueta1 = new JLabel("Gradis C."); //Creamos la etiqueta
        this.getContentPane().add(etiqueta1); //Agregamos la etiqueta a la interfaz

        //Continuamos con los demas componentes
        txtGrados = new JTextField(10);
        this.getContentPane().add(txtGrados);

        //Boton
        boton01 = new JButton("Convertir");
        this.getContentPane().add(boton01);
        //Resultado
        lblResultado = new JLabel("0.0  F");
        this.getContentPane().add(lblResultado);
//Hasta ahora tenemos echa la interfaz grafica lista, pero lo que nos falta es hacer que el boton de
        //Convertir funcione, a esto se le llaman eventos y estos se programan

        //Programando el evento del boton
        this.boton01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados = Double.parseDouble(txtGrados.getText()); //Convierte un string a ese tipo de dato deseado
                double faranheid = (centigrados * 9.0/5.0) + 32.0;
                lblResultado.setText(faranheid + " F");


            }


            //Al poner txtGrados.getText nos regresara un string y lo que hara el metodo parseDouble es convertir ese strin a dato tipo Double
            //Pero puede ocurrir una excepcion aqui tipo Math
        });


        //Agregando evento ventana para que se cierre
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Adios....");
                System.exit(0); //Ponemos 0 por que al cerrar dira que hay 0 errores
            }
        });


        this.setVisible(true); //Hacemos esto para que la interfaz sea visible




    }



}
