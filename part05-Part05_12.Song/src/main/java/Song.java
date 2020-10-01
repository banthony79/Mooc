
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compare) {
        if (this == compare) {
            return true; 
        }
        
        if (!(compare instanceof Song)){
        return false; 
    }
        Song song = (Song) compare; 
        
        if (this.name.equals(song.getName()) && 
                (this.artist.equals(song.getArtist())
                && (this.durationInSeconds == song.getDuration()))) {
            return true;
        }
    return false; }
    
    
    
    public String getName() {
        return this.name; 
    }
    
    public String getArtist() {
       return this.artist;  
    }
    
    public int getDuration() {
        return this.durationInSeconds; 
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
