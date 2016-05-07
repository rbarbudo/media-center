/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.video.data;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import mc.KindMedia;

/**
 * Initializer for the video media
 * 
 * @author Rafael Barbudo Lunar (i22balur)
 */

public class InitializerVideo 
{
    /********************************************************
     * -------------------------------------------- Variables
     *******************************************************/
    
    private List<FilmInfo> videos = new ArrayList<FilmInfo>();
    private List<ActorInfo> actors = new ArrayList<ActorInfo>();
    
    /********************************************************
     * ---------------------------------------- Constructores
     *******************************************************/
    
    public InitializerVideo() 
    {
        // Batman vs Superman - Local       
        videos.add(new FilmInfo("Batman vs Superman", "Eighteen months after a destructive attack by General Zod in Metropolis from Man of Steel, Superman has become controversial. Daily Planet journalist Clark Kent, Superman's alter ego, has moved in with Lois Lane. Bruce Wayne, who has operated in Gotham City as the vigilante Batman for nearly two decades, sees Superman as a potential threat to humanity.", "/mc/video/batman.jpg", KindMedia.LOCAL));
        // Señor de los anillos - Local
        videos.add(new FilmInfo("El Señor de los anillos", "Gandalf tricks Bilbo into hosting a party for Thorin and his band of dwarves, who sing of reclaiming the Lonely Mountain and its vast treasure from the dragon Smaug. When the music ends, Gandalf unveils a map showing a secret door into the Mountain and proposes that the dumbfounded Bilbo serve as the expedition's \"burglar\". The dwarves ridicule the idea, but Bilbo, indignant, joins despite himself.", "/mc/video/anillos.jpg", KindMedia.LOCAL));
        // Iron Man 3 - Web
        videos.add(new FilmInfo("Iron Man 3", "Genius, billionaire, and playboy Tony Stark, who has inherited the defense contractor Stark Industries from his father, is in war-torn Afghanistan with his friend and military liaison, Lieutenant Colonel James Rhodes to demonstrate the new \"Jericho\" missile. The convoy is ambushed and Stark is critically wounded by one of his own rocket propelled grenades.", "/mc/video/ironman.jpg", KindMedia.RECOMMENDED));  
        
        // Christian Bale
        actors.add(new ActorInfo("Christian Bale", "Christian Charles Philip Bale (born 30 January 1974) is an English actor. He has starred in both blockbuster films and smaller projects from independent producers and art houses. Bale first caught the public eye at the age of 13, when he was cast in the starring role of Steven Spielberg's Empire of the Sun (1987).", "/mc/video/bale.jpg", "Batman vs Superman", "Bruce Wayne"));
        // Heath Ledger
        actors.add(new ActorInfo("Heath Ledger", "Heathcliff Andrew Ledger (4 April 1979 – 22 January 2008) was an Australian actor and director. After performing roles in Australian television and film during the 1990s, Ledger left for the United States in 1998 to develop his film career.", "/mc/video/ledger.jpg", "Batman vs Superman", "Joker"));
        
        // Elijah Wood
        actors.add(new ActorInfo("Elijah Wood", "Elijah Jordan Wood (born January 28, 1981) is an American actor, film producer and DJ. He made his film debut with a minor part in Back to the Future Part II (1989). Landing a succession of larger roles, he was critically acclaimed as a child actor by age 9, being nominated for several Young Artist Awards.", "/mc/video/elijah.jpg", "El Señor de los anillos", "Frodo"));
    }

    /********************************************************
     * -------------------------------------------- Métodos
     *******************************************************/
    
    public String getVideoDescription(String name) 
    {
        for(int i=0; i<videos.size(); i++)
            if(videos.get(i).getName().equals(name))
                return videos.get(i).getDescription();     
        // Never reached
        return null;
    }

    public ImageIcon getVideoPhoto(String name) 
    {
        for(int i=0; i<videos.size(); i++)
            if(videos.get(i).getName().equals(name))
                return videos.get(i).getPhoto();   
        // Never reached
        return null;    
    }

        public String getActorDescription(String name) 
    {
        for(int i=0; i<actors.size(); i++)
            if(actors.get(i).getName().equals(name))
                return actors.get(i).getDescription();     
        // Never reached
        return null;
    }

    public ImageIcon getActorPhoto(String name) 
    {
        for(int i=0; i<actors.size(); i++)
            if(actors.get(i).getName().equals(name))
                return actors.get(i).getPhoto();   
        // Never reached
        return null;    
    }
    
    public String[] filterLocalFilms() 
    {
        List<String> localFilms = new ArrayList<String>();
        
        for(int i=0; i<videos.size(); i++)
            if(videos.get(i).getKind() == KindMedia.LOCAL)
                localFilms.add(videos.get(i).getName());
        
        String [] names = new String [localFilms.size()];
        
        for(int i=0; i<localFilms.size(); i++)
            names[i] = localFilms.get(i);
        
        return names;
    }

    public String[] filterActorFilms(String film) 
    {
        List<String> actorNames = new ArrayList<String>();
        
        for(int i=0; i<actors.size(); i++)
            if(actors.get(i).getFilm().equals(film))
                actorNames.add(actors.get(i).getName());
        
        String [] names = new String [actorNames.size()];
        
        for(int i=0; i<actorNames.size(); i++)
            names[i] = actorNames.get(i);
        
        return names;
    }
    
    public boolean isLocal(String name) {
        for(int i=0; i<videos.size(); i++)
            if(videos.get(i).getName().equals(name) && videos.get(i).getKind() == KindMedia.LOCAL)
                return true;
        
        return false;
    }
    
}