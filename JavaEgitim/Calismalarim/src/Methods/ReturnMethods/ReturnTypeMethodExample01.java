package Methods.ReturnMethods;

import java.util.Random;

public class ReturnTypeMethodExample01 {
    public static void main(String[] args) {
Random random = new Random();
random.nextInt(50);
int toplam = topla(3,5);
        System.out.println("toplami :" + toplam * 2);
    }

    public static int topla(int number1, int number2 ) {
        System.out.println("toplam : " + (number1 + number2));
return number1+number2;
    }
}
