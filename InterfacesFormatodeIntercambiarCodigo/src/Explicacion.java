public class Explicacion {
    //Al momento de desarrollar aplicaciones o programas dentro de un equipo, para esto y la programacion de sus metodos y clases
    //es mejor declararar las clases que se definiran solo como se usara y no se implementara el metodo completo o por defecto su contenido


    //Para establecer nombre de metodos se declaran en una interface y asi se siguen las reglas de como fue declaradas (clases abstractas e interfaces
    //Las clases abstractas se basan en metodos abstractos (Define la estructura de la cabecera, pero no tiene cuerpo de codigo)

    // Un ejemplo podria ser CABEZERA: public abstract int sumar, int b);
    //                       CUERPO:    c = a + c   return c;   (este no es un metodo abstrracto por que tiene cuerpo

    //Ejemplo de metodo abstracto 1.- public abstract int sumar (int a, intb), ✅
    //2.- public int sumar (int a, int b);✅
    //En conclusion un metodo abstracto contiene la palabra reservada abstract (opcional), termina con ";"
    //No tiene cuerpo ni llaves {}

    //Ejemplo de metodo NO abstracto (tienen cuerpo)
    // public int sumar (int a,int b){
    //    return a+b;
    //}

    //Cual de los siguientes son metodos abstractos?
    //public int restar (int a, int b) ; ✅No tiene cuerpo
    //public int dividir(int a, int b) {}🚫 Aunque su cuerpo esta vacia, si tiene
    //public abstract int dividir (int a, int b){} 🚫Apesar de que tiene abstract, este tiene cuerpo
    //public void dormir(); ✅
    //public abstract float calcularSalario(int dias, float salarioDia); ✅Metodo abstracto mas completo

    //INTERFACES
    //En java es una declaracion abstracta pura, donde todos los son metodos abstractos
    //Cuando declaramos en un archivo un conjunto de metodos abstractos, donde definimos la estructura de los metodos a utilizar
    //Posterior alguien mas pondra la implementacion del cuerpo

    //El diseñador de clases establece el nombre de metodos, lista de argumentos que recive el metodo (a+b), y define el tipo de retorno
    //La interfaz establece un protocolo entre clases que establece una buena comunicacion
    //Un ejemplo de protocolo es al navegar en la web, el webbrowser se comunica con un servidor que se basa en un protocolo
    //para la buena comnicacion
    //En conclusion las interfaces es un protocolo de quie DISEÑO la cabecera,quien lo va a IMPLEMENTAR y quien va a USAR la cabecera.
    //DIEGO escribio el codigo,JUAN fue el arquitecto que definio el metodo abstracto,DIANA que en un metodo main hace uso del metodo implementado por diego
    //DIANA se comunica con DIEGO por la cabecera que establecio JUAN, (Protocolo)

    //Manera de establecer comunicacion entre codigos por medio de un protocolo para que varios desarrolladores
    //trabajen por su cuenta

    //Se declaran con la palabra reservada Interface
    //De manera grafica se hace con una flecha en blanco
    //Ejemplo inteface de figura



    //Las interfaces se usan en muchos frameworks de avanzada programacion,
    //son plantillas prefabricadas de proyectos donde configuramos, creamos clases y tenemos
    // una aplicacion completa. Tambien se usan para tecnologias avanzadas como conexiones a bases de datos
    //donde si tu quieres un metodo llamado conectar, tiene que tener tal estructura establecida por el proveedor de la bse de datos
    //tener tal parametros, implementar el codigo. Si te cambias de mysql a oracle, no ocupas cambiar los metodos debido a las interfaces
    //Solo cambias la conexion de mysql a conectar con oracle




}




