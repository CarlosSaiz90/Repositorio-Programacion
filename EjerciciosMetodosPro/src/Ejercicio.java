import java.util.Scanner;

public class Ejercicio {
private Scanner lecturaTeclado;

public void ejercicio1(){
    lecturaTeclado = new Scanner(System.in);
    System.out.println("Cuantos bocatas vais a pedir? ");
    int numeroBocatas = lecturaTeclado.nextInt();
    System.out.println("Cuantas bebidas vais a pedir? ");
    int numeroBebeidas = lecturaTeclado.nextInt();
    System.out.println("Cuanto cuesta cada bocata? ");
    double precioBocata = lecturaTeclado.nextDouble();
    System.out.println("Cuanto cuesta cada bebida? ");
    double precioBebida = lecturaTeclado.nextDouble();
    System.out.println("Cuantas personas entran en la cuenta? ");
    int personas = lecturaTeclado.nextInt();
    double precioBocatas = numeroBocatas*precioBocata;
    double precioBebidas = numeroBebeidas*precioBebida;
    double costeTotal = precioBebidas+precioBocatas;
    double precioPersona = costeTotal/personas;
    System.out.printf("El precio de los bocatas es %.2f%n",precioBocatas);
    System.out.printf("El precio de los bebidas es %.2f%n",precioBebidas);
    System.out.printf("El precio total  es %.2f%n",costeTotal);
    System.out.printf("El precio por persona es %.2f%n",precioPersona);
    lecturaTeclado.close();
    lecturaTeclado=null;
}

public void ejercicio2(){
    lecturaTeclado = new Scanner(System.in);
    System.out.println("introduce las decenas de mil");
    int decenasDeMil = lecturaTeclado.nextInt();
    System.out.println("introduce las unidades de mil");
    int unidadesDeMil = lecturaTeclado.nextInt();
    System.out.println("introduce las centenas ");
    int centenas = lecturaTeclado.nextInt();
    System.out.println("introduce las decenas ");
    int decenas = lecturaTeclado.nextInt();
    System.out.println("introduce las unidades");
    int unidades = lecturaTeclado.nextInt();
    int numeroIntroducido= (decenasDeMil*10000)+(unidadesDeMil*1000)+(centenas*100)+(decenas*10)+(unidades*1);
    System.out.println("Numero introducido "+numeroIntroducido);
    lecturaTeclado.close();
    lecturaTeclado = null;

}

public void ejercicio3(){
    lecturaTeclado = new Scanner(System.in);
    System.out.println("Introduce el precio con IVA ");
    double valorCompra = lecturaTeclado.nextDouble();
    System.out.println("Introduce el porcentaje de IVA ");
    double porcentajeIva = lecturaTeclado.nextDouble();
    double compraSinIva = valorCompra/(1.+(porcentajeIva/100));
    System.out.printf("Valor de la compra %.2f%n ",valorCompra,"€");

    System.out.printf("La compra sin IVA costó %.2f%n ",compraSinIva);
    double iva = valorCompra - compraSinIva;
    System.out.printf("IVA %.2f%n ",iva, "€");




}














public void ejercicio4(){
    lecturaTeclado=new Scanner(System.in);
    System.out.println("Cuantos segundos quieres pasar a tiempo");
    int segundosTotal = lecturaTeclado.nextInt();
    int horas = segundosTotal/3600;
    int minutos =(segundosTotal%3600)/60;
    int segundos = segundosTotal%60;
    System.out.println("El numero de horas es "+horas);
    System.out.println("El numero de minutos es "+minutos);
    System.out.println("El numero de segundos es "+segundos);
    lecturaTeclado.close();
    lecturaTeclado=null;





















}


























}



