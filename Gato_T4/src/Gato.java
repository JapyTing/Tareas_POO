import java.awt.*;

public class Gato {
    // Creaciòn de atributos
    private String nombre;
    private Byte edad;
    private String sexo;
    private Color color;
    private Float tamanio;

    // Constructo por defecto
    public Gato() {
    }

    //Constructor cargado
    public Gato(String nombre, Byte edad, String sexo, Color color, Float tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.color = color;
        this.tamanio = tamanio;
    }

    //Constructor especificando
    public Gato(String nombre, Byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodos  de acceso (Getter and Setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

    //ToString
    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", color=" + color +
                ", tamanio=" + tamanio +
                '}';
    }

    //Metodos de Gato (Acciones)
    //Metodo 1
    public int dormido (){
        int resultado = (int) (Math.random() * 5);
        int horas = 0;
        switch (resultado){
            case 0:
                horas = 2;
                System.out.println("El gato ha dormido " + horas + " horas");
                return horas;
            case 1:
                horas = 4;
                System.out.println("El gato ha dormido " + horas + " horas");
                return horas;
            case 2:
                horas = 6;
                System.out.println("El gato ha dormido " + horas + " horas");
                return horas;
            case 3:
                horas = 8;
                System.out.println("El gato ha dormido " + horas + " horas");
                return horas;
            case 4:
                horas = 10;
                System.out.println("El gato ha dormido " + horas + " horas");
                return horas;
            default:
                System.out.println("El gato no durmió nada");
                return 0;
        }
    }
    //Metodo 2
    public boolean jugar(){
        System.out.println("Agarraste un juguete de " + nombre + " veamos si quiere jugar");
        boolean resultado = Math.random() >0.51;
        if (resultado == true) {
            System.out.println("Parece que se estan divirtiendo ambos");
        } else {
            System.out.println("Ups parece que tiene un poco de sueño");
        }
        return  resultado;
    }
    // Metodo 3
    public String maullar(){
        System.out.println(nombre + " te esta viendo a los ojos parece que te quiere decir algo");
        String sonido = ("-Meooow");
        return sonido;
    }
}
