import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayiyi gir");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi gir");
        double sayi2 = scan.nextDouble();
        if (sayi1 < sayi2) {
            System.out.println(sayi1 + "kucuktur");
        } else if (sayi1 > sayi2) {
            System.out.println(sayi1 + "buyuktur");
        } else {
            System.out.println("esittir");
        }
    }
}
