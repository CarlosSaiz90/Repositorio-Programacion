public class GestorFinancieroJava {

public void calcularIva(double precioSinIva) {
    double resultado = precioSinIva * 1.21;
    System.out.println("El precio del producto sin el iva es "+resultado+ "€");
}

public void cambioDolares(double euros){
    double resultado = euros * 1.08;
    System.out.println(+euros+ "+euros equivalen a " +resultado+ " dolares ");

}

public static void mediaNotasCurso(int nota1, int nota2, int nota3){
    int resultado = (nota1+nota2+nota3)/3;
    System.out.println();
    System.out.println("La media de tus notas es "+resultado);
}

public static void calcularGastoViaje(double km, double consumoMedio, double precioLitro){
    double litrosTotales = (km*consumoMedio)/100;
    double costeFinal = litrosTotales*precioLitro;
    System.out.printf("El viaje nos ha costado %.2f euros",costeFinal);
}

public static void convertirCelsiusFahrenheit(double celsius){
    double resultado = (celsius*9/5)+32;

    System.out.printf("%.1f grados Celsius equivalen a %.1f Fahrenheit%n", celsius, resultado);


}










}
