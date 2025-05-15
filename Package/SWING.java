package PackageBuilt;
import javax.swing.*;

public class SWING {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Example");

        // Create components
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Click Me");

        // Set component positions
        label.setBounds(50, 50, 150, 20);
        textField.setBounds(50, 80, 200, 25);
        button.setBounds(50, 120, 100, 30);

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Set frame properties
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
