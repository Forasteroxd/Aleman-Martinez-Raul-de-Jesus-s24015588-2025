import java.util.Scanner;
public class ej17{
 public static void main(String [] args){
  Scanner sc = new Scanner(System.in); 
   int numero; 
   boolean primo; 
    System.out.println("Ingresa un numero");
    numero=sc.nextInt(); 
         if (numero <= 1) {
            primo = false;
        } else if (numero == 2) {
            primo = true;
        } else if (numero % 2 == 0) {
            primo = false;
         }else{ 
         primo = true; 
        }
 if (primo){
  System.out.println("El numero " + numero +" es primo"); 
  } else { 
   System.out.println("El numero " + numero + " no es primo");
    }
  sc.close();
 }
}