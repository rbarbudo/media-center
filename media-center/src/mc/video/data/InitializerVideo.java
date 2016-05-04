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
    
        // Batman vs Superman
        FilmInfo v1 = new FilmInfo();
        v1.setName("Batman vs Superman");
        v1.setDescription("Eighteen months after a destructive attack by General Zod in Metropolis from Man of Steel, Superman has become controversial. Daily Planet journalist Clark Kent, Superman's alter ego, has moved in with Lois Lane. Bruce Wayne, who has operated in Gotham City as the vigilante Batman for nearly two decades, sees Superman as a potential threat to humanity.");
        v1.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/video/batman.jpg")));
        videos.add(v1);
        
        // Señor de los anillos
        FilmInfo v2 = new FilmInfo();
        v2.setName("El Señor de los anillos");
        v2.setDescription("Gandalf tricks Bilbo into hosting a party for Thorin and his band of dwarves, who sing of reclaiming the Lonely Mountain and its vast treasure from the dragon Smaug. When the music ends, Gandalf unveils a map showing a secret door into the Mountain and proposes that the dumbfounded Bilbo serve as the expedition's \"burglar\". The dwarves ridicule the idea, but Bilbo, indignant, joins despite himself.");
        v2.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/video/anillos.jpg")));
        videos.add(v2);
        
        videos.add(new FilmInfo("Iron Man 3", "Genius, billionaire, and playboy Tony Stark, who has inherited the defense contractor Stark Industries from his father, is in war-torn Afghanistan with his friend and military liaison, Lieutenant Colonel James Rhodes to demonstrate the new \"Jericho\" missile. The convoy is ambushed and Stark is critically wounded by one of his own rocket propelled grenades.", "/mc/video/ironman.jpg"));
        
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
