package main.ejemplo2;

public interface Vehiculo {
    public  static  final int velocidad_maxima= 160; //final quiere decir constante
    public static  final char clasificacion_eficiencia= 'A';
    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void  frenar();
}
