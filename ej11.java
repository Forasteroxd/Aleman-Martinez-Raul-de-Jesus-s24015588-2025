import java.util.Scanner;
public class ej11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el primer valor: ");
            double valor1 = sc.nextDouble();
            System.out.print("Ingrese el segundo valor: ");
            double valor2 = sc.nextDouble();
            System.out.print("Ingrese el tercer valor: ");
            double valor3 = sc.nextDouble();
            if (valor1 == valor2 && valor2 == valor3) {
                System.out.println("Los tres valores son iguales: " + valor1);
            } else {
                double mayor = valor1;
                double menor = valor2;
                if (valor2 > mayor) {
                    mayor = valor2;
                }
                if (valor3 > mayor) {
                if (valor2 > mayor) {
                    mayor = valor2;
                }
                if (valor3 > mayor) {
                    mayor = valor3;
                }
                
                if (valor2 < menor) {
                    menor = valor2;
                }
                if (valor3 < menor) {
                    menor = valor3;
                }
  	}
                double promedio = (valor1 + valor2 + valor3) / 3;
                System.out.println("El mayor valor es: " + mayor);
                System.out.println("El menor valor es: " + menor);
                System.out.printf("El promedio es: %.2f%n", promedio);
            sc.close();
        }
    }
}
