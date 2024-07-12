import javax.swing.JFrame;
import java.awt.CardLayout;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new CardLayout());

        LoginPanel loginPanel = new LoginPanel(frame);
        biographyPanel biographyPanel = new biographyPanel(frame);
        hobbiesPanel hobbiesPanel = new hobbiesPanel(frame);

        frame.add(loginPanel, "Login");
        frame.add(biographyPanel, "Biografia: Una decision imposible");
        frame.add(hobbiesPanel, "Hobbies");

        frame.setVisible(true);
    }
}
