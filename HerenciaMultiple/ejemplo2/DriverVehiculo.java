package main.ejemplo2;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion01 = new Camion("Diesel",3);
        System.out.println(camion01.encender());
        System.out.println(camion01);
        camion01.avanzar();

        camion01.frenar();
        System.out.println(camion01.apagar());

        System.out.println("---Motocicleta----");
        Moto moto01 = new Moto(150,"Susuki");
        System.out.println(moto01);
        System.out.println(moto01.encender());
        moto01.encender();
        moto01.avanzar();
        moto01.Caballito();
        moto01.frenar();
        moto01.apagar();

    }
}
