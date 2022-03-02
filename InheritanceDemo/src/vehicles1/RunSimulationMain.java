package vehicles1;

public class RunSimulationMain {

	public static void main(String[] args) {
		//System.out.println("yep, it's running");

		//Land vehic1 = new Land();
		
		//System.out.println(vehic1.getCount());
		
		Vehicle vehc1 = new Land("blue");
		Vehicle vehc3 = new Air("green");
		
		
		
		System.out.println(vehc1.equals(vehc1));
		System.out.println(vehc1.equals(vehc3));
		
		
	}

}
