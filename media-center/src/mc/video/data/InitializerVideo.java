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
        v1.setDescription("Eighteen months after a destructive attack by General Zod in Metropolis from Man of Steel, Superman has become controversial. Daily Planet journalist Clark Kent, Superman's alter ego, has moved in with Lois Lane. Bruce Wayne, who has operated in Gotham City as the vigilante Batman for nearly two decades, sees Superman as a potential threat to humanity. After learning of Batman's activities, Superman also views him as a threat, and seeks to stop him via the Daily Planet articles authored by him as Kent. Wayne learns that Russian weapon-trafficker Anatoli Knyazev has been contacting LexCorp's mogul Lex Luthor. Meanwhile, Luthor tries to convince Senator June Finch to allow him to import kryptonite retrieved from the Indian Ocean following the results of Zod's terraforming attempt, claiming to use it as a deterrent against Kryptonians, but she denies the request. He also makes side dealings with Finch's subordinate and demands access to Zod's body and the Kryptonian scout ship.");
        v1.setDescription("");
        v1.setDescription("Eighteen months after a destructive attack by General Zod in Metropolis from Man of Steel, Superman has become controversial. Daily Planet journalist Clark Kent, Superman's alter ego, has moved in with Lois Lane. Bruce Wayne, who has operated in Gotham City as the vigilante Batman for nearly two decades, sees Superman as a potential threat to humanity. \n" +
"\n" +
"After learning of Batman's activities, Superman also views him as a threat, and seeks to stop him via the Daily Planet articles authored by him as Kent. Wayne learns that Russian weapon-trafficker Anatoli Knyazev has been contacting LexCorp's mogul Lex Luthor. Meanwhile, Luthor tries to convince Senator June Finch to allow him to import kryptonite retrieved from the Indian Ocean following the results of Zod's terraforming attempt, claiming to use it as a deterrent against Kryptonians, but she denies the request. He also makes side dealings with Finch's subordinate and demands access to Zod's body and the Kryptonian scout ship.");
        v1.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/video/batman.jpg")));
        videos.add(v1);
        
        // Señor de los anillos
        FilmInfo v2 = new FilmInfo();
        v2.setName("El Señor de los anillos");
        v2.setDescription("Corred insensatos");
        v2.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/video/anillos.jpg")));
        videos.add(v2);
        
        videos.add(new FilmInfo("Iron Man", "No se me ocurre nada", "/mc/video/ironman.jpg"));
        
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
