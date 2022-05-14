package Assignment_01;


	import java.util.*;
	public class Ques06 {

		public static void main(String[] args)
		{
			
			Marks obj=new Marks();
			Scanner s= new Scanner(System.in);
			System.out.println("Enter a:");
			int a=s.nextInt();
			System.out.println("Enter b:");
			int b=s.nextInt();
			
			int c=(a>b)?obj.sum(a, b):obj.sub(a, b);
			System.out.println("The result is:"+c);
			
		}

	}
	class Marks
	{
		int sum(int a, int b)
		{
			return a+b;
		}
		
		int sub(int a, int b)
		{
			return b-a;
		}
	}
