/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.video;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import mc.MediaCenter;

/**
 *
 * @author i22balur
 */
public class Playing extends javax.swing.JPanel {
    
    /**
     * Creates new form Principal
     */
    public Playing() {

        background = new ImageIcon(Toolkit.getDefaultToolkit().getImage((getClass().getResource("/mc/video/fox.jpg")))).getImage();
        initComponents();
 
        // Resize Icons
        Image stopImg = ((ImageIcon)stop.getIcon()).getImage();
        stopImg = stopImg.getScaledInstance(300, 150,  java.awt.Image.SCALE_SMOOTH ) ;  
        stop.setIcon(new ImageIcon(stopImg));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stop = new javax.swing.JButton();

        setBorder(null);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(960, 540));

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/music/controls.png"))); // NOI18N
        stop.setContentAreaFilled(false);
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
        });
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        MediaCenter topFrame = (MediaCenter) SwingUtilities.getWindowAncestor(this);
        topFrame.getWindow().removeAll();
        topFrame.getWindow().add(topFrame.getVideo());
        topFrame.getWindow().repaint();
        topFrame.getWindow().revalidate();
    }//GEN-LAST:event_stopMouseClicked

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopActionPerformed

    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
    
    // Custom variables
    Image background;
    // End of custom variables
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
