import java.util.Scanner;
public class ej09{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double salario, nuevoSalario;
     System.out.println("Ingrese el salario anterior: ");
     salario = sc.nextDouble();
     nuevoSalario = salario * 1.25;
     System.out.printf("El nuevo salario con incremento es de: $%.2f", nuevoSalario);

     sc.close();
    } 	
}