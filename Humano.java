import java.util.ArrayList;
import java.util.Random;

public final class Humano extends Ciudadano implements CicloVital{
    private static int totalHumanos;
    private static int ultimoHumano;
    private static final Random ALEATORIO =  new Random();
    private Vulnerable VULNERABLE;
    private int vida;

    public Humano(String nombre) {
        super(nombre);
        this.VULNERABLE = Vulnerable.VAMPIRO;
    }

    public static int getPoblacion(){
        return totalHumanos;
    }

    public static void setPoblacion(int numero){
        totalHumanos = numero;
        if (numero >= 0){
            System.out.println("La cantidad total de humanos es de " + numero);
        }
    }

    @Override
    public Ciudadano combate(Ciudadano oponente) {
        return null;
    }

    @Override
    public int reproducir() {
        return 0;
    }

    @Override
    public void morir(ArrayList<Ciudadano> ciudadanos) {

    }

    @Override
    public int envejecer() {
        return 0;
    }

    public Vulnerable getVulnerable(){
        return VULNERABLE;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Vulnerable " + VULNERABLE + ", vida " + vida + super.toString();
    }
}
