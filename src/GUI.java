import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private JPanel panelmain;
    private JPanel panelTop;
    private JPanel panelLeft;
    private JPanel panelRight;
    private JList listReservations;
    private JTextField Textdays;
    private JTextField TextRoom;
    private JTextField TextPrice;
    private JLabel Label;
    private JTextField textName;
    private JButton delButton;
    private JButton updateButton;
    private JButton saveButton;

    GUI(){
        super("WORK DAMMIT");
        this.setContentPane(this.panelmain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack(); // compiles screen
        // https://www.youtube.com/watch?v=lRupi3iJmzk part 5 of 8 min 3:35  FUCK
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        GUI screen = new GUI();
        screen.setVisible(true);
    }
}
