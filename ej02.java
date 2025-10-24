import java.util.Scanner;
public class ej01 {
 public static void main (String [] args){
   double longitud,area,radio;
   Scanner sc = new Scanner(System.in);

   System.out.print("Ingrese el valor del radio: ");
   radio = sc.nextDouble();
   longitud = 2 * Math.PI * radio;
   area = Math.PI * Math.pow(radio, 2);
   System.out.printf("Longitud de la circunferencia: %.2f", longitud);
   System.out.println("");
   System.out.printf("Área del círculo: %.2f", area);

   sc.close();
  }
}