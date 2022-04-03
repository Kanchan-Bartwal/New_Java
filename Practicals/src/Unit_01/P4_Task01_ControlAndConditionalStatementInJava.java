package unit1;
/*
 # Control Statements and Conditional Statements:
 - Java provides three types of control flow statements.
 - Decesions making statements
   - if statements
   - switch statement
   
 - Loop ststements
   - do while loop
   - while loop
   - for loop
   - for-each loop
 - Jump statements 
   - break statement
   - continue statement    
 */

public class P4_Task01_ControlAndConditionalStatementInJava {
	
	public static void main(String[] args)  {
		
		Statements obj = new Statements();
		
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}
}

class Statements {
	
	void DecisionMakingStatements() {
		
		int x = 10;
		int y = 12;
		if (x + y < 10) {
			System.out.println("x + y is less  than 10");
		} else {
			System.out.println("x + y is greater than 20");
		}
		int num = 2;
		
		//can we use char instead of int as num??
		
		switch (num) { // switch (expression)
		case 0: // case value1:
		      System.out.println("number is 0");
		      break;
		case 1: 
			  System.out.println("number is 1");
			  break;
	    default:
	    	  System.out.println(num);
		}
	}
	
	void LoopStatements() {
		
		/*
		 * for(intialization, condition, increment/decrement) { //block of statements }
		 * for (data_type var : array_name/collection_name){ //statements }
		 */
		
		//for loop
		int sum = 0;
		for(int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural number is" + sum);
		
		//for each
		String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
		System.out.println("Printing the content of the array names:\n");
		for (String name : names) {
			System.out.println(name);
		}
		/*
		 * while(condition){ //looping statements }
		 */
		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while (i <= 10) {
			System.out.println(i);
			i = i+2;
		}
		
		/*
		 * do-while do { //statements } while (conditions);
		 */
		i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i = i + 2;
		} while ( i <= 10);
	}
	void JumpStatements() {
		// Break
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if( i == 6) {
				break;
			}
			System.out.println(i);
		}
		
		//continue
		for ( int i = 0; i<= 10; i++) {
			
			if(i == 6) {
				continue;
			}
			System.out.println(i);
		}	
		
	}
	
}