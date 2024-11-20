//creating the song class

public class Song {
    //private data members of the song class
    private String title;
    private double duration;

    //creating constructor  initialize the data members
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
   //getting the title and duration with the help of the getter functionality
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    //everything get into the string form
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
