public class GatoDriver {
    public static void main (String[] args){
        Gato cat = new Gato("pelusa", (byte) 10);
        System.out.println(cat);
        System.out.println("-----------------------"); // Separacion
        System.out.println(cat.dormido()); // Metodo 1
        System.out.println("-----------------------");
        System.out.println(cat.jugar()); // Metodo 2
        System.out.println("-----------------------");
        System.out.println(cat.maullar()); // Metodo 3

    }
}
