/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.video;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ResourceBundle;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import mc.MediaCenter;
import mc.video.data.InitializerVideo;

/**
 *
 * @author i22balur
 */
public class VideoActors extends javax.swing.JPanel {
   
    VideoActors(InitializerVideo mediaVideo, String name) {
        
        this.mediaVideo = mediaVideo;
        actorNames = this.mediaVideo.filterActorFilms(name);
        background = new ImageIcon(Toolkit.getDefaultToolkit().getImage((getClass().getResource("/mc/wallpaper.jpg")))).getImage();

        
        initComponents();
        
        // Modify actor list      
        DefaultListModel model = new DefaultListModel();       
        for (String actorName : actorNames)
            model.addElement(actorName);
        actorList.setModel(model);   
        
        // Resize back icon
        Image backImg = ((ImageIcon)back.getIcon()).getImage();
        backImg = backImg.getScaledInstance(55, 55,  java.awt.Image.SCALE_SMOOTH ) ;  
        back.setIcon(new ImageIcon(backImg));

        // Initialize description of the first actor        
        actorList.setSelectedIndex(0);
        name = actorList.getModel().getElementAt(0);
        String description = mediaVideo.getActorDescription(name);
        ImageIcon photo = mediaVideo.getActorPhoto(name);
        this.description.setText(description);
        Image img = ((ImageIcon)photo).getImage();
        img = img.getScaledInstance(520, 260,  java.awt.Image.SCALE_SMOOTH ) ;
        this.videoImage.setIcon(new ImageIcon(img)); 
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        actorList = new javax.swing.JList<>();
        infoActor = new javax.swing.JPanel();
        scrollDescription = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        videoImage = new javax.swing.JLabel();
        labelActor = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        actorList.setBackground(java.awt.Color.darkGray);
        actorList.setFont(new java.awt.Font("Ubuntu", 0, 21)); // NOI18N
        actorList.setForeground(new java.awt.Color(254, 254, 254));
        actorList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Christian Bale", "Heath Ledger" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        actorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actorListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(actorList);

        infoActor.setBackground(java.awt.Color.darkGray);
        infoActor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        scrollDescription.setBorder(new javax.swing.border.MatteBorder(null));

        description.setEditable(false);
        description.setBackground(java.awt.Color.darkGray);
        description.setColumns(20);
        description.setFont(new java.awt.Font("Ubuntu Light", 3, 18)); // NOI18N
        description.setForeground(new java.awt.Color(254, 254, 254));
        description.setLineWrap(true);
        description.setRows(5);
        description.setAutoscrolls(false);
        description.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 2, true));
        description.setDisabledTextColor(new java.awt.Color(254, 254, 254));
        description.setFocusable(false);
        scrollDescription.setViewportView(description);

        videoImage.setPreferredSize(new java.awt.Dimension(65, 43));

        javax.swing.GroupLayout infoActorLayout = new javax.swing.GroupLayout(infoActor);
        infoActor.setLayout(infoActorLayout);
        infoActorLayout.setHorizontalGroup(
            infoActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoActorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(videoImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoActorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        infoActorLayout.setVerticalGroup(
            infoActorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoActorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(videoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollDescription)
                .addContainerGap())
        );

        labelActor.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        labelActor.setForeground(new java.awt.Color(254, 254, 254));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("mc/Bundle"); // NOI18N
        labelActor.setText(bundle.getString("labelActor")); // NOI18N

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setPreferredSize(new java.awt.Dimension(80, 80));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelActor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(infoActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoActor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(labelActor)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void actorListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actorListMouseClicked
        int index = actorList.locationToIndex(evt.getPoint());
        String name = actorList.getModel().getElementAt(index);
        String description = mediaVideo.getActorDescription(name);
        ImageIcon photo = mediaVideo.getActorPhoto(name);

        this.description.setText(description);

        Image img = ((ImageIcon)photo).getImage();
        img = img.getScaledInstance(520, 260,  java.awt.Image.SCALE_SMOOTH ) ;
        this.videoImage.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_actorListMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        MediaCenter topFrame = (MediaCenter) SwingUtilities.getWindowAncestor(this);
        topFrame.getWindow().removeAll();
        topFrame.getWindow().add(topFrame.getVideo());
        topFrame.getWindow().repaint();
        topFrame.getWindow().revalidate();
    }//GEN-LAST:event_backMouseClicked

    public void paintComponent(Graphics g) 
    {
        g.drawImage(background, 0, 0, null);
    }
    
    public void configureLanguage(ResourceBundle rb) 
    {
        labelActor.setText(rb.getString("filmsLabel"));
    }
    
    // Custom variables
    private Image background;
    private InitializerVideo mediaVideo;
    private String [] localFilmNames;
    private String[] actorNames;
    // End of custom variables

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> actorList;
    private javax.swing.JButton back;
    private javax.swing.JTextArea description;
    private javax.swing.JPanel infoActor;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelActor;
    private javax.swing.JScrollPane scrollDescription;
    private javax.swing.JLabel videoImage;
    // End of variables declaration//GEN-END:variables

    public JPanel getInfoVideo() 
    {
        return infoActor;
    }
    
    public JLabel getLabelFilm() 
    {
        return labelActor;
    }
}
