package Method3;

public class Sample12

{

	public static void main(String[] args) 
	{
		studentname("Vishal");
		
		studentfullname("Vibha","Kulkarni");
		
		Sample13.studentinfo("Priya",22,'A',67.5f);
		
	}

	public static void studentname(String s1)
	{
		System.out.println(s1);
	}
	
	public static void studentfullname(String FN,String LN)
	{
		System.out.println(FN+ " "+LN);
	}
	
	
}


