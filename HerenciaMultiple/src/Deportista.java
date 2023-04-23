//En vez de heredar declaramos interface para un AlumnoDeportista
public interface Deportista {
    public abstract int entrenar(); //Si quieres hacerlo explicito ponemos abstract
    public abstract boolean presentarCompetencia(String ubicacion);

}
