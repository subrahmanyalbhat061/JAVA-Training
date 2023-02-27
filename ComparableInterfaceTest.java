
import java.util.Iterator;
import java.util.TreeSet;


public class ComparableInterfaceTest {
 
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
	       TreeSet<Song> playList = new TreeSet<Song>();
	       
	       Song songObjRef1= new Song("Arjit Sing", "Ashiq 2", "Tum hi ho", 2016);
	       Song songObjRef2= new Song("Yo Yo Honey Sing", "Single Album", "Brown Rang", 2013);
	       Song songObjRef3= new Song("Arjit Sing", "Ye dil he mushkil", "Break Up", 2018);
	       Song songObjRef4= new Song("Diljit Dosanje", "Single Album", "jatt put da", 2019);
	       Song songObjRef5= new Song("Arjit Sing", "Ashiq 2", "Chahuu me ya na", 2016);
	       
	       System.out.println("1st Song added to my playlist");
	       playList.add(songObjRef1);
	       System.out.println("2nd Song added to my playlist");
	       playList.add(songObjRef2);
	       System.out.println("3rd Song added to my playlist");
	       playList.add(songObjRef3);
	       System.out.println("4th Song added to my playlist");
	       playList.add(songObjRef4);
	       System.out.println("5th Song added to my playlist");
	       playList.add(songObjRef5);
	       
	 	  Iterator<Song> iter = playList.iterator();
	 	  while(iter.hasNext()) {
	 		  Song x=iter.next();
	 		  System.out.println(x);
	 	  }
		}

}

class Song implements Comparable<Song>{
	String artist;
	String album;
	String song;
	int year;
	public Song(String artist, String album, String song, int year) {
		super();
		this.artist = artist;
		this.album = album;
		this.song = song;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [artist=" + artist + ", album=" + album + ", song=" + song + ", year=" + year + "]";
	}
	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return song.compareTo(o.song);
	}
	
	
}
