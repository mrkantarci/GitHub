package Array;

import java.util.Random;
public class ArrayExample04 {
    public static void main(String[] args) {

        Random random = new Random();
     int[] numbers = new int[20];
     int toplam =0;
     int temp =0;
     for (int i=0; i<numbers.length; i++){

         numbers[i] = random.nextInt(50)+1;
         toplam = toplam +numbers[i];

        }
        System.out.println("sayilarin toplami : " + toplam);
        System.out.println("sayilarin ortalamasi : " + ((double)toplam/ numbers.length));
    }
}
