import java.util.Scanner;
public class Ej15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nota (0.0 a 5.0): ");
        double n = sc.nextDouble();
        String v;
        if (n >= 0.0 && n <= 1.0) v = "Pésimo";
        else if (n <= 2.0) v = "Mal";
        else if (n <= 2.9) v = "Regular";
        else if (n <= 4.0) v = "Bien";
        else v = "Excelente";
        System.out.println("Valoración: " + v);
        sc.close();
    }
}