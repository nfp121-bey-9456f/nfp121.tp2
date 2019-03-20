package question3;

import question2.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
    private JTextField entree = new JTextField( 6 );
    /** Le bouton de conversion. */
    private JButton  boutonDeConversion = new JButton( "Convertir" );
    /** La sortie en degré Celsius. */
    private JTextField sortie = new JTextField( 6 );

    public IHMFahrenheit(){
        super("IHM Fahrenheit");

        setLayout(new FlowLayout());
        add( entree ); add( boutonDeConversion ); add( sortie );
        sortie.setEditable( false );
        getContentPane().setBackground( Color.pink );
        setLocation(100,100);
        pack();setVisible(true);

        boutonDeConversion.addActionListener( this );
    }

    /** 
     * Méthode déclenché lorsque le bouton de conversion est appuyé. 
     * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
     * @param ae l'évènement transmis
     */
    public void actionPerformed(ActionEvent ae ){
        try{
            String valeur = entree.getText();
            int fahrenheit = Integer.parseInt(valeur);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            if (celsius < -273.1F)
                celsius = -273.1F; // c'est un test pour le zéro absolu (-273.1)
            sortie.setText( Float.toString( celsius ) );
        }
        catch(NumberFormatException nfe){
            sortie.setText("error ! ");  // message affiché en cas d'erreur
        }
    }

    /**
     * Méthode pour convertir Fahrenhiet en Celsius.
     * @param f la valeur en degré Fahrenheit (°F)
     * @return la conversion en degré Celsius (°C)
     */
    public static float fahrenheitEnCelsius(int f) {
        float value = (f - 32) * 5F/9F; // conversion implicite en float pour éviter une division entière et perdre les décimales
        return (int)(value * 10) / 10F; // troncation de la valeur à une decimale

    }

    public static void main(String[] args){
        new IHMFahrenheit();
    }
}