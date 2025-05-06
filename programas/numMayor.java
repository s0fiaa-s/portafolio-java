package programas;

import java.util.Scanner;

public class numMayor {
    
    public static void numMayor() {
        Scanner scannernum = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 =scannernum.nextDouble();

        System.out.print("[n2]: ");
        double n2 =scannernum.nextDouble();

        if (n1 > n2) {
            System.out.println("El número mayor es " + n1);
        }
        else {
            System.out.println("El número mayor es " + n2);  
        }
        System.out.println("");
    }
}
