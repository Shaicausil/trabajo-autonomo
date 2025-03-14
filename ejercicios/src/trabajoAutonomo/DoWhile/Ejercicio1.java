package trabajoAutonomo.DoWhile;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        int contador = 1;

        do {
            JOptionPane.showMessageDialog(null, "Número: " + contador);
            contador++;
        } while (contador <= 5);
    }
}

