
package ArrayOrnegi;

import java.util.Scanner;

public class ArrayOrnek02 {

    public static void main(String[] args) {
        int toplam=0;
        int ciftToplam=0;
        int tekToplam=0;
        int girilenSayi;
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sayi giriniz. 0 girdiginizde islem bitecek ve girdiginiz sayilarin toplami ve ortlamasi verilecek");
            girilenSayi = scan.nextInt();


            if (girilenSayi == 0) {
                System.out.println("0 girdiniz, isleminiz bitiriliyor");
                break;
            }
            toplam = toplam + girilenSayi;
            if (girilenSayi % 2 == 0) {
                ciftToplam = ciftToplam + girilenSayi;

            } else {
                tekToplam = tekToplam + girilenSayi;

            }

        }
        System.out.println("cift toplam" + ciftToplam);
        System.out.println("tek toplam" + tekToplam);
        System.out.println("toplam sayilar"
        + toplam);
    }
}
