package utilities;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class Utilities {
    public static void preventLetters(java.awt.event.KeyEvent e, JLabel errorLabel) {
        char c = e.getKeyChar();
        if ( ((c < '0') || (c > '9')) 
            && (c != KeyEvent.VK_BACK_SPACE) 
            && (c != KeyEvent.VK_PERIOD) 
            && (c != KeyEvent.VK_ENTER)){
            
            e.consume();  // ignore event
            errorLabel.setText("Only Positive Numbers Allowed!");
        }else {
            errorLabel.setText("");
        }
    }
    
    public static void clearResults(JLabel areaLabel, JLabel perimeterLabel) {
        areaLabel.setText("0.0");
        perimeterLabel.setText("0.0");
    }
}
