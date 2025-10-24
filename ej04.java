import java.util.Scanner;
public class ej04{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     int AñoActual=2025, AñoNacimiento, edad;
     System.out.println("Ingresa tu año de nacimiento: ");
     AñoNacimiento = sc.nextInt();
     edad = AñoActual - AñoNacimiento;
     System.out.println("Tu edad es: " + edad + " años.");

     sc.close();
    }
}