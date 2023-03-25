package ico.fes.unam;

public class Main {
    public static void main(String[] args) {
        MaquinaDeCafe machine = new MaquinaDeCafe();
        System.out.println(machine);
        machine.servirCafe("Americano");
        machine.servirCafe("Expreso");
        machine.servirCafe("Capuchino");
        machine.mostrarRecursos();
        System.out.println(machine);
    }
}