package Method9;

public class Sample4 
{
public static void main(String[] args) 

{ // Non static regular method call from same class
	
	Sample4 Priya=new                          // classname objectname= new
	Sample4();                              // object creation syntax ie create object of same class
	Priya.m5();								// method call objectname.methodname()
	Priya.m6();
	Priya.m6();
	
	// Sample4 - class name - data type
	// Priya - objectname- to identify or refer object
	// new - keyword - to create blank or empty object
	// Sample4() - classname - constructor call - to copy all the members of class into object
	
	
}
public void m5()
{
System.out.println("Running non static m5 from same class");	
}
public void m6()
{
System.out.println("Running non static m6 from same class");	
}


}
