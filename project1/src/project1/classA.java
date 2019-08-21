package project1;

public class classA {

		void method()
		{
			System.out.println("good morning");
		}
		void method1(int a,int b)
		{
		System.out.println("a+b");
		}
	boolean method2()
		{
			return false;
		}
	int method3(int a,int b)
	{
		int c=a+b;
		return c;
	}
		
	public static void main(String[] args)
	{
		classA x=new classA();
		x.method();
		x.method1(12,13);
		boolean res=x.method2();
		System.out.println("res");
		int res1=x.method3(123,125);
		System.out.println("res1");
	
		// TODO Auto-generated method stub

	}

}
