public class SentenciaIf {

    public void examenAprobado(int nota) {
        System.out.println("procedemos a evaluar si un examen esta ok");
        System.out.println("la nota que vamos a evaluar es " + nota);
        if (nota >= 5) {
            System.out.println("El examen esta aprobado");
        } else {
            System.out.println("el examen esta suspendido");
        }
        System.out.println("Terminando la evaluacion del examen");
        System.out.println("programa terminado");


    }


    public void notaExamen (int nota){
    if (nota>0 && nota<=10) {
        if (nota > 0 && nota < 5) {
            System.out.println("el examen esta suspenso");

        } else if (nota < 8) {
            System.out.println("el examen esta aprobado");
        } else if (nota < 9) {
            System.out.println("el examen esta notable");
        } else if (nota < 10) {
            System.out.println("el examen esta sobresaliente");
        } else {
            System.out.println("el examen esta perfecto");
        }


    }else {
        System.out.println("la nota no esta en la escala correcta");
    }






    }











}
