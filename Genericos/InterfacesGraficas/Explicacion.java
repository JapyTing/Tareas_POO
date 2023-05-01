public class Explicacion {

    //Tenemos dos tecnologias AWT: Abstract Windows Toolkit se pueden hacer aplicaciones rapdiamente
    //Las clases disponibles se heredan, una ventana de programa esta compuesta por varios componentes
    //Podemos hacer un editor tipo paint
    //Esto tiene una jerarquia donde tenemos al principal "Componente", tenemos buttom que son los botones, canvas son las areas en blanco donde podemos pintar primitivas
    //checkbox son los que damos click y se palomean, label o etiquetas, list son listas, scrollbor es para subir y bajar, text component donde tenemos text field que es el cuadro donde metemos datos
    //y el text area es el multilinea, al final tenemos los containers que es un tipo de componente especial que es el tipo de clase que contiene a las demas, es decir.
    //Si nosotros tenemos que poner un boton en cualquier lado primero ponemos el container

    //Para hacer una interfaz grafica primero ponemos un container, contiene componentes y realizan composicion, para posicionarlos en el container usamos
    // GESTO DE DISPOSICION (lAYOUTS), para hacer ventanas rehusa las del sistema operativo, es decir la ventana donde se ejecutan
    //Swing es una teconologia que usa bibliotecas propias para realizar sus ventanas

    //Hay tipos de contenedores como la window y frame, cada una con sus respectivos metodos
    //En la Java api de Frame container hereda de component, container le agrego otros metodosm container hereda a window y asi window a frame


    //Para organizar crearemos un paquete llamado IU interfaz de usuario (ventanas)  y otro paquete para Modelo (clases que gestionaran la informacion)
    // luego otro paquete que sera el de datos



    //Los eventos son las acciones que haran nuestra interfaz, para implemenetar eventos se utilizan interfaces java
    //que heredan de Event Listener, estos conectan el origen del evento con nuestro codigo escrito
    //Maneja un concepto llamado listener que es un oyente, habra un objeto que emite el evento, osea un boton ya que este recibe el click
    //  Al darle click, la tecnologia generera un objeto de tipo evento (mouseclick), lo lanza la tecnologia por medio de interfaces
    // por ultimo nosotros implementamos el listener, estas son interfaces (actualListener, MouseListener (click), KeyListener(teclado), WindowListener(eventos de cerrar ventana, minimizar) )


//Un mecanismo de implementar los listener es por medio de sus interfaces donde hay metodos abstractos que conectan con los otros dos objetos de manera automatica
//Hay dos formas de usarlos, implementando la intergfaz o usando el adapatador que nos da una ventaja