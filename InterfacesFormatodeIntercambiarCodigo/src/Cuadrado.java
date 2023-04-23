//Para implementar decimos implements
//Decimos que habra una clase llamado Cuadrado que implementa figura
//Se marca un error, nos dice que tiene que tener declarado abstract o implement method

//Osea que implementamos figura pero en figura hay un metodo abstracto que tienes que implementar
//Nos vemos obligado a ponerle cuerpo a todos los metodos abstractos que definimos en la Clase de Objetos
//Osea que calcularArea la implementamos aqui y le ponemos cuerpo a este

//A un usuario se le encargo circulo y a otro cuadrado
// El cuadrado tiene un dato privado que es lado y el ciruclo radio

//Este cuadrado lo hizo diana, ponemos
/**
 *
 * @Author Diana
 */

public class Cuadrado implements Figura {
    private double lado; // despues de declararlo hacemos metodos constructores
    //getters and setter y toString con solamente el dato privado

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }


    //Procedemos a poner el bloque de codigo para calcular el Area de un cuadrado
    //es diferente en cada figura
    public double calcularArea(){
        return this.lado * this.lado;
    }

}
