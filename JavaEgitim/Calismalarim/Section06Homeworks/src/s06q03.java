import java.util.Scanner;
//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
public class s06q03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = scan.nextInt();
        for(int i =0;i<=10;i++){
            System.out.println(i +"x" + sayi + "=" +(i*sayi));
        }

    }
}
