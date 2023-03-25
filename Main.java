package ico.fes.unam;

public class Main {
    public static void main(String[] args) {
        MaquinaDeCafe machine = new MaquinaDeCafe();
        System.out.println(machine);
        machine.mostrarRecursos();
        for (int i = 0; i < 25; i++) {
            machine.servirCafe("Americano");
        }
        for (int i = 0; i < 12; i++) {
            machine.servirCafe("Expreso");
        }
        for (int i = 0; i < 14; i++) {
            machine.servirCafe("Capuchino");
        }
        machine.mostrarRecursos();
        System.out.println(machine);
    }
}
