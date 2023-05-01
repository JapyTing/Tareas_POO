package IU;

import IU.Eventos.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame { //para quie haga ventana decimos que herede de Frame para hacer el import
    //Configuracion
    //COmo vamos a hacer 3 botones tendremos que implementar composicion y declarar los objetos

    private Label lblNombre;
    private TextField txtNombre;
    private Button btnBoton1;


    //Constructor del titulo, empezamos a configurar el layout, es decir como se ajustaran los elementos en la pantalla

    //Todo lo que queramos configurar lo hacemos en el constructor
    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(800, 600); //Estableciendo del tamaño,
        this.setLayout(new FlowLayout()); //Hay varios Layout //Forma de organizar
        this.lblNombre = lblNombre;
        //Tras organizar creamos los objetos y los ponemos en nuestra interfaz
        lblNombre = new Label("Nombre"); //Etiqueta
        this.add(lblNombre); //Agregamos nuestro label a la interfaz con esto

        //Atributo de txtNomnbre configuracion
        txtNombre = new TextField(30);
        this.add(txtNombre); //Lo agregamos


        //Atributo Boton
        btnBoton1 = new Button("Saludar");
        this.add(btnBoton1); //Agregamos el boton al contenedero

        //Agreganis el oyente al boton a la interfaz
        // btnBoton1.addMouseListener(new EventosRaton()); //Al hacer click lanzara un objeto tipo evento, un escucha estara atento y mandara
        //el se hizo click

        //Ahora con adapatadores que simplifica el codigo y nos permite acceso directo a variables
        btnBoton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtNombre.getText()); //Quitamos lo que estaba y decimos que nos devuelva el texto ingresado al hacer click

                //Tecnologia Swing que crea ventanas de dialogo, esto lo manda en la interfaz
                JOptionPane.showMessageDialog(null,"Hola" + txtNombre.getText());

            }
        });


        this.setVisible(true); //Hacemos que lo configurado se vea
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //Con esto cerramos la ventana
            }
        });

    }







}
