import java.util.Scanner;

public class ej19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el presupuesto anual: ");
        double presupuesto = sc.nextDouble();
        System.out.println("Ginecología: le toca: $" + presupuesto * 0.40);
        System.out.println("Traumatología le toca: $ " + presupuesto * 0.30);
        System.out.println("Pediatría le toca: $ " + presupuesto * 0.30);
        sc.close();
    }
}