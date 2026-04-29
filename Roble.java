import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Roble implements Madera {

    private String tipoMadera;
    private int vidaUtil;
    private LocalDate diaDesdeQueSeCreo;

    public Roble(String tipoMadera, int vidaUtil) {
        this.tipoMadera = tipoMadera;
        this.vidaUtil = vidaUtil;
        this.diaDesdeQueSeCreo = LocalDate.now();
    }

    @Override
    public int tiempoRestante() {
        long diasPasados = ChronoUnit.DAYS.between(diaDesdeQueSeCreo, LocalDate.now());
        return (int)(vidaUtil - diasPasados);
    }
}