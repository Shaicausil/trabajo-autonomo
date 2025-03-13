package trabajoAutonomo.Switch;
import javax.swing.JOptionPane;


public class ejercicio3 {

        public static void main(String[] args) {
            String mesText = JOptionPane.showInputDialog("Ingrese el número del mes (1-12):");
            int mes = Integer.parseInt(mesText);

            String estacion;
            switch (mes) {
                case 12: case 1: case 2:
                    estacion = "Invierno";
                    break;
                case 3: case 4: case 5:
                    estacion = "Primavera";
                    break;
                case 6: case 7: case 8:
                    estacion = "Verano";
                    break;
                case 9: case 10: case 11:
                    estacion = "Otoño";
                    break;
                default:
                    estacion = "Mes inválido";
            }

            JOptionPane.showMessageDialog(null, "La estación correspondiente es: " + estacion);
        }
    }


