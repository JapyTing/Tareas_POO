public class AlumnoDeportistaArtista extends Alumno implements  Deportista,Artista{
    //Ponemos los datos de esta clase propia

    private int idActividadExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    //Constructor sobrecargado, el ultimo, atributos de persona, alumno y de esta clase

    public AlumnoDeportistaArtista(String nombre, String edad, int numCuenta, String carrera, double promedio, int idActividadExtra, String deporte, String arte) {
        super(nombre, edad, numCuenta, carrera, promedio);
        this.idActividadExtra = idActividadExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdActividadExtra() {
        return idActividadExtra;
    }

    public void setIdActividadExtra(int idActividadExtra) {
        this.idActividadExtra = idActividadExtra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }
//Hacemos que regrese lo de persona y alumno con return super
    @Override
    public String toString() {
        return super.toString() +
                "idActividadExtra=" + idActividadExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String diciplina) {
        System.out.println("El alumno esta ensayando: " + this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " esta presentando su obra");
        return false;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " esta entrenando el deporte " + deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + " esta en competencia del deporte " + deporte);
        return false;
    }
}
