public class Maquina_Cafe {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public Maquina_Cafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public Maquina_Cafe(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "Maquina_Cafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }
    public void Americano(){
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua -= 180;
            cafe -= 15;
            vasos -= 1;
            System.out.println("Su cafè americano a sido servido, desea otro cafe?");
            MostrarEstado();
        }else {
            System.out.println("Su cafè Americano no se a podido elaborar" +
                    ", la maquina no cuenta nos los recursos suficientes para servir este cafe... Avise en caja");
        }

    }

    public void Expreso() {
        if (agua >= 120 && cafe >= 20 && vasos > 0) {
            agua -= 120;
            cafe -= 20;
            vasos -= 1;
            System.out.println("Su cafè Expresso a sido servido, desea otro cafe?");
            MostrarEstado();
        } else {
            System.out.println("Su cafè Expresso no se a podido elaborar" +
                    ", la maquina no cuenta nos los recursos suficientes para servir este cafe... Avise en caja");
        }
    }

    public void Capuchino(){
        if (agua >=  100 && cafe >= 14 && crema >= 70 && vasos > 0) {
            agua -=100;
            cafe -=14;
            crema -=70;
            vasos -=1;
            System.out.println("Su cafè Capuchino a sido servido, desea otro cafe?");
            MostrarEstado();
        } else {
            System.out.println("Su cafè Capuchino no se a podido elaborar" +
                    ", la maquina no cuenta nos los recursos suficientes para servir este cafe... Avise en caja");

        }
    }


    public void MostrarEstado() {
        System.out.println("Estado de la máquina:");
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
        System.out.println("Vasos: " + vasos);
    }


}
