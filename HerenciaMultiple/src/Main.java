public class Main {
    public static void main(String[] args) {
        AlumnoDeportistaArtista alum01 = new AlumnoDeportistaArtista();
        alum01.setNombre("Juan");
        alum01.setArte("Pintura");
        alum01.setDeporte("Basqeutbol");
        System.out.println(alum01);
        alum01.ensayar("oleo");
        alum01.entrenar();
        alum01.presentarCompetencia("Naucalpan");
    }
}
