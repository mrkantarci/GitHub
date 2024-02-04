import java.util.Scanner;

//two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
public class s06q05 {
    public static void main(String[] args) {
        int sonuc=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabani giriniz");
        int taban = scan.nextInt();
        System.out.println("Ussu giriniz");
        int us = scan.nextInt();
        for(int i=1;i<=us;i++){
            sonuc=sonuc*taban;

        }
        System.out.println(sonuc);
    }
}
