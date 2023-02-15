package Method10;

public class Sample7 
{
public static void main(String[] args)

{
	m1(); static method same class
	
	Sample8.m2(); static diff class
	
	Sample7 Adi=new
			Sample7();   non static same class
	Adi.m3();
	
	
	Sample8 Sak=new  non static 
	Sample8();
	Sak.m4();
	
	
}

public static void m1()

{System.out.println("running static regular method from same class");}

public void m3()

{System.out.println("running non static regular method from same class");}


}
