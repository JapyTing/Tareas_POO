import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);
        System.out.println("Ingresa una cadena de 9 caracteres que sean solamente (X,O,_)");
        String carac = gato.nextLine().toUpperCase();
        int x = 0;
        while (x == 0) {
            if (carac.length() == 9) {
                boolean c = true;
                for (int i = 0; i < carac.length(); i++) {
                    char jugada = carac.charAt(i);
                    if (jugada != 'X' && jugada != 'O' && jugada != '_') {
                        c = false;
                    }
                }
                if (c) {
                    System.out.println("-----");
                    System.out.println("|" + carac.charAt(0) + carac.charAt(1) + carac.charAt(2) + "|");
                    System.out.println("|" + carac.charAt(3) + carac.charAt(4) + carac.charAt(5) + "|");
                    System.out.println("|" + carac.charAt(6) + carac.charAt(7) + carac.charAt(8) + "|");
                    System.out.println("-----");
                    x = 1;
                } else {
                    System.out.println("Cadena invalida, solo se admiten 'X,O,_'");
                    carac = gato.nextLine().toUpperCase();
                }
            } else {
                System.out.println("Cadena invalida, solo se admiten 9 caracteres.");
                carac = gato.nextLine().toUpperCase();
            }
        }
    }
}