/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music.data;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author i22balur
 */
public class InitializerMusic {
    
    List<ArtistInfo> artists = new ArrayList<ArtistInfo>();
    List<AlbumInfo> albums = new ArrayList<AlbumInfo>();
    List<SongInfo> songs = new ArrayList<SongInfo>();
    
    public InitializerMusic() {
    
        // Bon Jovi
        ArtistInfo a1 = new ArtistInfo();
        a1.setName("Bon Jovi");
        a1.setDescription("Rock and Roll");
        a1.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/music/bonjovi.jpg")));
        artists.add(a1);
        
            // Cross Road
            AlbumInfo al1 = new AlbumInfo();
            al1.setName("Cross Road");
            al1.setDescription("Ginna works the dinner all day (8)");
            al1.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/music/crossroad.jpg")));
            al1.setArtist("Bon Jovi");
            albums.add(al1);      
            
            // Songs
            songs.add(new SongInfo("Livin on a Prayer", "Cross Road"));
            songs.add(new SongInfo("Always", "Cross Road"));
            songs.add(new SongInfo("Wanted Dead or Alive", "Cross Road"));
            songs.add(new SongInfo("Runaway", "Cross Road"));
            songs.add(new SongInfo("It's my Life", "Cross Road"));
            
            // The Circle
            AlbumInfo al2 = new AlbumInfo();
            al2.setName("The Circle");
            al2.setDescription("Who's gonna work!!?? For the working man!!!");
            al2.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/music/thecircle.jpg")));
            al2.setArtist("Bon Jovi");
            albums.add(al2);
            
        // Metallica
        ArtistInfo a2 = new ArtistInfo();
        a2.setName("Metallica");
        a2.setDescription("Heavy Metal");
        a2.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/music/metallica.jpg")));
        artists.add(a2);
        
            // Black Album
            AlbumInfo al3 = new AlbumInfo();
            al3.setName("Black Album");
            al3.setDescription("And nothing else matters!!!");
            al3.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/music/black.jpg")));
            al3.setArtist("Metallica");
            albums.add(al3);
            
            // Black Album
            AlbumInfo al4 = new AlbumInfo();
            al4.setName("Ride the steak");
            al4.setDescription("Meeeeeeeeetal!!!!!");
            al4.setPhoto(new javax.swing.ImageIcon(getClass().getResource("/mc/music/ride.jpg")));
            al4.setArtist("Metallica");
            albums.add(al4);
        
    }

    public String getArtistDescription(String name) {
        
        for(int i=0; i<artists.size(); i++) {
            if(artists.get(i).name.equals(name)) {
                return artists.get(i).getDescription();
            }
        }
        
        // Never reached
        return null;
    }

    public ImageIcon getArtistPhoto(String name) {
        
        for(int i=0; i<artists.size(); i++) {
            if(artists.get(i).name.equals(name)) {
                return artists.get(i).getPhoto();
            }
        }
        
        // Never reached
        return null;    
    }
 
    
    
    public String getAlbumDescription(String name) {
        
        for(int i=0; i<albums.size(); i++) {
            if(albums.get(i).name.equals(name)) {
                return albums.get(i).getDescription();
            }
        }
        
        // Never reached
        return null;
    }

    public ImageIcon getAlbumPhoto(String name) {
        
        for(int i=0; i<albums.size(); i++) {
            if(albums.get(i).name.equals(name)) {
                return albums.get(i).getPhoto();
            }
        }
        
        // Never reached
        return null;    
    }

    public void filterAlbums(String artist) {
        
        List<AlbumInfo> aux = new ArrayList<AlbumInfo>();
        
        for(int i=0; i<albums.size();i++) {
            if(!albums.get(i).getArtist().equals(artist))
                aux.add(albums.get(i));
        }
        albums.removeAll(aux);
        
    }
    
    
    public String [] filterAlbumNames(String artist) {
        
        List<AlbumInfo> aux = new ArrayList<AlbumInfo>();
        
        for(int i=0; i<albums.size();i++) {
            if(albums.get(i).getArtist().equals(artist))
                aux.add(albums.get(i));
        }
        
        String [] names = new String [aux.size()];
        for(int i=0; i<aux.size(); i++) {
            names[i] = aux.get(i).getName();
        }
        
        return names;
    }
    
    
    public void filterSongs(String album) {
        
        List<SongInfo> aux = new ArrayList<SongInfo>();
        
        for(int i=0; i<songs.size();i++) {
            if(!songs.get(i).getAlbum().equals(album))
                aux.add(songs.get(i));
        }
        albums.removeAll(aux);
        
    }
    
    
    public String [] filterSongNames(String album) {
        
        List<SongInfo> aux = new ArrayList<SongInfo>();
        
        for(int i=0; i<songs.size();i++) {
            if(songs.get(i).getAlbum().equals(album))
                aux.add(songs.get(i));
        }
        
        String [] names = new String [aux.size()];
        for(int i=0; i<aux.size(); i++) {
            names[i] = aux.get(i).getName();
        }
        
        return names;
    }

    public ImageIcon getAlbumFromSong(String name) {
        for(int i=0; i<songs.size();i++)
            if(songs.get(i).getName().equals(name))
                return this.getAlbumPhoto(songs.get(i).getAlbum());
        return null;
    }

    public String getDescriptionFromSong(String name) {
        for(int i=0; i<songs.size();i++)
            if(songs.get(i).getName().equals(name))
                return this.getAlbumDescription(songs.get(i).getAlbum());
        return null;
    }
}
