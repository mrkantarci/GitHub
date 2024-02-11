package ArrayOrnegi;

import java.util.Scanner;

public class MukkemlSayiOrnegi {
    public static void main(String[] args) {
        //kullanici sifir girene kadar her girilen sayinin mukemmel sayi olup olmadi[ini soyleyecek
        Scanner scan = new Scanner(System.in);
        while(true) {
            int mukKontrol =0;

            System.out.println("bir sayi giriniz");
            int sayi = scan.nextInt();
            if(sayi==0){
                System.out.println("0 girdiniz cikiliyor");
                break;
            }
            System.out.println(sayi + " sayisinin bolenleri ");
            for(int i=1; i<sayi;i++){
               if(sayi %i==0){
                   System.out.println(i);

                   mukKontrol+=i;

               }
               }
           if(mukKontrol==sayi){
               System.out.println(" ve bu sayi mukemmel sayidir ");
               }
           else{
               System.out.println("mukemmel sayi degildir");
           }

            }

        }
    }

