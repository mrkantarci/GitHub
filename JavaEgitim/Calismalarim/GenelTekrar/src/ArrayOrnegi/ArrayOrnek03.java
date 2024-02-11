package ArrayOrnegi;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrnek03 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println(" Kac adet deger girmek istiyorsunuz");
        int sayi = scan.nextInt();
        int[] orrignalarray = new int[sayi];
        int[] reverseArray = new int[sayi];
        for(int i = sayi;i>=0;i--) {
            orrignalarray[i] = r.nextInt();
            System.out.println(orrignalarray[i]);
          for(int j=0;j<=sayi;j++){
              reverseArray[j] = orrignalarray[i];
          }
        }
        System.out.println(Arrays.toString(orrignalarray));
        System.out.println(Arrays.toString(reverseArray));
    }
}
