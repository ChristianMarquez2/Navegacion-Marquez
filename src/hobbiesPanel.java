import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hobbiesPanel extends JPanel {
    private JFrame parentFrame;

    public hobbiesPanel(JFrame frame) {
        this.parentFrame = frame;
        setLayout(new BorderLayout(5, 5));

        JLabel titleLabel = new JLabel("Hobbies", SwingConstants.CENTER);
        ImageIcon hobbyImage = new ImageIcon(getClass().getResource("/Imagenes/Hobbie.jpg"));


        JLabel imageLabel = new JLabel(hobbyImage);
        JButton backButton = new JButton("Volvamos a mi aburrida NO biografia");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) parentFrame.getContentPane().getLayout();
                cl.show(parentFrame.getContentPane(), "Biografia: Una decision imposible");
            }
        });

        add(titleLabel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);
    }
}
