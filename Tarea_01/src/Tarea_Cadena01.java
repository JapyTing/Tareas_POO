import java.util.Scanner;

public class Tarea_Cadena01 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Escribe tu nombre,profesion y pais, seperado unicamente por un guion (-) : ");
        String informacion = datos.nextLine();
        String[] separado = informacion.trim().split("-");
        for (int i = 0; i < separado.length; i++) {
            if (i == 0) {
                System.out.println("Nombre: " + separado[i].toUpperCase());
            } else if (i == 1) {
                System.out.println("Profesion: " + separado[i].toUpperCase());
            } else if (i == 2) {
                System.out.println("Nacionalidad: " + separado[i].toUpperCase());
            }
        }
    }
}