import java.util.Scanner;
public class ej10{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int cal1, cal2, cal3;
        System.out.println("Ingrese la calificación de la materia 1: ");
        cal1 = sc.nextInt();
        System.out.println("Ingrese la calificación de la materia 2: ");
        cal2 = sc.nextInt();
        System.out.println("Ingrese la calificación de la materia 3: ");
        cal3 = sc.nextInt();
        System.out.println("El promedio general de las tres materias es: "+(cal1+cal2+cal3)/3);

     sc.close();
    } 	
}