package Unit_01;

public class P3_Task01_VariablesAndDataTypeInJava {
	static int q=11;
	int p=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		float pi;
		double d;
		char e;
		
		pi=3.14f;
		d=20.22d;
		e='v';
		
		a=10;
		b=10;
		c=10;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(e);
		
		int myNum=5;
		float myFloatNum=5.99f;
		char myLetter = 'D';
		boolean myBool= true;
		String myText="Hello";
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		
		double f;
		int i=10;
		f=i;
		
		double g=10;
		int j;
		j=(int) g;
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		byte k=10;
		boolean l= true;
		long m=10L;
		float n=1.2f;
		double o=1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
		System.out.println(ABC.j);
		
		ABC obj1=new ABC();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ABC obj2=new ABC();
		System.out.println(obj2.i);
		
		System.out.println(ABC.j++);
		System.out.println(ABC.j);
		
		ABC.typeCoversionAndTypeCasting();
		
		
		
	}
    
	int r=10;
	
	void display() {
		 int a=5;
		 System.out.println("This is Display Method");
		 System.out.println(a);
	}
}

class ABC {
	static int j=10;
    int i=10;
    
    static void display() {
    	
    	int a=5;
    	System.out.println("This is Display Method");
    	System.out.println(a);
    }
    
    static void typeCoversionAndTypeCasting() {
    	
    	double f;
    	int i=10;
    	f=i;
    	System.out.println(f);
    	
    	double g=10.0;
    	int j;
    	j=(int)g;
    	
    	System.out.println(i);
    	System.out.println(j);
    }
}