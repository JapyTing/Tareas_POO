import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Caja <String>  micaja = new Caja<>(new String[10]); //dECIMOS QUE LA CAJA MANEJARA UNA STRING
        micaja.add(0,"hola");
        micaja.add(1,"adios");
        micaja.add(2,"hi");
        System.out.println(micaja); //Arregglo de tipo de objetops strings


        System.out.println("/////////"); //Sin genericos
        CajaSinGenericos cajasin = new CajaSinGenericos(new Object[10]);
        cajasin.add(0,"Hola"); //Se manda como string pero se recibe como objeto
        cajasin.add(1,"adios");
        cajasin.add(2,"hi");
        System.out.println(cajasin);

        //Si queremos obtener el elemtno 0, sabemos que son strings en el de genericos
        String temp = micaja.get(0); //marcaria error si no fuera generico
        // String temp2 = cajasin.get(0); //NO ESTAMOS MANEJANDO STRINGS SI NO UN DATO TIPO OBJECT, en el generico en cambio podemos establecer que dato guardara nuestra caja
        //Para hacerlo sin generico, forzamos un casting de datos complicando la cosa a la larga en programacion avanzada
        String temp2 = (String)cajasin.get(0);

        System.out.println("////COMIDA/////");
        //otra clase caja con genericos que guardara comida

        Caja<Comida> cajacomida = new Caja<>(new Comida[10]);
        cajacomida.add(0,new Comida("Yogurth",true));
        System.out.println(cajacomida.get(0)); //convertira el objeto comida que esta en la posicion 0, se ejecuta el to string
        //el generico al saber que tipo de dato va a tener te lo regresa de la manmera to string, arriba hicimos una caja que maneje string, ahorita una caja
        //una caja que maneja la clase comida, podemos hacer una caja que maneje libros creando la clase libros
        //<Comida> y <String> remplaza la T en la clase caja, esto es un generico, algo que se sustituye

        //Los genericos se usan para colecciones Java, JCF es un cojunto de clase e interfaces que implementan diferentes estructuras de datos de uso frecuente, en realidad es una API
        // sus clases proveen funcionalidad para la gestion dinamica de colecciones de objetos listas y colecciones (String es una coleccion de cadenas) un int [] es una coleccion de numeros enteros
        // un object [] es una coleccion de objetos

        //Interfaz es una definicion 100% abstractas que tienen metodos abstractos, nos dicen que elementos debe tener las clases que implementan
        //ejemplo en java colections la clase list tiene 4 implementaciones, 4 clases que implementan la interfaz list
        //En la api de list

        System.out.println("ARRAYLIST CLASES GENERICAS");

        //El framework nos permite cualquier tipo de arreglos de cualquier tipo de datos

        ArrayList<Comida> comidas = new ArrayList<>(); //Mas sencillo que nuestra caja que hicimos ya que esta su desventaja
        //Es que el tamaÑo es fijo, mientras que la arraylist osea el framework es dinamica, empieza vacio y podemos agregar o eliminar

        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("Manzana", false)); //Total de zanahorias: 12
        System.out.println(comidas.size());//El framework de arralist nos proporciona clases incluyendo esta tambien que se comporta como un arreglo
        //Al ser una clase tambien tiene metodos que nos ayudaran
        System.out.println(comidas.get(11));//El concepto de genericos nos permitira que cualquier estructura de datos la podemos utilizar con cualquier tipo de dato

        //Otra clase
        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria",false));
        comidas2.add(new Comida("Yogurth",true));
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("Bistec",false)); //Ventajas de las estructura de datos del framework de colecciones
        //Obtener cualquiera
        System.out.println(comidas2.get(3)); // Manzana
        //Sustituir manzana por otro
        comidas2.set(3,new Comida("Fresa",false));
        comidas2.add(3,new Comida("Naranja",false)); //Recorremos comidas
        System.out.println("----Final----");
        for (Comida comida: comidas2 //For especial que forma parte de colecciones, como es un arreglo va a iterar todos los elementos del arreglo y lo sacara en objeto comida, en comidas 2 tenemos 5,
             ) {
            System.out.println(comida);

        }
        //Genericos se usa para colecciones y no preocuparse para la conversion de datos


    }

}
