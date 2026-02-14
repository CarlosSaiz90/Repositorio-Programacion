public class Operadores {
    public void operadoresAritmeticos(){
        //unarios
        int operandoUno = 5;
        // incremento
        operandoUno++; // le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("El valor de operando uno despues de los incrementos es "+operandoUno);

        //decremento = le resta uno al valor que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor de operando uno despues de los decrementos  es "+operandoUno);

        //binarios = dos operadores: suma,restar,multiplicar,dividir,modulo-resto division (%)
        operandoUno = 8;
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es  "+(operandoUno + operandoDos));
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es "+resta);
        int multi = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicacion es "+multi);
        double division = (double) operandoUno / operandoDos;
        System.out.printf("El resultado de la divsion es %.2f%n ",division);
        int modulo = operandoUno%operandoDos;
        System.out.println("El modulo de la division es "+modulo);
        // me vale para saber si un numero es par o inpar //

    }

public void operadoresAsignacion(){
        int operadorUno = 10;
        operadorUno += 5; //la suma de lo que valia operador uno mas 5
    System.out.println("El valor de operador uno es "+operadorUno);
    operadorUno -=5;
    operadorUno *=2;
    operadorUno %=2;








}

// utilizados como condiciones //

public void operadoresComparacion(){
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno>operandoDos;
    System.out.println("el resultado de la comparacion es "+resultado);
    resultado = operandoUno<operandoDos;
    System.out.println("el resultado de la comparacion es "+resultado);
    resultado = operandoUno==operandoDos;
    System.out.println("el resultado de la comparacion es "+resultado);
}

public void operadoresLogicos() {
    int sueldo = 20000;
    int edad = 35;                                    //AND//
    boolean conducir = false;

    // mi candidato es valido cuando quiere cobrar menos de 30000 y tiene menos de 40 años y puede conducir//
    boolean candidatoValido = sueldo < 30000 && edad < 40 && conducir; //true
    candidatoValido = sueldo < 20000 || edad < 25 || conducir;

    System.out.println("El candidato es valido " + candidatoValido);
}


public void evaluarCandidato(double sueldo, int edad, boolean conducir, String nombre){
        boolean resultado = sueldo<25000 && edad<40 && conducir;
    System.out.println("Evaluando al candidato "+nombre);
        System.out.println("La evaluacion del candidato es "+resultado);











    }













}

