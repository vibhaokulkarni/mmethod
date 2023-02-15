package Method3;

public class Sample7

{
public static void main(String[] args) 
{
m1();

Sample8.m2();

Sample7 Adi=new
Sample7();
Adi.m3();

Sample8 Adu=new
Sample8();
Adu.m4();

}

public static void m1()
{
System.out.println("Running static regular method m1 from same class");	
}


public void m3()
{
System.out.println("Running non static regular method m3 from same class");	
}






}
