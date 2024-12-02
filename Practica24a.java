/*
capaz de pedir dos números al usuario y pregunte
además por la operación a realizar sobre estos dos números (1:suma, 2:resta,
3:multiplicación o 4:división)
*/
import java.util.Scanner;
public class Practica24a {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero1,numero2;
        
        System.out.print("Introduce un primer número entero: ");
        numero1=scanner.nextInt();
        
        System.out.print("Introduce un segundo número entero: ");
        numero2=scanner.nextInt();
        
        int suma=numero1+numero2;
        int resta=numero1-numero2;
        int multiplicacion=numero1*numero2;
        double division=(double)(numero1/numero2);
        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicación es " + multiplicacion);
        System.out.println("La division es " + division);
        
    }
    
}
