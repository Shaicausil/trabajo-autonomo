package trabajoAutonomo.DoWhile;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero;

        do {
            String input = JOptionPane.showInputDialog("Ingresa un número entre 1 y 10:");
            numero = Integer.parseInt(input);
        } while (numero < 1 || numero > 10);

        JOptionPane.showMessageDialog(null, "Número válido ingresado: " + numero);
    }
}

