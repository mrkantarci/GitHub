package memory_models;

import java.util.Locale;

public class ImmutableExample01 {
    public static void main(String[] args) {
        String x= "java";
        System.out.println("ilk hali: "+ x);
        x=x.concat("java rules");
        System.out.println("son hali: " + x);
        x = x.toUpperCase();
        System.out.println(x);
        System.out.println();
    }
}
