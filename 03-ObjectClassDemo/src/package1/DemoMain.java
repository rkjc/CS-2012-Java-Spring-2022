package package1;


public class DemoMain {

	public static void main(String[] args) {
		//System.out.println("starting");
		
		int numb1 = 34;
		Circle circ1 = new Circle(56.7, "red");	
		
		int numb2 = 1001;
		Circle circ2 = new Circle(99999.3, "orange");
		
		
		
		System.out.println("num1= " + numb1);
		System.out.println( circ1.getRadius() );	
		System.out.println( circ1.color );
		System.out.println(   circ1.toString()   );
		System.out.println("--------");
		
		System.out.println("num2= " + numb2);
		System.out.println(circ2.getRadius());
		System.out.println(circ2.color);
		System.out.println(circ2.toString());
		
		System.out.println("===========================================");
		System.out.println("--- circ2 = circ1; ---- numb2 = numb1; ----");	
		circ2 = circ1;
		numb2 = numb1;
		
		System.out.println("num1= " + numb1);
		System.out.println(circ1.getRadius());
		System.out.println(circ1.color);
		System.out.println(circ1.toString());
		System.out.println("--------");
		
		System.out.println("num2= " + numb2);
		System.out.println(circ2.getRadius());
		System.out.println(circ2.color);
		System.out.println(circ2.toString());
		
		System.out.println("===========================================");
		System.out.println("-------  numb1 = 99999;  ------------------");
		numb1 = 99999;
		
		System.out.println("num1= " + numb1);
		System.out.println(circ1.getRadius());
		System.out.println(circ1.color);
		System.out.println(circ1.toString());
		System.out.println("--------");
		
		System.out.println("num2= " + numb2);
		System.out.println(circ2.getRadius());
		System.out.println(circ2.color);
		System.out.println(circ2.toString());
		
		System.out.println("===========================================");
		System.out.println("-------  circ1.setRadius(10000.0);  -------");
		circ1.setRadius(10000.0);
		
		System.out.println("num1= " + numb1);
		System.out.println(circ1.getRadius());
		System.out.println(circ1.color);
		System.out.println(circ1.toString());
		System.out.println("--------");
		
		System.out.println("num2= " + numb2);
		System.out.println(circ2.getRadius());
		System.out.println(circ2.color);
		System.out.println(circ2.toString());
		System.out.println("====================");
		
	}

}
