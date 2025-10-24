import java.util.Scanner;
public class ej01 {
 public static void main (String [] args){
   double pulgadas;
   int pies;
   Scanner sc = new Scanner(System.in);

   System.out.println("Ingrese los metros a convertir");
   double metros = sc.nextDouble();
   pulgadas=metros *39.37;
   pies= (int) pulgadas/12;
   pulgadas= (pulgadas-(pies*12) );
   System.out.printf("La conversión de Metros a pies y pulgadas es: %d pies y %.2f pulgadas.", pies, pulgadas);
    
   sc.close();
  }
}