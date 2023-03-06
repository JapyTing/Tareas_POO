import com.sun.jdi.FloatType;

public class Balon {
    //Atributos
    private String marca;
    private Float tamanio;
    private Float peso;
    private Boolean aire;
    private String deporte;

    // Constructor por defecto
    public Balon() {
    }

    // Constructor cargado
    public Balon(String marca, Float tamanio, Float peso, Boolean aire, String deporte) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.peso = peso;
        this.aire = aire;
        this.deporte = deporte;
    }

    //Constructor especificando
    public Balon(String marca, Float tamanio, String deporte) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.deporte = deporte;
    }

    //Metodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Float getTamanio() {
        return tamanio;
    }

    public void setTamanio(Float tamanio) {
        this.tamanio = tamanio;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Boolean getAire() {
        return aire;
    }

    public void setAire(Boolean aire) {
        this.aire = aire;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    //ToString

    @Override
    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                ", peso=" + peso +
                ", aire=" + aire +
                ", deporte='" + deporte + '\'' +
                '}';
    }

    //Metodos de balon (Acciones)
    //Metodo 1
    public int rodad() {
        int resultado = (int) (Math.random() * 10.0);
        System.out.println("El balon rodo " + resultado + " cm");
        return resultado;
    }

    //Metodo 2
    public boolean ponchar(){
        boolean resultado = Math.random()<0.51;
        if (resultado == true) {
            System.out.println("Ups, el balòn se a ponchado de tanto uso");
        } else {
            System.out.println("Parece que el balon de " + deporte + " tiene una fuga de aire");
        }
        return resultado;
    }

    //Metodo 3
    public boolean puntos(){
        boolean resultado = Math.random()<0.50;
        System.out.println("Haz lanzado el balon con toda tu fuerza");
        if (resultado == true){
            System.out.println("Felicidades, has lgorado sumar puntos");
        } else {
            System.out.println("Te has metido en serios problemas, el balon de " + deporte + " le a pegado en la cara a alguien");
        }
        return resultado;
    }
}
