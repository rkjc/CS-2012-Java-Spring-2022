package vehicles1;

import java.util.ArrayList;

public class RunSimulationMain {

	public static void main(String[] args) {
		// System.out.println("yep, it's running");

		Land lanVeh1 = new Land("blue", 4);
		Land lanVeh2 = new Land("green", 6);
		Land lanVeh3 = new Land("blue", 4);

//		Vehicle[] vehArr = new Vehicle[3];
//
//		vehArr[0] = lanVeh1;
//		vehArr[1] = lanVeh2;
//		vehArr[2] = lanVeh3;

		Vehicle vek1 = new Land("red", 8);

		//vehArr[3] = vek1;
		
		ArrayList<Vehicle> vehArr2 = new ArrayList();
		vehArr2.add(lanVeh1);
		
		for (int i = 0; i < 1; i++) {
			System.out.println( vehArr2.get(i) );
		}
		

		
//		System.out.println(lanVeh1.color + " " + lanVeh1.numWheels);
//		System.out.println(lanVeh2.color + " " + lanVeh2.numWheels);
//		System.out.println(lanVeh1.equals(lanVeh3));

	}

}
