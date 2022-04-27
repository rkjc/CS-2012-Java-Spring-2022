package compareClone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

	public static ArrayList<Movie> readMovie(String file) {
		ArrayList<Movie> movie = new ArrayList<Movie>();
		try {
			File a = new File(file);
			Scanner sc = new Scanner(a);
			sc.nextLine(); // clears first line
			while (sc.hasNextLine()) {
				String[] lineArr = sc.nextLine().split(",");
				String title = lineArr[0];
				int year = Integer.valueOf(lineArr[1]);
				int runtime = Integer.valueOf(lineArr[2].split(" ")[0]);
				double rating = Double.valueOf(lineArr[3]);
				movie.add(new Movie(title, year, runtime, new Rating(rating)));
			}

			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

		return movie;
	}
}
