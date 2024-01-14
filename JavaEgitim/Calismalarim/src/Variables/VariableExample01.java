package Variables;

public class VariableExample01 {
    public static void main(String[] args) {
int hiz = 86;
if (hiz<50) {
    System.out.println("cezaniz " +hiz*2 +"tldir");
} else if(hiz>=50 & hiz<70 ){
            System.out.println("cezaniz" + hiz/2 +"tldir");
        }
else if(hiz>=70 & hiz<85){
    System.out.println("cezaniz" + hiz +"tl;dir");
}
else{
    System.out.println("cezaniz" + 3*hiz + "tldir" );
}
    }
}
