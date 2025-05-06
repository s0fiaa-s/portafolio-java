package programas;

import java.util.Scanner;

public class multiplicacion {
    
    public static void multiplicar() {
        Scanner scannernum = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 =scannernum.nextDouble();

        System.out.print("[n2]: ");
        double n2 =scannernum.nextDouble();

        System.out.print("[Re]: " + (n1 * n2));

        System.out.println("");
    }
}
