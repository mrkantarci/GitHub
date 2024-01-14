package Methods.VoidMethods;

import java.util.Scanner;

public class VoidMethodExample05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2 = scanner.nextInt();
        topla(sayi1,sayi2);
        cikar(sayi1,sayi2);
        bol(sayi1,sayi2);
        carp(sayi1,sayi2);
    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki sayinin toplami" + (sayi1 + sayi2));

    }

    public static void cikar(int sayi1, int sayi2) {
        System.out.println("iki sayinin cikarmasi" + (sayi1 - sayi2));

    }

    public static void bol(double sayi1, double sayi2) {
        System.out.println("iki sayinin bolumu" + (double)(sayi1 / sayi2));
    }
    public static void carp(int sayi1, int sayi2){
        System.out.println("iki sayinin carpimi" + (sayi1*sayi2) );}

}