import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        saludar("pepe");
        Operaciones operaciones = new Operaciones();


        GestorFinancieroJava gestor = new GestorFinancieroJava();

        gestor.calcularIva(250);
        gestor.cambioDolares(1200);
        gestor.mediaNotasCurso(5, 6, 9);


        GestorFinancieroJava.mediaNotasCurso(1, 7, 8);
        System.out.println();
        GestorFinancieroJava.convertirCelsiusFahrenheit(22);
        System.out.println();


        GestorFinancieroJava.calcularGastoViaje(300, 6, 1.45);
        System.out.println();


        RepartidorFacturas calculoCuenta = new RepartidorFacturas();
        calculoCuenta.repartirCuenta(140, 3, 10);
        System.out.println();
        int puntacionInicial = 0;
        System.out.println("Puntacion inicial " + puntacionInicial);
        puntacionInicial += 5;
        System.out.println("Despues de primera modificacion " + puntacionInicial);
        puntacionInicial += 5;
        System.out.println("Despues de segunda modificacion " + puntacionInicial);


        System.out.println("que numero quieres validar? ");
        int validarNumero = scanner.nextInt();
        System.out.println("El numero que se intenta validar tiene como resultado: "
                +operaciones.validarNumero(validarNumero));







        System.out.println(operaciones.multiplicar(7, 3));







        presentacionPersonal("Elena Garcia ", 22, "barcelona");


    }


    public static void saludar(String nombre) {
        System.out.println("hola me llamo" + nombre);
        boolean disponible = true;
    }


    public static void presentacionPersonal(String nombre, int edad, String ciudad) {
        System.out.println("Hola, me llamo " + nombre + "tengo " + edad + " años y vivo en " + ciudad);


    }


}


