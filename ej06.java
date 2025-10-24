import java.util.Scanner;
public class ej06{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int h, m;
     double porcentajeHombres, porcentajeMujeres,totalEstudiantes;
     System.out.println("Ingrese la cantidad de hombres: ");
     h = sc.nextInt();
     System.out.println("Ingrese la cantidad de mujeres: ");
     m = sc.nextInt();
     totalEstudiantes = h + m;
     porcentajeHombres = (h/totalEstudiantes) * 100;
     porcentajeMujeres = (m/totalEstudiantes) * 100;
     System.out.printf("Porcentaje de hombres: %.2f%%", porcentajeHombres);
     System.out.println("");
     System.out.printf("Porcentaje de mujeres: %.2f%%", porcentajeMujeres);

     sc.close();
    }
}