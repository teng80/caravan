package Chapter04;

public class Song {
	public String title;
	public String artist;
	public String country;
	public int year;
	
	public Song() {
	}
	
	public Song(int year, String country, String artist, String title) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	public void show( ) {
		System.out.print(year+"년 ");
		System.out.print(country+"국적의 ");
		System.out.print(artist+"가 부른 ");
		System.out.print(title);
	}
	public static void main(String[] args) {
		Song myFavorite = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		myFavorite.show();
	}
}
