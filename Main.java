public class Main {
    public static void main(String[] args) {
        Madera madera = new Roble("Roble", 100);

        Silla silla = new Silla(
                "Silla comedor",
                "IKEA",
                123,
                "Marrón",
                100,
                50,
                madera,
                4);


        silla.MostrarAtributos();

        System.out.println("Cantidad de patas: " + silla.getcantidadPatas());
        silla.setCantidadPatas(3);
        System.out.println("Nueva cantidad de patas: " + silla.getcantidadPatas());
    }
}