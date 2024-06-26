import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClickCounter {
    static int c = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button = new JButton("Click here");
        JLabel label = new JLabel(String.valueOf(c), SwingConstants.CENTER);

        Font fuente = new Font("Arial", Font.PLAIN,90);
        label.setFont(fuente);

        ActionListener action = e -> {
            c++;

            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);
            button.setBackground(new Color(r, g, b));

            label.setText(String.valueOf(c));
        };

        button.addActionListener(action);

        frame.add(button);
        frame.add(label);
        frame.setLayout(new GridLayout(1, 2));

        frame.setVisible(true);
    }
}
