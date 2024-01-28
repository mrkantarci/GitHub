package memory_models;

public class immutableExample02 {

    public static void main(String[] args) {
        String name1 = "bilgeadam";
        String name2 = "bilgeadam";
        if (name1 == name2) {
            System.out.println("ayni deger.");
        }

        if(name1.equals(name2)){
            System.out.println("ayni deger");
        }
    }
}
