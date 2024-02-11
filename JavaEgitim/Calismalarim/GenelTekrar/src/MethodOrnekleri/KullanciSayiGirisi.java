package MethodOrnekleri;

import java.util.Scanner;

//kullancidan kac tane sayi girecegini aliniz -> metod
//daha sonra gircegi kadar sayiyi arraye atin -> metod
//arrayde bulunan toplami ve ortalamasini bulun -> metod
public class KullanciSayiGirisi {

    public static void main(String[] args) {

        KullanciSayiGirisi KullanciSayiGirisi = new KullanciSayiGirisi();
        int arrayLength =  KullanciSayiGirisi.getArrayLengthFromUser();
        int[] array = new int[arrayLength];
        array = KullanciSayiGirisi.getNumbersFromUser(array);
        KullanciSayiGirisi.calculateAvarageAndSum(array);
    }

    public int getArrayLengthFromUser(){

        Scanner scan = new Scanner(System.in);
        System.out.println("kac adet sayi girmek istiyorsunuz");
        int arrayLength = scan.nextInt();
        return arrayLength;
    }

    public int[] getNumbersFromUser(int[] array){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i < array.length;i++){
            System.out.println(i+1 + ". sayiyi giriniz :");
            int number= scanner.nextInt();
            array[i] = number;
        }
       return array;
    }

    public void calculateAvarageAndSum(int[] array) {
       int sum =0;

        for(int number:array) {
       sum=sum+number;
        }
        System.out.println("girdiginiz sayilarin toplami  : " + sum);
        System.out.println("girdiginiz sayilarin ortalamasi :" + (double)sum/array.length);
    }
}
