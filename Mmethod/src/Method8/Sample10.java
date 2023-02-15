package Method8;

public class Sample10

{

	public static void main(String[] args) 
	{
		studentname("Vishal");
		
		studentfullname("Vibha","Kulkarni");
		
		Sample11.studentinfo("Priya",22,'A',67.5f);
		
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


