import java.util.ArrayList;
import java.util.Random;

public final class Lobo extends Ciudadano implements CicloVital{

    //ATRIBUTOS DE CLASE
    private static int totalLobos;
    private static int ultimoLobo;
    private static final Random ALEATORIO = new Random();

    //ATRIBUTOS DE INSTANCIA
    private Vulnerable VULNERABLE;
    private int vida;

    public Lobo(String nombre, int ultimoLobo, int vida) {
        super(nombre);
        this.ultimoLobo = ultimoLobo;
        this.VULNERABLE = Vulnerable.HUMANO;
        this.vida = vida;
    }

    public static int getPoblacion(){
        return totalLobos;
    }

    public static void setPoblacion(int numero){
        totalLobos = numero;
        if (numero >= 0){
            System.out.println("La cantidad total de lobos es de " + numero);
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
