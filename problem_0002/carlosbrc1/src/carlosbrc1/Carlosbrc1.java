/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carlosbrc1;

/**
 *
 * @author carlosbrc
 */
public class Carlosbrc1 {

    // Recibo en entero en el metodo romanos
    public static String romanos(int entero) {

        // variable de respuesta
        String romano = "";
        
        while (entero > 0) {
            if (entero >= 1000) {
                romano += "M";
                entero -= 1000;
            } else if (entero >= 500) {
                if (entero >= 900) {

                    romano += "C";
                    entero += 100;

                } else {

                    romano += "D";
                    entero -= 500;
                }
            } else if (entero >= 100) {
                if (entero >= 400) {

                    romano += "C";
                    entero += 100;

                } else {

                    romano += "C";
                    entero -= 100;
                }
            } else if (entero >= 50) {
                if (entero >= 90) {

                    romano += "X";
                    entero += 10;

                } else {

                    romano += "L";
                    entero -= 50;

                }
            } else if (entero >= 10) {
                if (entero >= 40) {

                    romano += "X";
                    entero += 10;

                } else {

                    romano += "X";
                    entero -= 10;

                }

            } else if (entero >= 5) {
                if (entero >= 9) {

                    romano += "V";
                    entero += 5;

                } else {

                    romano += "V";
                    entero -= 5;

                }
            } else {
                if (entero >= 4) {

                    romano += "I";
                    entero++;

                } else {

                    romano += "I";
                    entero--;

                }
            }

        }

        return romano;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String r = romanos(5);
        System.out.println(r);
    }

}
