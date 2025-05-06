package programas;

import java.util.Scanner;

public class numMayor2 {

    public static void numMayor2() {
        Scanner scannernum = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 =scannernum.nextDouble();

        System.out.print("[n2]: ");
        double n2 =scannernum.nextDouble();

        System.out.print("[n3]: ");
        double n3 =scannernum.nextDouble();

        if (n1 > n2 && n3 < n1) {
            System.out.println("El número mayor es " + n1);
        }

        if (n2 > n1 && n3 < n2) {
            System.out.println("El número mayor es " + n2);
        }

        else {
            System.out.println("El número menor es " + n3);  
        }
        System.out.println("");
    }
}
