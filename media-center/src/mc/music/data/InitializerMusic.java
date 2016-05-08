/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc.music.data;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import mc.KindMedia;

/**
 *
 * @author i22balur
 */
public class InitializerMusic {
    
    List<ArtistInfo> artists = new ArrayList<>();
    List<AlbumInfo> albums = new ArrayList<>();
    List<SongInfo> songs = new ArrayList<>();
    
    public InitializerMusic() {
    
        // Bon Jovi
        artists.add(new ArtistInfo("Bon Jovi","Bon Jovi is an American rock band from Sayreville, New Jersey. Formed in 1983, Bon Jovi consists of lead singer and namesake Jon Bon Jovi (born John Francis Bongiovi, Jr.), pianist and keyboardist David Bryan, and drummer Tico Torres.","/mc/music/bonjovi.jpg",KindMedia.LOCAL));   
            // Cross Road
            albums.add(new AlbumInfo("Cross Road","Cross Road is the first greatest hits album by American rock band Bon Jovi, released on October 11, 1994 by Mercury Records. The album contains hits from between Bon Jovi (1984) and Keep the Faith (1992) and two new tracks: the hit singles \"Always\" and \"Someday I'll Be Saturday Night\", as well as a new, updated rendition of \"Livin' on a Prayer\" entitled \"Prayer '94\" available only on the North American versions.","/mc/music/crossroad.jpg","Bon Jovi"));           
                // Songs
                songs.add(new SongInfo("Livin on a Prayer", "Cross Road", "Bon Jovi", true));
                songs.add(new SongInfo("Runaway", "Cross Road", "Bon Jovi", true));
            // The Circle
            albums.add(new AlbumInfo("The Circle","The Circle is the eleventh studio album by American rock band Bon Jovi. Produced by John Shanks, the album was released November 10, 2009. The album debuted at #1 in several countries, including the U.S., where it sold 163,000 copies in its first week debuting at #1 on the Billboard 200.","/mc/music/thecircle.jpg","Bon Jovi"));
                // Songs
                songs.add(new SongInfo("You Give Love A Bad Name", "The Circle", "Bon Jovi", true));
          
        // Metallica
        artists.add(new ArtistInfo("Metallica","Metallica is an American heavy metal band formed in Los Angeles, California. Metallica was formed in 1981 when vocalist/guitarist James Hetfield responded to an advertisement posted by drummer Lars Ulrich in a local newspaper. The band's current line-up comprises founding members Hetfield and Ulrich, longtime lead guitarist Kirk Hammett.","/mc/music/metallica.jpg",KindMedia.LOCAL));
            // Ride the lighting
            albums.add(new AlbumInfo("Ride the lighting","Ride the Lightning is the second studio album by American heavy metal band Metallica, released on July 27, 1984, by the independent label Megaforce Records. The album was recorded in three weeks with producer Flemming Rasmussen at the Sweet Silence Studios in Copenhagen, Denmark.","/mc/music/ride.jpg","Metallica"));
                // Songs
                songs.add(new SongInfo("Fade To Black", "Ride the lighting", "Metallica", true));
    
        // REM
        artists.add(new ArtistInfo("REM","R.E.M. was an American rock band from Athens, Georgia, formed in 1980 by lead singer Michael Stipe, lead guitarist Peter Buck, bassist/backing vocalist Mike Mills, and drummer Bill Berry. One of the first popular alternative rock bands, R.E.M. were noted for Buck's ringing, arpeggiated guitar style, Stipe's particular vocal quality, and Mills.","/mc/music/rem.jpg",KindMedia.NEW));
            // Ride the lighting
            albums.add(new AlbumInfo("In Time","In Time: The Best of R.E.M. 1988–2003 is the second official compilation album released by R.E.M. Issued in 2003, it includes tracks from their Warner Bros. Records era, from 1988's Green to 2001's Reveal, as well as two new recordings and two songs from movie soundtracks. The album was the tenth-best-selling album of 2003 in the UK.","/mc/music/intime.jpg","REM"));
                // Songs
                songs.add(new SongInfo("Losing My Religion", "In Time", "REM", false));
                
        // Metallica
        artists.add(new ArtistInfo("Rise Against","Rise Against is an American melodic hardcore band from Chicago, Illinois, formed in 1999. The band's current line-up comprises vocalist/rhythm guitarist Tim McIlrath, lead guitarist Zach Blair, bassist Joe Principe and drummer Brandon Barnes.","/mc/music/rise.jpg",KindMedia.RECOMMENDED));
            // Ride the lighting
            albums.add(new AlbumInfo("End Game","Endgame is the sixth studio album by American rock band Rise Against, released on March 15, 2011 through DGC Records and Interscope Records. Rise Against began work on the album in September 2010, after completing touring in support of its previous album, Appeal to Reason, in mid-2010.","/mc/music/endgame.jpg","Rise Against"));
                // Songs
                songs.add(new SongInfo("Satellite", "End Game", "Rise Against", false));        
                
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
        
        List<AlbumInfo> aux = new ArrayList<>();
        
        for(int i=0; i<albums.size();i++) {
            if(!albums.get(i).getArtist().equals(artist))
                aux.add(albums.get(i));
        }
        albums.removeAll(aux);
        
    }
    
    
    public String [] filterAlbumNames(String artist) {
        
        List<AlbumInfo> aux = new ArrayList<>();
        
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
        
        List<SongInfo> aux = new ArrayList<>();
        
        for(int i=0; i<songs.size();i++) {
            if(!songs.get(i).getAlbum().equals(album))
                aux.add(songs.get(i));
        }
        albums.removeAll(aux);
        
    }
    
    
    public String [] filterSongNames(String album) {
        
        List<SongInfo> aux = new ArrayList<>();
        
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

    public SongInfo getSong(String name) {
        for(int i=0; i<songs.size();i++)
            if(songs.get(i).getName().equals(name))
                return songs.get(i);
        return null;
    }

    public boolean isLocal(String name) {
        for(int i=0; i<songs.size(); i++)
            if(songs.get(i).getName().equals(name) && songs.get(i).getIsLocal())
                return true;
        
        return false;    
    }

    public String[] filterRecommendedArtists() {
        List<String> localFilms = new ArrayList<String>();
        
        for(int i=0; i<artists.size(); i++)
            if(artists.get(i).getKind() == KindMedia.RECOMMENDED)
                localFilms.add(artists.get(i).getName());
        
        String [] names = new String [localFilms.size()];
        
        for(int i=0; i<localFilms.size(); i++)
            names[i] = localFilms.get(i);
        
        return names; 
    }

    public String[] filterNewArtists() {
        List<String> localFilms = new ArrayList<String>();
        
        for(int i=0; i<artists.size(); i++)
            if(artists.get(i).getKind() == KindMedia.NEW)
                localFilms.add(artists.get(i).getName());
        
        String [] names = new String [localFilms.size()];
        
        for(int i=0; i<localFilms.size(); i++)
            names[i] = localFilms.get(i);
        
        return names;    
    }
     
}
