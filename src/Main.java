import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Album>albums=new ArrayList<>();
    public static void main(String[] args) {

        Album album1=new Album("Moosa","Siddhu Moosewala");

        album1.addSongtoAlbum("295",4.5);
        album1.addSongtoAlbum("LastRide",5.5);
        album1.addSongtoAlbum("So high",3.05);

        Album album2=new Album("Sad world","Arijit Singh");

        album2.addSongtoAlbum("kesariya",4.5);
        album2.addSongtoAlbum("jeena jeena",5.5);
        album2.addSongtoAlbum("Gerua",6);

        albums.add(album1);
        albums.add(album2);


        System.out.println(album1.findSong("295"));
        System.out.println(album2.findSong("295"));

        LinkedList<Song>myPlayList=new LinkedList<>();
        album1.addToPlayListFromAlbum("295",myPlayList);
        album2.addToPlayListFromAlbum(2,myPlayList);
    }
}