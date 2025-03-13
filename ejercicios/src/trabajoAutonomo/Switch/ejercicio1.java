package trabajoAutonomo.Switch;
import javax.swing.JOptionPane;

public class ejercicio1 {
        public static void main(String[] args) {
            String opcion = JOptionPane.showInputDialog(
                    "Seleccione una opción:\n" +
                            "1. Ver saldo\n" +
                            "2. Depositar dinero\n" +
                            "3. Retirar dinero\n" +
                            "4. Salir");

            int opcionSeleccionada = Integer.parseInt(opcion);

            switch (opcionSeleccionada) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Tu saldo es de $500.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad a depositar.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad a retirar.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }


