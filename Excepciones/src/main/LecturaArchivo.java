package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LecturaArchivo {


    public static void main(String[] args) {
        String ruta = "Datos.txt"; // Queremos abrir un archivo llamados datos.txt
        try{
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
        } catch (FileNotFoundException fnfe){
            System.out.println("El archivo no existe!! ");
            System.out.println(fnfe.getMessage());
        }
         // Nos maracara el fileareader que fiel not foud excepection, la procesaremos asi

//Como no hemos creado el archivo decimos que mandamos que el archivo no existe en catch

    }
}
