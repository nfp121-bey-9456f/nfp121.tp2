package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author Elie DAHER
 * @version v1.1
 */
public class FahrenheitCelsius {

    /**
     * Affiche la conversion en Celsius d'une liste de valeurs en Fahrenheit
     * @param args liste des temp�ratures en Fahrenheit a convertir en Celsius 
     */
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C");
        }
    }

    /**
     * M�thode pour convertir Fahrenhiet en Celsius.
     * @param f la valeur en degr� Fahrenheit (�F)
     * @return la conversion en degr� Celsius (�C)
     */
    public static float fahrenheitEnCelsius(int f) {
        float value = (f - 32) * 5F/9F; // conversion implicite en float pour �viter une division enti�re et perdre les d�cimales
        return (int)(value * 10) / 10F; // troncation de la valeur � une decimale

    }

}
