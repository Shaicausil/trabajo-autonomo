package trabajoAutonomo.For;
import javax.swing.JOptionPane;

public class Ejercicio3 {



        public static void main(String[] args) {

           int numero=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero a multiplicar"));

            String resultado= "Tabla del " + numero + ":\n";

            for (int i = 1; i <= 10; i++) {
                resultado = resultado + numero + " x " + i + " = " + (numero * i) + "\n";
            }


            JOptionPane.showMessageDialog(null, resultado);
        }
    }


