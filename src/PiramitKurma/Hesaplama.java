package PiramitKurma;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <=n; i++){
            for (int b = 1; b <= (n - i); b++){
                System.out.print(" ");
            }
            for (int y = 1; y <= ((2 * i) - 1); y++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int j=n; j>=0; j--) {
            for (int t = 1; t<=(n-j); t++){
                System.out.print(" ");
            }
            for (int q = 1; q<= ((2*j) - 1); q++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
