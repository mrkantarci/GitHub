import java.util.Scanner;

public class s06q07 {
    public static void main(String[] args) {
        double number=2;
        Scanner input = new Scanner(System.in);

        while(number!= 0){
          System.out.println("bir rakam giriniz. size tek mi cift mi soyleyelim: ");
          number=  input.nextInt();
          if(number %2 == 0){
              System.out.println("cift sayi girdiniz.");}
              else {
                  System.out.println("tek sayi girdiniz");
              }

          }



    }
}
