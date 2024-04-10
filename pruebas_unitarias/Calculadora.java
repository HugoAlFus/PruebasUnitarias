package pruebas_unitarias;



import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Esta clase representa una calculadora que permite realizar operaciones matematicas basicas.
 * @author Hugo Almodovar
 * @version 1.0
 */
public class Calculadora {

    //static final Logger LOGGER = LogManager.getLogger(Calculadora.class.getSimpleName());
    static double numero1;
    static double numero2;
    static Scanner sc = new Scanner(System.in);

    /**
     * El punto de entrada de la aplicacion.
     *
     * @param args los argumentos de la linea de comandos
     */
    public static void main(String[] args) {

        char opcion;

        System.out.println("--Bienvenido a la calculadora magica--");
        ingresarNumeros();

        do {
            opcion = elegirOpcion();

            switch (opcion) {

                case '1':
                    sumar();
                    break;
                case '2':
                    restar();
                    break;
                case '3':
                    multiplicar();
                    break;
                case '4':
                    dividir();
                    break;
                case '5':
                    System.out.println("Se va a salir de la aplicacion");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != '5');

    }

    /**
     * Solicitar al usuario que ingrese dos numeros.
     */
    public static void ingresarNumeros() {

        try {
            System.out.print("Ingrese el primer numero: ");
            numero1 = sc.nextDouble();

            System.out.print("Ingrese el segundo numero: ");
            numero2 = sc.nextDouble();
        } catch (InputMismatchException e) {
            //LOGGER.error(e.getStackTrace());
            System.err.println("ERROR: Ha introducido un valor no valido");
            System.exit(0);
        } catch (NoSuchElementException | IllegalStateException e) {
            //LOGGER.error(e.getStackTrace());
            System.err.println("ERROR: Ha ocurrido un error inesperado");
            System.exit(0);
        }
    }

    /**
     * Solicitar al usuario que elija una opcion.
     *
     * @return la opcion elegida por el usuario
     */
    public static char elegirOpcion() {

        char opcion = 0;

        try {
            System.out.println("""
                    Indique que accion quiere realizar:
                    1.Sumar
                    2.Restar
                    3.Multiplicar
                    4.Dividir
                    5.Salir
                    """);
            opcion = sc.next().charAt(0);
        } catch (NoSuchElementException | IllegalStateException e) {
            //LOGGER.error(e.getStackTrace());
            System.err.println("ERROR: Ha ocurrido un error inesperado");
            System.exit(0);
        } catch (IndexOutOfBoundsException ex) {
            //LOGGER.error(ex.getStackTrace());
            System.err.println("ERROR: Ha introducido un valor no valido");
            System.exit(0);
        }

        return opcion;
    }

    /**
     * Realizar la suma de los dos numeros.
     */
    public static void sumar() {

        System.out.println("La suma de los numeros es: " + (numero1 + numero2));
    }

    /**
     * Realizar la resta de los dos numeros.
     */
    public static void restar() {

        System.out.println("La resta de los numeros es: " + (numero1 - numero2));
    }

    /**
     * Realizar la multiplicacion de los dos numeros.
     */
    public static void multiplicar() {

        System.out.println("La multiplicacion de los numeros es: " + (numero1 * numero2));
    }

    /**
     * Realizar la division de los dos numeros.
     */
    public static void dividir() {

        if (numero2 == 0) {
            throw new ArithmeticException("ERROR: No se puede dividir entre 0");
        }
        System.out.println("La division de los numeros es: " + (numero1 / numero2));
    }
}
