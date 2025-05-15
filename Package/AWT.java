package PackageBuilt;
import java.awt.*;

public class AWT {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame f = new Frame("My AWT Example");
        // Create a label
        Label label = new Label("Enter your name:");
        // Create a text field
        TextField tf = new TextField();
        // Create a button
        Button b = new Button("Click Me");
        // Set positions and sizes
        label.setBounds(50, 50, 150, 20);
        tf.setBounds(50, 80, 200, 20);
        b.setBounds(50, 120, 80, 30);
        // Add components to the frame
        f.add(label);
        f.add(tf);
        f.add(b);
        // Set frame size, layout, and visibility
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
