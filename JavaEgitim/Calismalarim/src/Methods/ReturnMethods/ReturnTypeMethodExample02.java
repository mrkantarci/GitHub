package Methods.ReturnMethods;

import java.util.Scanner;

public class ReturnTypeMethodExample02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("Sayı1 giriniz: ");
        sayi1= scanner.nextInt();
        System.out.println("Sayı2 giriniz: ");
        sayi2= scanner.nextInt();
        int sonuc=karsilastir(sayi1,sayi2);
        System.out.println("Büyük olan +10 : "+(sonuc+10));
    }
    public static int karsilastir(int a, int b){
        if(a>b){
            return a;
        }
        else if(a<b){
            return b;
        }
        else{
            System.out.println("Büyük değer yoktur");
            return 0;
        }
    }
    }

