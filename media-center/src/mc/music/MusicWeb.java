/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music;

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
import mc.music.data.InitializerMusic;

/**
 *
 * @author i22balur
 */
public class MusicWeb extends javax.swing.JPanel {
   
    MusicWeb(InitializerMusic mediaMusic) {
        
        this.mediaMusic = mediaMusic;
        recommendedActors = this.mediaMusic.filterRecommendedArtists();
        newArtists = this.mediaMusic.filterNewArtists();
        
        background = new ImageIcon(Toolkit.getDefaultToolkit().getImage((getClass().getResource("/mc/wallpaper.jpg")))).getImage();
        
        initComponents();  
        
        // Modify recommended list      
        DefaultListModel model = new DefaultListModel();       
        for (String recommended : recommendedActors)
            model.addElement(recommended);
        recomList.setModel(model);   
        
        // Modify new list      
        model = new DefaultListModel();       
        for (String newFilm : newArtists)
            model.addElement(newFilm);
        newList.setModel(model);
        
        // Resize back icon
        Image backImg = ((ImageIcon)back.getIcon()).getImage();
        backImg = backImg.getScaledInstance(55, 55,  java.awt.Image.SCALE_SMOOTH ) ;  
        back.setIcon(new ImageIcon(backImg));

        // Initialize description of the new film        
        newList.setSelectedIndex(0);
        String name = newList.getModel().getElementAt(0);
        String description = mediaMusic.getArtistDescription(name);
        ImageIcon photo = mediaMusic.getArtistPhoto(name);
        this.description.setText(description);
        Image img = ((ImageIcon)photo).getImage();
        img = img.getScaledInstance(520, 260,  java.awt.Image.SCALE_SMOOTH ) ;
        this.artistImage.setIcon(new ImageIcon(img)); 
        
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
        newList = new javax.swing.JList<>();
        infoFilm = new javax.swing.JPanel();
        scrollDescription = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        artistImage = new javax.swing.JLabel();
        labelNew = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        labelRecommended = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        recomList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        newList.setBackground(new java.awt.Color(0,0,0,175));
        newList.setFont(new java.awt.Font("Ubuntu", 0, 21)); // NOI18N
        newList.setForeground(new java.awt.Color(254, 254, 254));
        newList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Christian Bale", "Heath Ledger" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        newList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(newList);

        infoFilm.setBackground(new java.awt.Color(0,0,0,175));
        infoFilm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        artistImage.setPreferredSize(new java.awt.Dimension(65, 43));

        javax.swing.GroupLayout infoFilmLayout = new javax.swing.GroupLayout(infoFilm);
        infoFilm.setLayout(infoFilmLayout);
        infoFilmLayout.setHorizontalGroup(
            infoFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoFilmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(infoFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(artistImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE))
                .addContainerGap())
        );
        infoFilmLayout.setVerticalGroup(
            infoFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoFilmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(artistImage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNew.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        labelNew.setForeground(new java.awt.Color(254, 254, 254));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("mc/Bundle"); // NOI18N
        labelNew.setText(bundle.getString("labelNew")); // NOI18N

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mc/back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setPreferredSize(new java.awt.Dimension(80, 80));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        labelRecommended.setFont(new java.awt.Font("Ubuntu", 3, 24)); // NOI18N
        labelRecommended.setForeground(new java.awt.Color(254, 254, 254));
        labelRecommended.setText(bundle.getString("labelRecommended")); // NOI18N

        recomList.setBackground(new java.awt.Color(0,0,0,175));
        recomList.setFont(new java.awt.Font("Ubuntu", 0, 21)); // NOI18N
        recomList.setForeground(new java.awt.Color(254, 254, 254));
        recomList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Christian Bale", "Heath Ledger" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        recomList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recomListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(recomList);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText(bundle.getString("backButton")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNew, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelRecommended, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(infoFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelRecommended)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addGap(28, 28, 28))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newListMouseClicked
        recomList.clearSelection();
                
        int index = newList.locationToIndex(evt.getPoint());
        String name = newList.getModel().getElementAt(index);
      
        if(evt.getClickCount() == 2) {          
            MediaCenter topFrame = (MediaCenter) SwingUtilities.getWindowAncestor(this);
            topFrame.getWindow().removeAll();
            //topFrame.setMusicAlbum(new MusicAlbum(name));
            //topFrame.getWindow().add(topFrame.getMusicAlbum());
            topFrame.getWindow().add(new MusicAlbum(name));
            topFrame.getWindow().repaint();
            topFrame.getWindow().revalidate();
        }
        else {
            String description = mediaMusic.getArtistDescription(name);
            ImageIcon photo = mediaMusic.getArtistPhoto(name);

            this.description.setText(description);

            Image img = ((ImageIcon)photo).getImage();
            img = img.getScaledInstance(520, 260,  java.awt.Image.SCALE_SMOOTH ) ;  
            this.artistImage.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_newListMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        MediaCenter topFrame = (MediaCenter) SwingUtilities.getWindowAncestor(this);
        topFrame.getWindow().removeAll();
        topFrame.getWindow().add(new MusicArtist());
        topFrame.getWindow().repaint();
        topFrame.getWindow().revalidate();
    }//GEN-LAST:event_backMouseClicked

    private void recomListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recomListMouseClicked
        newList.clearSelection();
                
        int index = recomList.locationToIndex(evt.getPoint());
        String name = recomList.getModel().getElementAt(index);
      
        if(evt.getClickCount() == 2) {          
            MediaCenter topFrame = (MediaCenter) SwingUtilities.getWindowAncestor(this);
            topFrame.getWindow().removeAll();
            //topFrame.setMusicAlbum(new MusicAlbum(name));
            //topFrame.getWindow().add(topFrame.getMusicAlbum());
            topFrame.getWindow().add(new MusicAlbum(name));
            topFrame.getWindow().repaint();
            topFrame.getWindow().revalidate();
        }
        else {
            String description = mediaMusic.getArtistDescription(name);
            ImageIcon photo = mediaMusic.getArtistPhoto(name);

            this.description.setText(description);

            Image img = ((ImageIcon)photo).getImage();
            img = img.getScaledInstance(520, 260,  java.awt.Image.SCALE_SMOOTH ) ;  
            this.artistImage.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_recomListMouseClicked

    public void paintComponent(Graphics g) 
    {
        g.drawImage(background, 0, 0, null);
    }
    
    public void configureLanguage(ResourceBundle rb) 
    {
        labelNew.setText(rb.getString("filmsLabel"));
    }
    
    // Custom variables
    private Image background;
    private InitializerMusic mediaMusic;
    private String [] localActorNames;
    private String[] recommendedActors;
    private String [] newArtists;
    // End of custom variables

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel artistImage;
    private javax.swing.JButton back;
    private javax.swing.JTextArea description;
    private javax.swing.JPanel infoFilm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelNew;
    private javax.swing.JLabel labelRecommended;
    private javax.swing.JList<String> newList;
    private javax.swing.JList<String> recomList;
    private javax.swing.JScrollPane scrollDescription;
    // End of variables declaration//GEN-END:variables

    public JPanel getInfoVideo() 
    {
        return infoFilm;
    }
    
    public JLabel getLabelFilm() 
    {
        return labelNew;
    }
}
