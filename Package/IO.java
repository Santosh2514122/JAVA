package PackageBuilt;//for user class
import java.io.FileWriter;//io
import java.io.IOException;//io
public class IO {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is Santosh writing to a file!");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}