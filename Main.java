import javax.swing.*;


public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(90,90);

        frame.setVisible(true);
    }
}
