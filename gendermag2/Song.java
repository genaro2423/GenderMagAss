package gendermag2;



	 public class Song implements Comparable<Song> {
	   	 
		    private String name;
		    private int year;
		 
		    public Song(String n, int y) {
		        name = n;
		        year = y;
		    }
		 
		    public int compareTo(Song m) {
		        return this.year - m.year;
		    }
		 
		    public String toString() {
		        return name + " " + year;
		    }

			public boolean[] compareTo(Song[] heap) {
				// TODO Auto-generated method stub
				return null;
			}
		}
	 
	

