import java.util.Scanner;
public class ej05{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double celsius,fahrenheit, kelvin;
     System.out.println("Ingrese la temperatura en grados Centígrados: ");
     celsius = sc.nextDouble();
     fahrenheit = (celsius * 9/5) + 32;
     kelvin = celsius + 273.15;
     System.out.printf("Grados Fahrenheit: %.2f °F", fahrenheit);
     System.out.println("");
     System.out.printf("Temperatura Absoluta: %.2f K", kelvin);

     sc.close();
    }
}