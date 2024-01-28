package memory_models;

public class ImmutableExample03
{
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
    if (a== b) {
        System.out.println("ayni adresi referans ediyor");

    }
    else{
        System.out.println("ayni adresi referans etmiyor ");
    }
   if(a.equals(b)){
       System.out.println("ayni");

   }
   else {
       System.out.println("ayni degil");
   }
    }
}
