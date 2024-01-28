import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class BasicOperators {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("print_writer.txt");
            printWriter.println("hello");
            printWriter.println();
            printWriter.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } finally {

        }


    }
}
