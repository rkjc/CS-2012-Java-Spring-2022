package demo2;

import java.util.ArrayList;
import java.util.Random;

public class OutOfMemExcept {

	public static void main(String[] args) {

		ArrayList<Double> arrr = new ArrayList<Double>();

		Random rndy = new Random();

		arrr.add(rndy.nextDouble());

		try {

			while (true) {
				arrr.add(rndy.nextDouble());
			}
			
		} catch (Error e) {
			System.out.println("wow what an error");
			System.out.println(e);
			
		}

	}

}
