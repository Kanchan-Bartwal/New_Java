package Assignment_01;

	import unit2.*;
	public class Ques09 {
	     
	    public String name="KHUSHI";
	    int age=20;
	    protected String section="E";
	    private int salary=20000;
		public static void main(String[] args) {
			
	       A obj=new A();
	       //we can access default class within package;
	       System.out.println(obj.c);
	       System.out.println(obj.d);
	       //System.out.println(obj.a);//we can not access a private member outside the class
	       System.out.println(obj.b);
	       // accesing another package public variable only 
	       Sample s=  new Sample();
	       System.out.println("The age  imported from the class Sample:"+s.a);
	       
		}

	}
	class A
	{

		private int a=10;
		protected int b=55;
		public int c=100;
		int d=124;
		
	}

