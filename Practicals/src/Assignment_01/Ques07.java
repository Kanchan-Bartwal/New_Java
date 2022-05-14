package Assignment_01;

public class Ques07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carzi c1=new carzi();
		carzi c2=new carzi();
		carzi c3=new carzi();
		c1.display();
		c2.display();
		c3.display();
		c1.display();
		 System.out.println("The count is:"+c1.count);
	}

}
class carzi
{
	static int  count=0;
	carzi()
	{
		
		count++;
	}
	void display()
	{
		System.out.println("Calling the member function");
		count++;
	}

}
