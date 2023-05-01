import java.util.Arrays;

//Ejemplo genericos
//Con <T> T es un sub indice que decimos que es una variable temporal, y asi indicamos que sera
//Una clase generica
public class Caja <T> {
    public static final int CAPACIDAD = 10;
    private T[] content; //Decimos que el arreglo o lista se llamara content

    public Caja() {
    }

    public Caja(T[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
    //metodo llamado add que recibira un posicion y metera un objeto de tipo generico en esa posicion
    //y el metodo get le damos posiscion y nos dara el objeto de esa posicion
    public void add (int pos, T objeto){ //recibiremos la posicion con un int y nos devolvera el objeto con la T
        content[pos] = objeto;

    }
    public  T get(int pos){
        return content[pos];
    }
}

