public class RepartidorFacturas {
    public  void repartirCuenta(double totalCuenta, int numeroPersonas, double porcentajePropina) {

        double propina = (totalCuenta * porcentajePropina) / 100;
        double cuenta = totalCuenta + propina;
        double resultado = cuenta / numeroPersonas;
        System.out.printf("Cada persona debe pagar %.2f", resultado);










    }
}
