import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalC= 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese valor de la venta " + i + ": ");
            double venta = sc.nextDouble();
            double comision = 0;
            if (venta <= 10000000) comision = venta * 0.02;
            else if (venta < 15000000) comision = venta * 0.04;
            else comision = venta * 0.10;
            totalC += comision;
        }
        System.out.println("Total de comisiones: " + totalC);
        sc.close();
    }
}