import java.util.Scanner;
public class ej08{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    double inversion, ganancia;
    System.out.println("Ingrese el capital a invertir: ");
    inversion = sc.nextDouble();
    ganancia = inversion * 0.02;
    System.out.printf("La ganancia después de un mes al 2%% será de: $%.2f", ganancia);

     sc.close();
    } 	
}