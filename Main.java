import java.util.Scanner;
import programas.opciones;
import vistas.vista;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         int opcion;
         vistas.vista.banner();

         do {
            programas.opciones.opciones();
          

        //menu

        System.out.println(" [0] Salir ");
        System.out.print("Elige una opción: ");
        
            opcion = scanner.nextInt();

        // opciones
        switch (opcion) {
            case 1:
                System.out.println("---------------->");
                programas.sumar.suma();
                System.out.println("---------------->");
                break; 
            
            case 2:
                System.out.println("----------------->");
                programas.resta.resta();
                System.out.println("----------------->");
                break;

            case 3:
                System.out.println("------------------>");
                programas.multiplicacion.multiplicar();
                System.out.println("------------------>");
                break;

            case 4:
                System.out.println("------------------>");
                programas.division.dividir();
                System.out.println("------------------>");
                break;

            case 5:
                System.out.println("------------------>");
                programas.modulo.modulo1();
                System.out.println("------------------>");
                break;

            case 6:
                System.out.println("------------------>");
                programas.promedio.promedio();
                System.out.println("------------------>");
                break;

            case 7:
                System.out.println("------------------>");
                programas.numMayor.numMayor();
                System.out.println("------------------>");
                break;

            case 8:
                System.out.println("------------------>");
                programas.numMayor2.numMayor2();
                System.out.println("------------------>");
                break;
            
            case 9:
                System.out.println("------------------>");
                programas.metros.metros();
                System.out.println("------------------>");
                break;

            case 10:
                System.out.println("------------------>");
                programas.kilogramos.kilogramos();
                System.out.println("------------------>");
                break;

            default:
                System.out.println("Opción invalida, vuelve a intentar");
                break;
        }
    } while (opcion != 0);


    }
}
