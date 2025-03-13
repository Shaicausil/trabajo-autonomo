package trabajoAutonomo.While;
import javax.swing.JOptionPane;

public class ejercicio3 {

        public static void main(String[] args) {
            int edad = 0;

            while (edad < 18) { // Mientras la edad sea menor a 18
                String input = JOptionPane.showInputDialog("Ingrese su edad (debe ser mayor o igual a 18):");
                edad = Integer.parseInt(input);

                if (edad < 18) {
                    JOptionPane.showMessageDialog(null, "Debes ser mayor de edad para continuar.");
                }
            }

            JOptionPane.showMessageDialog(null, "Acceso permitido. Bienvenido.");
        }
    }


