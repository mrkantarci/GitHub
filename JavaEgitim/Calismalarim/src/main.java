import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci sayiyi gir");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi gir");
        double sayi2 = scan.nextDouble();
        System.out.println("toplam:" + ((sayi1 + sayi2)/2));


    }
}
