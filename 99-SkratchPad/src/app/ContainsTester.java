package app;

import java.util.ArrayList;

public class ContainsTester {

	public static void main(String[] args) {
		ArrayList<String> arrStr = new ArrayList<String>();
		
		arrStr.add("red");
		arrStr.add("blue");
		arrStr.add("orange");
		
		System.out.println(arrStr);
		System.out.println(arrStr.get(0));
		System.out.println(arrStr.contains("blue"));

	}

}
