public class Main {
    public static void main(String[] args) {
        //Ahora despues de realizar el codigo propio de calcularArea en la clase cuadrado
        //podemos crear el objeto

        Cuadrado cuadrad01 = new Cuadrado();
        cuadrad01.setLado(5);
        System.out.println("El area es igual a " + cuadrad01.calcularArea());

        Circulo circulo01 = new Circulo();
        circulo01.setRadio(2.4);
        System.out.println("Area del circulo es: " + circulo01.calcularArea());
    }
}
