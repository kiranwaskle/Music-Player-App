//importing the necessary classes

import java.util.ArrayList;
import java.util.LinkedList;

//creating the album class
public class Album {
    //all the data members are private of the album class
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    //initialize the data members of the album class with the help of the constructor 
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //find the song in the list
    public Song findSong(String title){
       //song is present in the list
        for(Song checkedSong : songs){
            if(checkedSong.getTitle().equals(title)) return checkedSong;
        }
        //song is not present in the list
        return null;
    }

    //add the song in the list
    //first we have to check the condition that particular song is already not exist in the list
    public boolean addSong(String title, double duration){
        if(findSong(title) == null){
            songs.add(new Song(title,duration));
//            System.out.println(title + "successfully added to the list");
            return true;
        }
        else {
//            System.out.println("Song with name "+ title+ " already exist in the list");
            return false;
        }
    }

    //add the song in playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        //index number start from the zero
        //tracknumber start from the one
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
//        System.out.println("this album does not have song with trackNumber "+trackNumber);
        return false;
    }

    //add the song with the title parameters
    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song checkedSong : this.songs){
            if (checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
//        System.out.println(title + "there is no such song in album");
        return false;
    }
}
