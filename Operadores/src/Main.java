import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("inicando programa operadores");

        Operadores operadores = new Operadores();
        operadores.operadoresAritmeticos();
        operadores.operadoresAsignacion();
        operadores.operadoresComparacion();
        operadores.operadoresLogicos();


        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu nombre y apellido");
        String nombre = lectorTeclado.nextLine();
        System.out.println("Que salario quieres ganar");
        double salarioEntrada = lectorTeclado.nextDouble();
        System.out.println("Que edad tienes");
        int edad = lectorTeclado.nextInt();
        System.out.println("Tienes carnet de conducir");
        boolean conducir = lectorTeclado.nextBoolean();
        operadores.evaluarCandidato(salarioEntrada, edad, conducir, nombre);


    }


}
