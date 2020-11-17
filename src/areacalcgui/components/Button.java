package areacalcgui.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class Button extends JButton{

     JButton button;
    public Button(String text) {
        setText(text);
        setPreferredSize(new Dimension(170, 50));
        setFont(new Font("Helvetica", Font.PLAIN, 20));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBackground(Color.decode("#61DAFB"));
        setForeground(Color.decode("#292F33"));
    }
    
    public Button() {
    }
}
