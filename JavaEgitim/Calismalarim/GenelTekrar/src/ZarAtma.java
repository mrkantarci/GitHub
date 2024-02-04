import java.util.Random;

public class ZarAtma {
    public static void main(String[] args) {
        Random rand = new Random();
        int zar1;
        int zar2;
        int deneme=1;
        do {
            zar1 = rand.nextInt(6)+1;
            zar2 = rand.nextInt(6) +1;
            System.out.println(deneme + ".deneme " + "1. zar " +  zar1 + " 2. zar " + zar2 );
            deneme++;
        }while (zar1!=6 || zar2 !=6);
                System.out.println("toplam atis sayisi " + deneme); ;

    }
}
