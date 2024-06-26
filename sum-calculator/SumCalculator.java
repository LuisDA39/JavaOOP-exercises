import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculator extends JFrame implements ActionListener {

    JTextField textField1;
    JTextField textField2;
    JButton equalButton;
    JLabel resultLabel;
    JLabel plusLabel;

    SumCalculator() {
        this.setName("Calculator");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(1,5));

        Font font1 = new Font("Comic Sans", Font.PLAIN, 30);

        textField1 = new JTextField();
        textField1.setFont(font1);
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(textField1);

        plusLabel = new JLabel("+");
        plusLabel.setFont(font1);
        plusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(plusLabel);

        textField2 = new JTextField();
        textField2.setFont(font1);
        textField2.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(textField2);

        equalButton = new JButton("=");
        equalButton.setFont(font1);
        equalButton.addActionListener(this);
        this.add(equalButton);

        resultLabel = new JLabel();
        resultLabel.setFont(font1);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(resultLabel);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(textField1.getText());
            int num2 = Integer.parseInt(textField2.getText());
            resultLabel.setText(String.valueOf(num1 + num2));
        } catch (NumberFormatException x) {
            resultLabel.setText("Error");
        }
    }

    public static void main(String[] args) {
        new SumCalculator();
    }
}
