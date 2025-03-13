package trabajoAutonomo.While;
import javax.swing.JOptionPane;

public class ejercicio2 {

        public static void main(String[] args) {
            int suma = 0;
            int numero;

            String input = JOptionPane.showInputDialog("Ingrese un número (0 para salir):");
            numero = Integer.parseInt(input);

            while (numero != 0) {
                suma += numero;
                input = JOptionPane.showInputDialog("Suma actual: " + suma + "\nIngrese otro número (0 para salir):");
                numero = Integer.parseInt(input);
            }

            JOptionPane.showMessageDialog(null, "Suma total: " + suma);
        }
    }




