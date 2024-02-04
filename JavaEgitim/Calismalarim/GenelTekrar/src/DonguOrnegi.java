import java.util.Scanner;

public class DonguOrnegi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayac = 1;
        int sayi1;
        System.out.println("sayiyi gir");
        sayi1 = scan.nextInt();
        while (sayi1 != 0) {

            toplam = toplam + sayi1;
            sayac = sayac + 1;

        }
        System.out.println("toplam " + toplam);
        System.out.println("ortalama " + (double) toplam / sayac);
    }
}

