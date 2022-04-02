package Unit_01;

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		
		Operators obj=new Operators();
		
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperartor();
		obj.RealationalOperator();
		obj.BitwiseAndLogicalOperator();
		obj.TernaryOperator();
		obj.AssingmentOperator();
	}

}
class Operators
{
	void UnaryOperator()
	{
		int a=10;
		boolean b=false;
		System.out.println("Inside Unary operator");
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(~a);
		System.out.println(!b);
		System.out.println("\n");
		
	}
	
	void ArithmeticOperator()
	{
		System.out.println("Inside Arithmetic Operator");
		int a=10;
		int b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(10*10/5 + 3 - 1*4 /2);
		System.out.println("\n");
	}
	
	void ShiftOperartor()
	{
		System.out.println("Inside shift Operator");
		
		System.out.println(10<<2);
		System.out.println(10<<3);
		System.out.println(20<<2);
		System.out.println(15<<4);
		
		System.out.println(10>>2);
		System.out.println(20>>2);
		System.out.println(20>>3);
		System.out.println(40>>2);
		
		System.out.println("\n");
		
	}
	
	void RealationalOperator()
	{
		System.out.println("Inside Realational Operator");
		
		int a=10;
		int b=20;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println("\n");
	}
	
	void BitwiseAndLogicalOperator()
	 {
		System.out.println("Insode BitwiseAndLogical Operator");
		
		int a=10;
		int b=5;
		int c=20;
		
		System.out.println(a>b && a++<c);
		System.out.println(a);
		
		System.out.println(a>b & a++<c);
		System.out.println(a);
		
		System.out.println(a>b || a<c);
		System.out.println(a);
		
		System.out.println(a>b | a<c);
		System.out.println(a);
		
		System.out.println(a>b || a++<c);
		System.out.println(a);
		
		System.out.println(a>b | a++<c);
		System.out.println(a);
		
		System.out.println("Bitwise inclusive OR:"+(12|12));
		System.out.println("Bitwise exclusive OR:"+(12^12));
		
		System.out.println("\n");
	 }
	
	void TernaryOperator()
	{
        System.out.println("Inside Ternary Operator");
        
        int a=2;
        int b=5;
        int min=(a>b)? a:b;
        System.out.println(min);
        
        System.out.println("\n");
	}
	
	void AssingmentOperator()
	{
		 System.out.println("Inside Assingment Operator");
		 
		 int a=10;
		 int b=20;
		 a+=4;
		 b-=4;
		 System.out.println(a);
		 System.out.println(b);
	}
}