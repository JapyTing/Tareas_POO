import java.util.Arrays;

public class CajaSinGenericos {
    Object[] content; //Arreglo tipo objects

    public CajaSinGenericos() {
    }

    public CajaSinGenericos(Object[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add (int pos, Object objeto){ //recibiremos la posicion con un int y nos devolvera el objeto con la T
        content[pos] = objeto;

    }
    public  Object get(int pos){
        return content[pos];
    }
}
