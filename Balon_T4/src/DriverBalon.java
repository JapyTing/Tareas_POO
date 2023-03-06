public class DriverBalon {
    public static void main (String[] args){
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
