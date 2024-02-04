import java.util.Arrays;
import java.util.Scanner;
public class Topla_Cift_Tek {
    public static void main(String[] args) {
        int toplam = 0;
        System.out.println("kac adet sayi girmek istiyorsunuz");
        Scanner scan = new Scanner(System.in);

        int toplamSayi = scan.nextInt();
        int[] dizi = new int[toplamSayi];
        System.out.println("------------*****------------");
            for(int i=0;i<toplamSayi;i++){
                System.out.println((i+1) + ". sayiyi giriniz");
             int girilenSayi=scan.nextInt();
           dizi[i] = girilenSayi;

        }
        System.out.println("------------*****------------");
            for(int i =0;i<toplamSayi;i++) {
                if (dizi[i] % 2 == 0) {
                    System.out.println(dizi[i] + " cift sayidir");
                } else {
                    System.out.println(dizi[i] + " tek sayidir");
                }

                System.out.println("------------*****------------");
            }
        System.out.println(" girdiginiz tum sayilar " + Arrays.toString(dizi));
        System.out.println("------------*****------------");
        for(int i =0;i<toplamSayi;i++) {
            toplam = toplam + dizi[i];

        }
        System.out.println("girdiginiz sayilarin toplami " + toplam);
        System.out.println("------------*****------------");
        System.out.println("girdiginiz sayilarin ortalamasi " + (double)toplam/toplamSayi);
    }
}
