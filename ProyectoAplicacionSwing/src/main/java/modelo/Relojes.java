package modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

//Almacenara la informacion que venga de la base de datos
public class Relojes {

//Atributos
    private int id;
    private String marca;
    private String correa;
    private String inteligente;
    private String mecanismo;
    private String url;
//Constructor por defecto
    public Relojes() {
    }

    //Constructor sobrecargado
    public Relojes(int id, String marca, String correa, String inteligente, String mecanismo, String url) {
        this.id = id;
        this.marca = marca;
        this.correa = correa;
        this.inteligente = inteligente;
        this.mecanismo = mecanismo;
        this.url = url;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCorrea() {
        return correa;
    }

    public void setCorrea(String correa) {
        this.correa = correa;
    }

    public String getInteligente() {
        return inteligente;
    }

    public void setInteligente(String inteligente) {
        this.inteligente = inteligente;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //ToString
    @Override
    public String toString() {
        return "Relojes{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", correa='" + correa + '\'' +
                ", inteligente='" + inteligente + '\'' +
                ", mecanismo='" + mecanismo + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
    public ImageIcon createIcon(){
        ImageIcon resultado = null;
        try {
            URL urlrelo = new URL(this.url);
            resultado = new ImageIcon(urlrelo);
        }catch (MalformedURLException mfue){
            System.out.println(mfue.toString());
        }
        return resultado;
    }
}
