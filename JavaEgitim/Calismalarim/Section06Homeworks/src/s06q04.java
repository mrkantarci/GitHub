import java.util.Scanner;
//Write a program to find the factorial value of any number entered through the keyboard.
public class s06q04 {
    public static void main(String[] args) {
        int carpim =1;
        System.out.println("Faktoryel alinmasini istediginiz sayiyi giriniz :");
        Scanner scan = new Scanner(System.in);
            int sayi = scan.nextInt();
            int sayi2 = sayi;
            for(;sayi>=1;sayi--){
                carpim=carpim*sayi;
            }
        System.out.println(sayi2 + " nin faktoryeli " + carpim);
    }
}
