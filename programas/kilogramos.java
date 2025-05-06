package programas;

import java.util.Scanner;

public class kilogramos {
    
    public static void kilogramos() {
        Scanner scannernum = new Scanner(System.in);

        System.out.print("[kilogramos]: ");
        double kilogramos =scannernum.nextDouble();

        double gm =(kilogramos * 1000);
        System.out.print("[Re]: " + gm);
   
        System.out.println("");
    }
}
