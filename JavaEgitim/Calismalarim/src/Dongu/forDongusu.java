package Dongu;

import java.util.Scanner;
public class forDongusu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("asal carpanlarina bolunuz");
        int number = scanner.nextInt();
        int sayac = 2;
        do {
            while(number % sayac== 0) {
                System.out.println("bolen " + sayac);
                number = number/sayac;
            }
           sayac++;
            System.out.println("bolen " + sayac);
        }while (number<sayac) ;
        }




}