import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese total de la compra: ");
        double compra = sc.nextDouble();
        System.out.print("Ingrese número aleatorio (0-100): ");
        int num = sc.nextInt();
        double descuento = (num < 74) ? compra * 0.15 : compra * 0.20;
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + (compra - descuento));
        sc.close();
    }
}