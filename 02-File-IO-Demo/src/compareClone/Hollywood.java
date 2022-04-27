package compareClone;

import java.util.ArrayList;
import java.util.Collections;

public class Hollywood{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ArrayList<Movie> movies = FileManager.readMovie("imdb_top_100.csv");
		for (int i = 0; i < 10; i++) {
			System.out.println(movies.get(i).toString());
		}
		System.out.println("-----------------------");
		Collections.sort(movies);
		for (int i = 0; i < 10; i++) {
			System.out.println(movies.get(i).toString());
		}
		System.out.println("-----------------------");
		
		Movie a = movies.get(0);
		Movie b =(Movie)a.ShallowClone();
		b.setName("Batman");
		b.getRating().setRating(24);
		System.out.println(a.toString());
		System.out.println(b.toString());
		Movie c = (Movie)a.clone();
		c.setName("dd");
		c.getRating().setRating(5.4);
		System.out.println(a.toString());
		System.out.println(c.toString());
		
	}

}
