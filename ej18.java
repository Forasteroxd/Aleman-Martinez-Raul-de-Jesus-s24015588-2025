import java.util.Scanner;

public class ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese duración de la llamada (minutos): ");
        int minutos = sc.nextInt();
        double total = 10;
        if (minutos > 3) total += (minutos - 3);
        System.out.println("Total a pagar: N$" + total);
        sc.close();
    }
}