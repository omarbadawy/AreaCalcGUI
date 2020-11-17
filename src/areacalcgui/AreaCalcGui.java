package areacalcgui;

import areacalcgui.components.Button;
import areacalcgui.containers.AsidePanel;
import areacalcgui.containers.CirclePanel;
import areacalcgui.containers.RectanglePanel;
import areacalcgui.containers.TrianglePanel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AreaCalcGui extends JFrame {
    
    
    JFrame frame;
    JButton rectButton = new Button("Rectangle");
    JButton triButton = new Button("Triangle");
    JButton circButton = new Button("Circle");
    
    JPanel trianglePanel = new TrianglePanel();
    JPanel rectanglePanel = new RectanglePanel();
    JPanel circlePanel = new CirclePanel();
        
    JPanel asidePanel = new AsidePanel(rectButton, triButton, circButton);
    
    AreaCalcGui() {
        Dimension size = trianglePanel.getPreferredSize();
        
        trianglePanel.setBounds(250, 0, size.width, size.height);
        rectanglePanel.setBounds(250, 0, size.width, size.height);
        circlePanel.setBounds(250, 0, size.width, size.height);
        
        /////////////// DEFAULT ////////////////
        add(rectanglePanel);
        add(asidePanel);
        ////////////////////////////
        
        
        /*
            Controllers
        */
        
        rectButton.addMouseListener(new java.awt.event.MouseAdapter() {
             @Override
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchToRect();
            }
        });
        
        rectButton.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    switchToRect();
                }
            }
        });
        
        triButton.addMouseListener(new java.awt.event.MouseAdapter() {
             @Override
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchToTri();
            }
        });
        
        triButton.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    switchToTri();
                }
            }
        });
        
        circButton.addMouseListener(new java.awt.event.MouseAdapter() {
             @Override
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 switchToCirc();
            }
        });
        
        circButton.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    switchToCirc();
                }
            }
        });
        
        
        setSize(900, 600);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height/2);
        setResizable(false);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /*
    SWitchers
    */
    
    private void switchToRect() {
        remove(trianglePanel);
        remove(circlePanel);
        add(rectanglePanel);
        revalidate();
        repaint();
    }
    
    private void switchToTri() {
        remove(rectanglePanel);
        remove(circlePanel);
        add(trianglePanel);
        revalidate();
        repaint();
    }
    
    private void switchToCirc() {
        remove(rectanglePanel);
        remove(trianglePanel);
        add(circlePanel);
        revalidate();
        repaint();
    }
    
    public static void main(String[] args) {
        new AreaCalcGui();
        
    }
}
