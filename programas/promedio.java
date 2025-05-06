package programas;

import java.util.Scanner;

public class promedio {
    
    public static void promedio() {
        Scanner scannernum = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 =scannernum.nextDouble();

        System.out.print("[n2]: ");
        double n2 =scannernum.nextDouble();

        System.out.print("[n3]: ");
        double n3 =scannernum.nextDouble();  

        System.out.print("[Re]: " + (n1 + n2 + n3) / 3);
        System.out.println("");
        
    }
}
