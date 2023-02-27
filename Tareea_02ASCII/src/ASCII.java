import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String entrada = teclado.nextLine();
        System.out.println("Tecleaste: " + entrada);
        boolean Consecutivo = true;
        int tam = entrada.length();

        if (tam < 2) {
            Consecutivo = false;
        } else {
            int uno = (int) entrada.charAt(0);
            for (int i = 1; i < tam; i++) {
                int dos = (int) entrada.charAt(i);
                if (dos != uno + 1) {
                    Consecutivo = false;
                }
                uno = dos;
            }
        }
        System.out.println(Consecutivo);
    }
}

