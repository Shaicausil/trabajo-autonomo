package trabajoAutonomo.DoWhile;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        int opcion;

        do {
            String menu = """
                Elige una opción:
   
                --- MENÚ ---
                1. Frijoles
                2. Lentejas
                3. Salir
                """;
            String input = JOptionPane.showInputDialog(menu);
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Elegiste los frijoles");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Elegiste las lentejas");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 3);
    }
}

