import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Snake {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.add(new Panel());
        frame.setIconImage(new ImageIcon(Snake.class.getResource("logo.png")).getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
    }
}