import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	       ArrayList<Song1> playList = new ArrayList<Song1>();
	       
	       Song1 songObjRef1= new Song1("Arjit Sing", "Ashiq 2", "Tum hi ho", 2016);
	       Song1 songObjRef2= new Song1("Yo Yo Honey Sing", "Single Album", "Brown Rang", 2013);
	       Song1 songObjRef3= new Song1("Arjit Sing", "Ye dil he mushkil", "Break Up", 2018);
	       Song1 songObjRef4= new Song1("Diljit Dosanje", "Single Album", "jatt put da", 2019);
	       Song1 songObjRef5= new Song1("Arjit Sing", "Ashiq 2", "Chahuu me ya na", 2016);
	       
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
	       
	       Collections.sort(playList);
	 	  Iterator<Song1> iter = playList.iterator();
	 	  while(iter.hasNext()) {
	 		  Song1 x=iter.next();
	 		  System.out.println(x);
	 	  }
		}

	

}


class Song1 implements Comparable<Song1>{
	String artist;
	String album;
	String song;
	int year;
	public Song1(String artist, String album, String song, int year) {
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
	public int compareTo(Song1 o) {
		// TODO Auto-generated method stub
		return year-o.year;
	}
	
	
}
