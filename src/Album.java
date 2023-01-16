import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs =new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public  boolean findSong(String title){
        for(Song s:songs){
            if(s.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    void addSongtoAlbum(String name,double duration){
        Song s=new Song(name,duration);

        if(findSong(s.getTitle())==true) System.out.println("Song already Present  in album");
        else{
            songs.add(s);
            System.out.println("Song added to album");
        }
        return;
    }

    public void addToPlayListFromAlbum(String title , LinkedList<Song>playList){
        if(findSong(title)==true){
            for(Song song:songs){
                if(song.getTitle().equals(title)){
                    playList.add(song);
                    System.out.println("Song has been added");
                    break;
                }
            }
        }
        else{
            System.out.println("Song already Present");
        }
        return;
    }
    public void addToPlayListFromAlbum(int trackNo , LinkedList<Song>playList){

        int idx=trackNo-1;
        if(idx>=0&&idx<songs.size()){
            playList.add(songs.get(idx));
            System.out.println("Song added to playList");
        }
        else{
            System.out.println("Invalid track Number");
        }

        return;
    }
}
