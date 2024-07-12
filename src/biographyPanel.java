import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biographyPanel extends JPanel {
    private JFrame parentFrame;

    public biographyPanel(JFrame frame) {
        this.parentFrame = frame;
        setLayout(new BorderLayout(5, 5));

        JLabel titleLabel = new JLabel("Biografia: Una decision imposible:", SwingConstants.CENTER);
        JTextArea bioTextArea = new JTextArea("Mi más grande Inspiración" +

                "Kal-El, conocido en la Tierra como Superman. Nacio en el planeta Krypton, pero antes de que mi hogar fuera destruido, mis padres, Jor-El y Lara, me enviaron a la Tierra para salvarme. Fui encontrado y adoptado por Jonathan y Martha Kent en Smallville, Kansas, quienes me criaron como su hijo, Clark Kent.\n" +
                "\n" +
                "Desde pequeño, descubrí que tenía poderes extraordinarios debido a la radiación del sol amarillo de la Tierra. Puedo volar, tengo una fuerza increíble, visión de rayos X, visión de calor, supervelocidad, y más. Inspirado por los valores de mis padres adoptivos, decidí usar mis habilidades para proteger a la humanidad.\n" +
                "\n" +
                "Hoy, vivo en Metropolis, donde trabajo como reportero para el Daily Planet. Mi identidad secreta me permite llevar una vida normal mientras lucho contra el crimen y protejo a los inocentes como Superman. Mis mayores enemigos incluyen a Lex Luthor, pero también tengo muchos amigos y aliados en la Liga de la Justicia.\n" +
                "\n" +
                "Para mí, ser Superman significa más que tener poderes; se trata de usar esos dones para hacer del mundo un lugar mejor y defender la verdad y la justicia.");
        bioTextArea.setEditable(false);
        JButton hobbiesButton = new JButton("Go to Hobbies");

        hobbiesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) parentFrame.getContentPane().getLayout();
                cl.show(parentFrame.getContentPane(), "Hobbies");
            }
        });

        add(titleLabel, BorderLayout.NORTH);
        add(new JScrollPane(bioTextArea), BorderLayout.CENTER);
        add(hobbiesButton, BorderLayout.SOUTH);
    }
}
