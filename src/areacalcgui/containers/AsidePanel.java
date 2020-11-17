package areacalcgui.containers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;

public class AsidePanel extends JPanel {
    JPanel panel;

    public AsidePanel(JButton rectButton, JButton triButton, JButton circButton) {
        Dimension size = rectButton.getPreferredSize();
        Insets insets = getInsets();
        int insetsLeft = 25 + insets.left;
        int insetsTop = 150 + insets.top;
        
        
        rectButton.setBounds(insetsLeft, insetsTop, size.width, size.height);
        triButton.setBounds(insetsLeft, insetsTop + 60, size.width, size.height);
        circButton.setBounds(insetsLeft, insetsTop + 120, size.width, size.height);
        
        setLayout(null);
        
        add(rectButton);
        add(triButton);
        add(circButton);
        
        setBounds(0, 0, 250, 600);
        setBackground(Color.decode("#282C34"));
        
    }

    public AsidePanel() {
    }
}
