public class Main {
    public static void main (String[] args){
    //Clase Gato
        Gato cat = new Gato("pelusa", (byte) 10);
        System.out.println(cat);
        System.out.println("-----------------------"); // Separacion
        System.out.println(cat.dormido()); // Metodo 1
        System.out.println("-----------------------");
        System.out.println(cat.jugar()); // Metodo 2
        System.out.println("-----------------------");
        System.out.println(cat.maullar()); // Metodo 3

        System.out.println("-----------------------");
        System.out.println("-----------------------"); // Siguiente clase (separacion)
    //Clase Balon
        Balon ball = new Balon("Wilson", 2.5F, "Basquet");
        System.out.println(ball);
        System.out.println("-----------------------"); // Separacion
        System.out.println(ball.rodad());
        System.out.println("-----------------------");
        System.out.println(ball.ponchar());
        System.out.println("-----------------------");
        System.out.println(ball.puntos());
    }
}
