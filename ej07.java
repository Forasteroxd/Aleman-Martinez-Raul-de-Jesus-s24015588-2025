import java.util.Scanner;
public class ej07{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    double total, precioFinal;
    System.out.println("Ingrese el total de la compra: ");
    total = sc.nextDouble();
    precioFinal = total - (total * 0.15);
    System.out.printf("El total a pagar con el 15%% de descuento es: $%.2f\", precioFinal);

     sc.close();
    }
}