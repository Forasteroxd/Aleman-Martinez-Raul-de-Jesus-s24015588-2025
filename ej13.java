import java.util.Scanner;

public class ej13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Ingrese el coeficiente A: ");
            double A = sc.nextDouble();
            
            System.out.print("Ingrese el coeficiente B: ");
            double B = sc.nextDouble();
            
            System.out.print("Ingrese el coeficiente C: ");
            double C = sc.nextDouble();
            
            if (A == 0) {
                System.out.println("Error: La ecuación no es cuadrática (A no puede ser cero).");
            }
            
            double discriminante = B * B - 4 * A * C;
            

            if (discriminante < 0) {
                System.out.println("Error: Las raíces son imaginarias (discriminante negativo).");
            } else if (discriminante == 0) {
                double raiz = -B / (2 * A);
                System.out.printf("La ecuación tiene una raíz real doble: %.2f%n", raiz);
            } else {
                double raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                double raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);
                System.out.printf("Las raíces reales son: %.2f y %.2f%n", raiz1, raiz2);
            }
            System.out.println("Error: Ingrese valores numéricos válidos.");
            sc.close();
        
    }
}