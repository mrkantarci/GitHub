package MethodOrnekleri;

import java.util.Scanner;

public class Main1 {
    // 1 ile 100 dahil olan tek sayilarn ve cigt saylarin toplamini bulan ve ekrana yazdiran uygulamayi yaziniz
    //
    public static void main(String[] args) {
Main1 main1 = new Main1();
main1.toplamBul();


    }

    public void toplamBul() {
        int ciftToplam = 0;
        int tekToplam = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                ciftToplam = ciftToplam + i;
            } else {
                tekToplam = tekToplam + i;
            }
        }
        System.out.println(tekToplam + " Tek Sayilarin toplami");
        System.out.println(ciftToplam + " Cift Sayilarin toplami");
    }


}