/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music;

import mc.music.data.InitializerMusic;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import mc.MediaCenter;

/**
 *
 * @author i22balur
 */
public class MusicAlbum extends javax.swing.JPanel {

    /**
     * Creates new form MusicArtist
     */
    public MusicAlbum() {
        
        mediaMusic = new InitializerMusic();
        
        
        background = new ImageIcon(Toolkit.getDefaultToolkit().getImage((getClass().getResource("/mc/wallpaper.jpg")))).getImage();
        initComponents();
        
        // Resize Icons
        Image backImg = ((ImageIcon)backArtist.getIcon()).getImage();
        backImg = backImg.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH ) ;  
        backArtist.setIcon(new ImageIcon(backImg));
    }

    MusicAlbum(String name) {
        mediaMusic = new InitializerMusic();
        albumNames = mediaMusic.filterAlbumNames(name);
        mediaMusic.filterAlbums(name);
        background = new ImageIcon(Toolkit.getDefaultToolkit().getImage((getClass().getResource("/mc/wallpaper.jpg")))).getImage();
        initComponents();
        
        
        // Modify album list
        
        DefaultListModel model = new DefaultListModel();
        
        for (int i= 0; i<albumNames.length; i++) {
            model.addElement(albumNames[i]);
        }

        albumList.setModel(model);

        
        // Resize Icons
        Image backImg = ((ImageIcon)backArtist.getIcon()).getImage();
        backImg = backImg.getScaledInstance(80, 80,  java.awt.Image.SCALE_SMOOTH ) ;  
        backArtist.setIcon(new ImageIcon(backImg));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backArtist = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        albumList = new javax.swing.JList<>();
        artistImage = new javax.swing.JLabel();
        description = new javax.swing.JTextField();

        backArtist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/back.png"))); // NOI18N
        backArtist.setContentAreaFilled(false);
        backArtist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backArtist.setPreferredSize(new java.awt.Dimension(80, 80));
        backArtist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backArtistMouseClicked(evt);
            }
        });

        albumList.setBackground(java.awt.Color.gray);
        albumList.setFont(new java.awt.Font("Ubuntu", 0, 21)); // NOI18N
        albumList.setForeground(new java.awt.Color(254, 254, 254));
        albumList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cross Road", "The Circle" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        albumList.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                albumListMouseMoved(evt);
            }
        });
        albumList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                albumListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(albumList);

        artistImage.setPreferredSize(new java.awt.Dimension(65, 43));

        description.setEditable(false);
        description.setBackground(java.awt.Color.darkGray);
        description.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(backArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(artistImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(backArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(artistImage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backArtistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArtistMouseClicked
        MediaCenter topFrame = (MediaCenter) SwingUtilities.getWindowAncestor(this);
        topFrame.getWindow().removeAll();
        topFrame.getWindow().add(topFrame.getMusicArtists());
        topFrame.getWindow().repaint();
        topFrame.getWindow().revalidate();
    }//GEN-LAST:event_backArtistMouseClicked

    private void albumListMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albumListMouseMoved
        int index = albumList.locationToIndex(evt.getPoint());
        
        String name = albumList.getModel().getElementAt(index);
        String description = mediaMusic.getAlbumDescription(name);
        ImageIcon photo = mediaMusic.getAlbumPhoto(name);
        
        this.description.setText(description);
        
        
        Image img = ((ImageIcon)photo).getImage();
        img = img.getScaledInstance(325, 215,  java.awt.Image.SCALE_SMOOTH ) ;  
        this.artistImage.setIcon(new ImageIcon(img)); 
        
    }//GEN-LAST:event_albumListMouseMoved

    private void albumListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_albumListMouseClicked
        int index = albumList.locationToIndex(evt.getPoint());
        String name = albumList.getModel().getElementAt(index);
       
        MediaCenter topFrame = (MediaCenter) SwingUtilities.getWindowAncestor(this);
        topFrame.getWindow().removeAll();
        topFrame.getWindow().add(new MusicSong(name));
        topFrame.getWindow().repaint();
        topFrame.getWindow().revalidate();
    }//GEN-LAST:event_albumListMouseClicked
    
    public void paintComponent(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }
    
    // Custom variables
    Image background;
    InitializerMusic mediaMusic;
    String [] albumNames;
    // End of custom variables

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> albumList;
    private javax.swing.JLabel artistImage;
    private javax.swing.JButton backArtist;
    private javax.swing.JTextField description;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
