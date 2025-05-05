import java.util.Scanner;

public class portafolio {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         int opcion;
        
         do {
        System.out.println("\n\n");
        System.out.println("Bienvenido a mi sofii Java [sofii versión 1.01]");    

        System.out.println("");
        System.out.println("");
        System.out.println("____         __ _"); 
        System.out.println("/ ___|  ___  / _(_) __ _"); 
        System.out.println("\\___ \\ / _ \\| |_| |/ _` |");
        System.out.println("___) | (_) |  _| | (_| |");
        System.out.println("|____/ \\___/|_| |_|\\__,_|");
        System.out.println("");
        System.out.println("");
       
        System.out.println("[?] Selecciona una opción para continuar: ");
        System.out.println("Proyecto iniciado -->  Mar 18 8:45 am 2025");
        System.out.println("");

        //menu
            System.out.println("[1] la suma de dos numeros ");
            System.out.println("[2] ");
            System.out.println("[3] ");
            System.out.println("[0] salir");
            System.out.print("[?] ");
            opcion = scanner.nextInt();

        // opciones
            switch (opcion) {
                case 1:
                    System.out.println("dime un número: ");
                    int numero1 = scanner.nextInt();
                    System.out.println("dime otro número: ");
                    int numero2 = scanner.nextInt();
                    int suma = numero1 + numero2;
                    System.out.println("la suma es: " + suma);

                    break;
                    default:
                    System.out.println("Opción no válida");
                    break;
   
            }
         } while (opcion != 0);


    }
}
