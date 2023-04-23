public class Alumno extends Persona{
    private int numCuenta;
    private String carrera;
    private double promedio;

    public Alumno() {
    }
//Constructor cargado de persona
    public Alumno(String nombre, String edad) {
        super(nombre, edad);
    }

    //Constructor super cargado
    public Alumno(String nombre, String edad, int numCuenta, String carrera, double promedio) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numCuenta=" + numCuenta +
                ", carrera='" + carrera + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
