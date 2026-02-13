public class Main {

    public static void main(String[] args) {


        GestorFinancieroJava gestor = new GestorFinancieroJava();

        gestor.calcularIva(250);
        gestor.cambioDolares(1200);
        gestor.mediaNotasCurso(5, 6, 9);


        GestorFinancieroJava.mediaNotasCurso(1,7,8);
        System.out.println();
        GestorFinancieroJava.convertirCelsiusFahrenheit(22);
        System.out.println();



        GestorFinancieroJava.calcularGastoViaje(300,6,1.45);







    }


}
