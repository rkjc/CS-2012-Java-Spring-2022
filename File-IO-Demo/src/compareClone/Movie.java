package compareClone;

public class Movie implements Comparable<Movie>,Cloneable{
	String name;
	int year;
	int runtime;
	Rating rating;
	public Movie() {}
	
	public Movie(String name, int year, int runtime, Rating rating) {
		this.name = name;
		this.year = year;
		this.runtime = runtime;
		this.rating = rating;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getRuntime() {
		return runtime;
	}


	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}


	public Rating getRating() {
		return rating;
	}


	public void setRating(Rating rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", year=" + year + ", runtime=" + runtime + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movie o) {
		if(o.getRuntime()==this.runtime) {
			return 0;
		}else if(o.getRuntime()>this.runtime) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public Object ShallowClone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Movie a = (Movie)super.clone();
	    a.setRating((Rating)a.getRating().clone());
	    return a;
		}  
}
