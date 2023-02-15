package Method1;

public class Sample7 
{ 
	// Method without parameter or zero parameter
	
	public static void main(String[] args) {
		
	// Static method call from same class
		
		m1();                   //method name
		
	// Static method call from different class
		
		Sample8.m2();          // different class name. method name
		
		
	// non static regular method call from same class
		
		Sample7 Saket= new						// create object of same class
		Sample7();
		Saket.m3();								// method call- objectname.methodname()
		
	
	// non static regular method from different class
		
		Sample8 onkar = new						// create object of different class
		Sample8();
		onkar.m4();								// method call- differentclass objectname.method name()
		
		}
	
	public static void m1() 
	{
	System.out.println("running static regulae method from same class");	
	}
	
	public void m3() 
	{
	System.out.println("running non static regulae method from same class");	
	}
	

}
