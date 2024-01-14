package Methods.VoidMethods;

public class VoidMethodExample03 {
    public static void main(String[] args) {
        double studentNote =80.7;
findRank(studentNote);
    }

    public static void findRank(double note ){
        if(note > 80) {
            System.out.println("Notunuz AA");

        }else if(note > 70 && note <=80){
            System.out.println("Notunuz  BB");

        } else {
            System.out.println("Kaldiniz sinif tekrari");
        }
    }
}
