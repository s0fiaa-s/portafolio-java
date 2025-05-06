package programas;

import java.util.Scanner;

public class metros {
    
    public static void metros() {
        Scanner scannernum = new Scanner(System.in);

        System.out.print("[metros]: ");
        double metros =scannernum.nextDouble();

        double cm =(metros * 100);
        System.out.print("[Re]: " + cm);
   
        System.out.println("");
    }
}
