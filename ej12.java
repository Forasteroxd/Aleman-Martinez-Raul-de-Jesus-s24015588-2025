import java.util.Scanner;

		public class CalcularSalario{

		public static void main(String args[]){
			
			Scanner sc = new Scanner(System.in);
	
        double[] tarifas = {0, 20000, 15000, 10000, 7500};   

        System.out.println("Ingrese la categoría del empleado (1-4): ");
        int categoria = sc.nextInt();
        

        if (categoria < 1 || categoria > 4) {
            System.out.println("Categoría inválida. Debe ser un número entre 1 y 4.");
            
        }



						
        System.out.println("Ingrese el número de horas trabajadas en el mes: ");
        double horas = sc.nextDouble();

       
        double tarifa = tarifas[categoria];

        double salarioMensual = horas * tarifa;

        
        double subsidio = 0;
        if (salarioMensual < 1000000) {
            subsidio = 0.15 * salarioMensual;
        }
        

        double salarioTotal = salarioMensual + subsidio;
        
        double descuento = 0.072 * salarioTotal;


        double pagoNeto = salarioTotal - descuento;
    
        System.out.println("Salario mensual base: " + salarioMensual);
        System.out.println("Subsidio: " + subsidio);
        System.out.println("Salario total con subsidio: " + salarioTotal);
        System.out.println("Descuento por salud (7.2%): " + descuento);
        System.out.println("Pago neto a recibir: " + pagoNeto);
     

    }
}