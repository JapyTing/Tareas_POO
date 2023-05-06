import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public void  leer (String ruta) throws IOException{

           BufferedReader reader = new BufferedReader(new FileReader(ruta));
           //Dos formas de resolver esto, primero con try/catch
           String line ="";
           while ((line = reader.readLine()) != null) {
               System.out.println("Info " + line);
           }

//Si no queremos procesas la excepecion de esta manera podemos eliminar esto y usar throws
    //    try{
           // BufferedReader reader = new BufferedReader(new FileReader(ruta));
            //Dos formas de resolver esto, primero con try/catch
          //  String line = "";
         //   while ((line = reader.readLine()) != null){
            //    System.out.println("Info " + line);
        //    }
     //   } catch (IOException e){
       //     e.printStackTrace();
   //    }


    }
    public void metodoUno(String ruta) throws  IOException{
        this.metodoDos(ruta);
    }

    public void metodoDos(String ruta) throws IOException{
        this.leer(ruta);

    }
}
