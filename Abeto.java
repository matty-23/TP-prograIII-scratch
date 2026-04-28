import java.time.LocalDate;

public class Abeto implements Madera {

    private String tipoMadera;
    private int vidaUtil;
    private int diaDesdeQueSeCreo;

    public Abeto(String tipoMadera, int vidaUtil) {
        this.tipoMadera = tipoMadera;
        this.vidaUtil = vidaUtil;
        this.diaDesdeQueSeCreo = LocalDate.now();
    }

    @Override
    public int tiempoRestante() {
        return this.diaDesdeQueSeCreo + vidaUtil - LocalDate.now();
    }
}