package PackageBuilt;
import java.net.URL;
import java.util.Scanner;

public class NET {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.example.com");
            Scanner sc = new Scanner(url.openStream());

            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);

        }
    }
}
