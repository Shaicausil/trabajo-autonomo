package trabajoAutonomo;

public class condiciones {
        public static void main(String[] args) {

            int numero = 10;
            if (numero > 0) {
                System.out.println("El número es positivo.");
            }

            //2.

            int edad = 16;
            if (edad >= 18) {
                System.out.println("Puedes entrar al sitio.");
            } else {
                System.out.println("Acceso denegado. Debes ser mayor de edad.");
            }

            //3
            int calificacion = 85;
            if (calificacion >= 90) {
                System.out.println("Excelente");
            } else if (calificacion >= 70) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }


        }
    }



