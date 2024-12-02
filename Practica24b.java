/*
 y uno que te diga la calificación de un alumno en
función su nota(<5 mostrará suspenso, de >=5 a <6 aprobado, de
>=7 a <9 notable y de >=9 a 10 sobresaliente ).
 */
import java.util.Scanner;

public class Practica24b {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        String mensaje = null;
        System.out.print("Introduce la nota:");
        nota = scanner.nextDouble();

        if (nota < 5) {
            mensaje = "suspenso";
        } else if (nota >= 5 && nota < 7) {
            mensaje = "aprobado";
        } else if (nota >= 7 && nota < 9) {
            mensaje = "notable";
        } else if (nota >= 9) {
            mensaje = "sobresaliente";
        }else{
            System.out.println("Nota no valida");
        }
        
        System.out.println("La calificación es de " + mensaje);
        

    }

}
