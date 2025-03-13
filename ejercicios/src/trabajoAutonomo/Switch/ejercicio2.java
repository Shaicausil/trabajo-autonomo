package trabajoAutonomo.Switch;
import javax.swing.JOptionPane;

public class ejercicio2 {

        public static void main(String[] args) {
            String notaText = JOptionPane.showInputDialog("Ingrese su nota (0-10):");
            int nota = Integer.parseInt(notaText);

            String calificacion;
            switch (nota) {
                case 10: case 9:
                    calificacion = "A";
                    break;
                case 8: case 7:
                    calificacion = "B";
                    break;
                case 6:
                    calificacion = "C";
                    break;
                case 5: case 4:
                    calificacion = "D";
                    break;
                default:
                    calificacion = "F";
            }

            JOptionPane.showMessageDialog(null, "Tu calificación es: " + calificacion);
        }
    }


