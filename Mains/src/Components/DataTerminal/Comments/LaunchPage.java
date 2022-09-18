package Components.DataTerminal.Comments;

import javax.swing.*;
import java.awt.*;

public class LaunchPage {
    public LaunchPage() {
        perpareGUI();
    }

    private void perpareGUI() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700, 360);
        frame.setTitle("Terminal");
        frame.setLayout(null);
        final Image iconsTerminal = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\IdeaProjects\\Mains\\src\\Image\\Terminal.png");
        frame.setIconImage(iconsTerminal);
        frame.getContentPane().setBackground(new Color(0x123456));
    }
}
