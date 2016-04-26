/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.video.data;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author i22balur
 */
public class InitializerVideo {

    List<FilmInfo> videos = new ArrayList<FilmInfo>();
    
    public InitializerVideo() {
    
        // Bon Jovi
        FilmInfo v1 = new FilmInfo();
        v1.setName("Batman vs Superman");
        v1.setDescription("Soy batman");
        v1.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/video/batman.jpg")));
        videos.add(v1);
        
        // Metallica
        FilmInfo v2 = new FilmInfo();
        v2.setName("El Señor de los anillos");
        v2.setDescription("Corred insensatos");
        v2.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/video/anillos.jpg")));
        videos.add(v2);
    }

    public String getVideoDescription(String name) {
        
        for(int i=0; i<videos.size(); i++) {
            if(videos.get(i).name.equals(name)) {
                return videos.get(i).getDescription();
            }
        }
        
        // Never reached
        return null;
    }

    public ImageIcon getVideoPhoto(String name) {
        
        for(int i=0; i<videos.size(); i++) {
            if(videos.get(i).name.equals(name)) {
                return videos.get(i).getPhoto();
            }
        }
        
        // Never reached
        return null;    
    }
    
}
