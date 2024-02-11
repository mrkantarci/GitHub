import java.util.Arrays;


public class ArrayOrnek01 {
    public static void main(String[] args) {
        int toplam=0;
        int ciftToplam=0;
        int ciftAdet=0;
        int tekToplam=0;
        int tekAdet=0;
int[] array = {2,-9,0,5,12,-25,22,9,8,12};
for(int i=0; i<array.length;i++){
    toplam=toplam+array[i];
    if(array[i]%2==0){
        ciftToplam=ciftToplam+array[i];
        ciftAdet++;

    } else{
        tekToplam=tekToplam+array[i];
        tekAdet++;
    }

}
        System.out.println("tun sayilarin toplami " + toplam);
        System.out.println("tum sayilarin ortalamasi " +(double)toplam/array.length);
        System.out.println("cift sayilarin toplami " + ciftToplam);
        System.out.println("cift sayilarin ortalamasi " + (double)ciftToplam/ciftAdet);
        System.out.println("tek sayilarin toplami " + tekToplam);
        System.out.println("tek sayilarin ortalamasi " + (double)tekToplam/tekAdet);
    }
}
