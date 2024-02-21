package MethodOrnekleri;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* bir metodda kullanicadan kac kez zar atilmasi gerektigini sorun ve alin\
daha sonra main metodunda bunu yazdir

devami >>> bu adedi baska bir metoda gonderin ve o metodta random ile kullanicinin istedigi kadar  zar atin  ve bunlari ekrana yazin

zarlarin kac kac geldigini ekrana basmak yerine Array'e toplamini atiniz
bunlari koyduktan sonra ARrayi return edip main metodunda ekrana yaziniz
 */

public class Main2 {

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        int zarAdedi = main2.zarAtmaAdedi();
        System.out.println(zarAdedi + " kez istendi ");
       int[] array = main2.zarDiziToplami(zarAdedi);

    }

    public int zarAtmaAdedi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kac kere zar atilmasini istiyorsunuz :");
        int zarAtma = scan.nextInt();
        return zarAtma;
    }

    public void zarAt(int zarAdedi) {
        Random rand = new Random();
        for (int i = 1; i <= zarAdedi; i++) {
            int zar1 = rand.nextInt(6) + 1;
            int zar2 = rand.nextInt(6) + 1;
            System.out.println(i + ".kez zar atildi: ");
            System.out.println("1.zar sonucu : " + zar1);
            System.out.println("2.zar sonucu : " + zar2);
            System.out.println("***************");
        }
    }
public int[] zarDiziToplami(int zarAdedi){
            Random rand = new Random();
    int[] zarDiziToplami = new int[zarAdedi];
    for (int i = 1; i < zarAdedi; i++) {
                 int zar1 = rand.nextInt(6) + 1;
                 int zar2 = rand.nextInt(6) + 1;
                 int toplam = zar1+zar2;
                 zarDiziToplami[i] = toplam;


        }
            System.out.println(Arrays.toString(zarDiziToplami));
            return zarDiziToplami ;
    }
}
