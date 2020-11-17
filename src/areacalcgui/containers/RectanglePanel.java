/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacalcgui.containers;

import areacalcgui.shapes.Rectangle;
import java.awt.event.KeyEvent;
import utilities.Utilities;

/**
 *
 * @author omar
 */
public class RectanglePanel extends javax.swing.JPanel {

    /**
     * Creates new form RectanglePanel
     */
    public RectanglePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        heightInput = new javax.swing.JTextField();
        widthInput = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        calcButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        areaText = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        perimeterText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 56, 56));
        jLabel1.setText("Rectangle");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(56, 56, 56));
        jLabel2.setText("Width :");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 56, 56));
        jLabel3.setText("Height :");

        heightInput.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        heightInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heightInputKeyTyped(evt);
            }
        });

        widthInput.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        widthInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                widthInputKeyTyped(evt);
            }
        });

        errorLabel.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(200, 35, 51));
        errorLabel.setPreferredSize(new java.awt.Dimension(300, 21));

        calcButton.setBackground(new java.awt.Color(97, 218, 251));
        calcButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        calcButton.setText("Calculate");
        calcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcButtonMouseClicked(evt);
            }
        });
        calcButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                calcButtonKeyPressed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(97, 218, 251));
        clearButton.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        clearButton.setText("Clear");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        clearButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clearButtonKeyPressed(evt);
            }
        });

        areaText.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        areaText.setForeground(new java.awt.Color(40, 44, 52));
        areaText.setText("0.0");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 56, 56));
        jLabel6.setText("Area :");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(56, 56, 56));
        jLabel7.setText("Perimeter :");

        perimeterText.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        perimeterText.setForeground(new java.awt.Color(40, 44, 52));
        perimeterText.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaText)
                            .addComponent(perimeterText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(8, 8, 8))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(widthInput)
                                    .addComponent(heightInput))))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaText)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perimeterText)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void calculateFun() {
        Rectangle rect = new Rectangle();
        
        // clear
        errorLabel.setText("");
        areaText.setText("0.0");
        perimeterText.setText("0.0");
        
        try {
            float widthVal = Float.parseFloat(widthInput.getText());
            float heightVal = Float.parseFloat(heightInput.getText());
            
            rect.setWidth(widthVal);
            rect.setHeight(heightVal);
            rect.validate();
            rect.calcArea();
            rect.calcPerimeter();
            
            areaText.setText(Float.toString(rect.getArea()));
            perimeterText.setText(Float.toString(rect.getPerimeter()));
            
        } catch(NumberFormatException err) {
            errorLabel.setText("Enter Valid Numbers!");
        } catch (ArithmeticException err) {
            errorLabel.setText(err.getMessage());
        }
    }
    
    private void clearAllFun() {
        errorLabel.setText("");
        widthInput.setText("");
        heightInput.setText("");
        areaText.setText("0.0");
        perimeterText.setText("0.0");
    }
    
    private void calcButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcButtonMouseClicked
       calculateFun();
    }//GEN-LAST:event_calcButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        clearAllFun();
    }//GEN-LAST:event_clearButtonMouseClicked

    private void widthInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthInputKeyTyped
        Utilities.preventLetters(evt, errorLabel);
    }//GEN-LAST:event_widthInputKeyTyped

    private void heightInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightInputKeyTyped
        Utilities.preventLetters(evt, errorLabel);
    }//GEN-LAST:event_heightInputKeyTyped

    private void calcButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_calcButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calculateFun();
        }
    }//GEN-LAST:event_calcButtonKeyPressed

    private void clearButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clearButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            clearAllFun();
        }
    }//GEN-LAST:event_clearButtonKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaText;
    private javax.swing.JButton calcButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField heightInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel perimeterText;
    private javax.swing.JTextField widthInput;
    // End of variables declaration//GEN-END:variables
}