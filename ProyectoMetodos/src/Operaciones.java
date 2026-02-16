public class Operaciones {
    //metodos
    //variables
    //metodos = funcionalidades que quieres poder ejecutar


    public static void sumar(int op1, int op2) {
        int resultado = op1 + op2;
        System.out.println("el resultado de la suma es " + resultado);
    }

    public void restar(int op1, int op2) {
        int resultado = op1 - op2;
        System.out.println("el resultado de la resto es " + resultado);
    }

    public int  multiplicar (int op1, int op2){
        int resultado = op1 * op2;
        System.out.println("el resultado de la multiplicacion es "+resultado);
        return resultado;

    }

    public void dividir(int op1, int op2){
        int resultado = op1 / op2;
        System.out.println("el resultado de la operacion es "+resultado);

    }


    public boolean validarNumero(int numeroValidar){
        return numeroValidar>0;




        }
}
