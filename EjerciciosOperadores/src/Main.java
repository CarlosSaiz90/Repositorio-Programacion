import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

        ComparacionNumeros comparacion = new ComparacionNumeros();
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer numero ");
        int n1 = lector.nextInt();
        System.out.println("Introduce el segundo numero ");
        int n2 = lector.nextInt();
        comparacion.comparacionNumeros(n1,n2);









    }
}
