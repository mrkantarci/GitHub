package MethodOrnekleri;

import java.util.Scanner;

/* bir metodda kullanicadan kac kez zar atilmasi gerektigini sorun ve alin\
daha sonra main metodunda bunu yazdir

 */
public class Main2 {

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        int zarAdedi = main2.zarAtmaAdedi();
        System.out.println(zarAdedi + "kez istendi ");
    }

    public int zarAtmaAdedi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("kac kere zar atilmasini istiyorsunuz :");
        int zarAtma = scan.nextInt();
        return zarAtma;
    }

}
