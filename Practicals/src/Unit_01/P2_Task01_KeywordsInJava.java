package unit1;
/*keywords can't be used as functions
 * keywords can't be used as objects
 * keywords can't be used as variable name
 * keywords can't be used as class
 * never make function inside the function
 */

public class P2_Task01_KeywordsInJava {

	public static void main(String [] args) {
		final int a =5;
		//int new();
		
		System.out.println(a);
		
		//int double = 10;
		
		//new is a keyword so can't be used as function name
		/*int new() {
		 
		 //sysout[ctrl + space]
		System.out.println		 
		 }*/
	int b = 20;
	b=25;
	
	//class name[given below]
	//ABC int = new ABC();
	ABC obj = new ABC();
	//System.out.print(ob);
	func();
}
	
	static int func() {
		return 2;
	}
		/*class new{
		 void display() {
		 
		 }
		 }*/
}
class ABC{
	void display() {
		}
	}