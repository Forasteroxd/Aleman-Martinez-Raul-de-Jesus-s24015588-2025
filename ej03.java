import java.util.Scanner;
public class ej03{
    public static void main(String[] args) {
     int edad;
     Scanner sc= new Scanner(System.in);
     System.out.println("Introduce tu edad para calcular las pulsaciones: ");
     edad = sc.nextInt();
     double pulsaciones = (220.0 - edad) / 10.0;
     System.out.println("El número de pulsaciones por cada 10 segundos debe de ser: " + pulsaciones);

     sc.close();
    }
}