package trabajoAutonomo.For;
import javax.swing.JOptionPane;

public class Ejercicio2 {

        public static void main(String[] args) {

            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un número para sumar desde 1 hasta ese numero"));
            int suma = 0;

            for (int i = 1; i <= numero; i++) {
                suma += i;
            }

            JOptionPane.showMessageDialog(null, "La suma de los primeros " + numero + " números es: " + suma);
        }
    }


