import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Al dividir entre 0 nos madara una Excepcion tiopo aritmetic
        //Un buen manejoi de excepciones permite evitar que el usuario se encuentre con estos problemas,
        //y al momento en el que suceda la excepcion se mande un error, se ejecute un bloque de codigo
        //para tratar de solucionarlo ya que no falta el usuario que mandara 0
        // para eso especificamos con try y catch indicando el tipo de excepcion esperada
        try{
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine()); //
            System.out.println("Division " + (a/b)); //especificamos el error a procesar
        } catch (ArithmeticException e ){
            System.out.println("No se puede dividir entre 0 "); //De esta manera no mandara una excepecion y asi mostrara el error del usuaro


        } catch (NumberFormatException nfe){
            System.out.println("No capturaste el dato correctamente");

        } finally {
            System.out.println("Siempre se va a ejecutar"); // El finally se utiliza al momento de que se abre un recurso, con finally al ocurrir la excepcion se
            //cerrara este recurso
        }
        System.out.println("Fin del programa");


    }
}
