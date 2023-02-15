package Method2;

public class Sample12 
 




{
	public static void main(String[] args) 
	{
		studentName("vishal");
		studentName("rahul");
		
		System.out.println("-----------");
		
		studentFullName("abc1", "xyz1");
		studentFullName("abc2", "xyz2");
		
		System.out.println("---------------------------------");
		
		Sample12.studentInfo("Rahul", 101, 'A', 65.5f);
		Sample12.studentInfo("Ganesh", 102, 'B', 66.1f);
		
			
	}
	
	//method with String parameter
	public static void studentName(String s1)
	{
		System.out.println(s1);
	}
	
	//method with 2 String parameter
	public static void studentFullName(String FN,String LN)
	{
		System.out.println(FN+" " + LN);
	}

}
