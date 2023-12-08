import java.io.FileWriter;
import java.io.IOException;

public class saveCharacter {





    public static void save() {
        FileWriter out = null;
        try {
            out = new FileWriter("output.txt");
            out.write("Hello World");
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ce) {
                    System.out.println("Failed to close the file: " + ce.toString());
                }
            }
        }
    }
}
