import java.util.ArrayList;
import java.util.Scanner;

public abstract class Ciudadano implements Batalla{
    Scanner lector = new Scanner(System.in);

    //ATRIBUTOS DE CLASE
    private static int poblacion;
    private static int contador = 0;

    //ATRIBUTOS DE INSTANCIA
    private String nombre;

    //CONSTRUCTOR
    //El nombre del ciudadano se proporcionará como parámetro en el constructor.
    public Ciudadano(String nombre) {
        this.poblacion = Ciudadano.contador++;
        this.nombre = nombre;
    }

    //Devuelve el numero total de ciudadanos (metodo de clase).
    public static int getPoblacion(){
        return poblacion;
    }

    //Actualiza el numero total de ciudadanos (metodo de clase).
    public static void setPoblacion(int numero){
        poblacion = numero;
        if (numero >= 0){
            System.out.println("La cantidad total de ciudadanos es de " + numero);
        }
    }

    //Devuelve el nombre del ciudadano.
    public String getNombre(){
        return nombre;
    }

    //Actualiza el nombre del ciudadano.
    public void setNombre(String nombre){
        try{
            System.out.println("Introduce un nombre para un ciudadano");
            nombre = lector.nextLine();
        }catch (NullPointerException e){
            System.out.println("Error " + e.getMessage());
        }catch (NumberFormatException e1){
            System.out.println("Error " + e1.getMessage());
        }catch (Exception e3){
            System.out.println("Error global");
        }
    }

    //Devuelve una representacion en cadena del ciudadano.
    public String toString(){
        return "Nombre del ciudadano: " + nombre;
    }

    //Imprime los ciudadanos e imprime las poblaciones totales (metodo de clase).
    public static void censar(ArrayList<Ciudadano> ciudadanos){
        System.out.println(ciudadanos);
    }

    //Imprime el censo total de ciudadanos, humanos, lobos y vampiros (metodo de clase)
    public static void poblacionesTotales(ArrayList<Ciudadano> ciudadanos){
        int contadorHumano = 0;
        int contadorVampiro = 0;
        int contadorLobo = 0;

        for(Ciudadano c : ciudadanos){
            if(c instanceof Humano){
                contadorHumano++;
            } else if (c instanceof Vampiro) {
                contadorVampiro++;
            } else if (c instanceof Lobo){
                contadorLobo++;
            }else{
                System.out.println("Ciudadano inccorrecto");
            }
        }

        System.out.println("El total de humanos es de: " + contadorHumano + " el total de vampiros es de: " + contadorVampiro + " el contador de lobos es de: " + contadorLobo);
    }

    //Indica el comportamiento de cuando un ciudadano muere (metodo no implementado en la clase).
    public abstract void morir(ArrayList<Ciudadano> ciudadanos);
}