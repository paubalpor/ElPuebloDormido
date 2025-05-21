import java.util.ArrayList;

public final class Vampiro extends Ciudadano {
    private static int totalVampiros;
    private static int ultimoVampiro;
    private Vulnerable VULNERABLE;

    public Vampiro(String nombre, int ultimoVampiro) {
        super(nombre);
        this.ultimoVampiro = ultimoVampiro;
        this.VULNERABLE = Vulnerable.LOBO;
    }

    public static int getPoblacion() {
        return totalVampiros;
    }

    public static void setPoblacion(int numero) {
        totalVampiros = numero;
        if (numero >= 0) {
            System.out.println("La cantidad total de vampiros es de " + numero);
        }
    }

    @Override
    public Ciudadano combate(Ciudadano oponente) {
        return null;
    }

    @Override
    public void morir(ArrayList<Ciudadano> ciudadanos) {

    }

    public Vulnerable getVulnerable(){
        return VULNERABLE;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Vulnerable " + VULNERABLE + super.toString();
    }
}




