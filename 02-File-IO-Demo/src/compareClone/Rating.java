package compareClone;

public class Rating implements Cloneable{
	double rating;
	public Rating() {}
	public Rating(double rating) {
		super();
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "" + rating;
	}
	
	@Override//Rating Class
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	

}
