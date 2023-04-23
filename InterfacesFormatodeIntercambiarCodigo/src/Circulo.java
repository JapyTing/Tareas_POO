//Para implementar decimos implements
//Decimos que habra una clase llamado circulo que implementa figura
//Se marca un error, nos dice que tiene que tener declarado abstract o implement method

//Osea que implementamos figura pero en figura hay un metodo abstracto que tienes que implementar
//Nos vemos obligado a ponerle cuerpo a todos los metodos abstractos que definimos en la Clase de Objetos
//Osea que calcularArea la implementamos aqui y le ponemos cuerpo a este

//A un usuario se le encargo circulo y a otro cuadrado
public class Circulo implements Figura{
    private double PI = 3.1416;
    private double radio;

    public Circulo() {
    }
    public Circulo(double PI, double radio) {
        this.PI = PI;
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "PI=" + PI +
                ", radio=" + radio +
                '}';
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    //Para implementar el metodo abstracto mas facil presionamos Ctrl + space

    @Override // Es para sobrescribir
    public double calcularArea(){
        return this.PI * radio; //Cuerpo e implementamos el codigo propio del ciruclo
    }
}
