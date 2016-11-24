package stucomRoyal;

/**
 * Created by Alan on 17/11/2016.
 */
public class Estructura extends Carta {

    private int defensa;

    public Estructura(String nombre, int elixir, int vida, int defensa) {
        super(nombre, elixir, vida);
        this.defensa = defensa;
    }

    public Estructura() {}

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public String toString() {
        return "Estructura{" +
                "defensa=" + defensa +
                '}';
    }
}
