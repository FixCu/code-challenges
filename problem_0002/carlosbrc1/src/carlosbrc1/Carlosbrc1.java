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

    // Lo hice de esta forma matematica, pero me parece que haciendolo por lugares (tipo centena decena unidad) es mejor
    // Recibo el numero como var entero en el metodo romanos

    /*
    1- Tu codigo falla para algunos casos de prueba por ejemplo para cuando n = 9 da como resultado VXIV cuando deberia dar como resultado
    IX, tambien falla cuando pones el valor 3999 segun tu codigo da como resultado MMMCMXCVXIV cuando deberia ser MMMCMXCIX, y eso es producto
    a que solo estas cubriendo un espacio de la solucion y no estas barriendo el espacio completo de soluciones producto a las veces que tienes que repetir
    las numerosas restas, y a ese analisis de UNIDADES, DECENAS, CENTENAS, en algunos casos tambien se te quedan casos fuera.

    2- Tu codigo falla tambien porque logicamente te lanzastes a hacer el problema empezando a codficar la solucion y no pensando en el mecanismo de pruebas a usar,
    me refiero a que debistes haber empezado con un enfoque TDD (Test Driven Development) o un Enfoque DDD (Domain Driven Development) por lo general en la vida real
    cuando se hace un software se debe empezr por las pruebas de testing y luego ya entonces por el codigo, porque seran las pruebas las que te lleven al desarrollo
    del codigo, logicamente tu enfoque fue:

    Enfoque Carlos Brayan: Codear la solucion y una vez terminada hicistes los test cases con los valores que te dio la salida cuando corristes el algoritmo de ahi se
    deriba que existan casos para los que no se satisface el problema.

    3- No haces el chequeo de valores para cuando n es <=0 y para cuando n>3999, por lo general esta es una costumbre que debes adquirir, se trata de evaluar los boundring cases
    o como se conoce literalmene como casos extremos, por ejemplo si tienes un metodo que recibe un string debes validar que decision tomas en el caso en el que sea erroneo el
    valor o que sea algo que no este contemplado dentro del criterio de aceptacion: Supon que tienes un metodo para validar si un nombre esta en lowercase o uppercase por ejemplo
    y en vez de pasarte como parametro "JUAN" te pasan como parametro "123456789" si no haces una validacion entonces tu codigo no sabra que hacer cuando ejecute el metodo en el
    peor de los casos no devolvera si esta en uppercase o lowercase porque estas pasando algo que es string pero no son caracteres de la A-Za-z.

    4- Si el metodo que estas implementando no es necesario que sea visto por las demas clases entonces no debes marcarlo como public lo correcto seria marcarlo como private ya
    que solo lo estaras usando en esa clase nada mas y no sera de conocimiento para los demas, dejarlo como public puede hacer que si alguien conoce su uso pues y decidausarlo
    pueda conducir a errores de comportamientos no definidos (Undefined Behavior) o a lanzar excepciones que no sabes porque ocurren.


    Nota: Ya seaen una entrevista tecnica o en la resolucion de un ejercicio practico de algoritmia lo ideal seria empezar evaluando los casos extremos y ya despues seguir
    adelante con los demas casos.

    Nota: La idea cuando nos sentamos a codificar una solucion es analizarlo tod@ lo que vas utilizando ejemplo:
    Si marcas un metodo publico, entonces la pregunta viene:
        -Porque necesito que este metodo sea publico quienes o en donde acorde a la logica y diseño de mi solucion se van a
        utilizar?
        - Si usas una estructura de datos preguntate: Se ajusta esta estrctura de datos al modelo que quiero representar o que quiero tener?
        -etc....

    Nota: Siempre que puedas separar en archivos independientes toda la logica de tus clases, relaciones y tod@ lo demas del metodo principal main hazlo, ya que sera una buena
    forma de separar y testear componentes individuale de codigo

    Nota: Cuando usas una cantidad espantosa de sentencias if-else hace que tu codigo el 90% de las veces no sea legible, porque eso tiende
    a confundir en su lugar deberias usar switch para agrupar todos los posibles casos, recuerda siempre que en la vida profesional trabajaras
    en un equipo con otros desarrolladores y la idea es que el codigo que entregues sea lo mas limpio posible para que pueda ser a su vez escalable y mantenible
    en el tiempo.
    * */
    public static String romanos(int entero) {

        // variable de respuesta donde voy a ir guardando los numeros romanos
        String romano = "";
        
        while (entero > 0) {
             // si es mayor que lo que vale el numeros romano, la pongo y le descuento el valor al numero
             // pero me queda el problema de cuando pongo uno menor antes y resto, que te lo explico en el primer caso
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
                // aqui te explico porque el primero porque fue como descubri los otros
                // matematica, si es mayor o igual que el ultimo numero que se representa sin restar entonces le agrego este al romano y le sumo el valor, garantizando que cuando llegue el numero al valor de inmediato superior ya se le reste y se empareje
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
        String r = romanos(3999);
        System.out.println("Carlos Brayan soluton: " + r);

        System.out.println("**************************");
        System.out.println("Sergio solution: " + IntegerToRoman.convertToRomanArrayAproach(3999));
    }

}
