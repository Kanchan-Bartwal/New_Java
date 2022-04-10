package Unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		// Write Logic Here!
		for(int i=0;i<s.length(); i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				System.out.println("Not, it's not a palindrome");
				return;
			}	
		}
		System.out.println("Yes, it is a palindrome");
	}

	void reverseOfAString(String s) {
		// Write Logic Here!
		String temp="";
		
		for(int i=0;i<s.length(); i++)
		{
			temp=s.charAt(i)+temp;
		}
		
		System.out.println("The reverse of "+s+" is "+temp);
	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Yes they are equal");
		else
			System.out.println("No, they are not equal");
		
	}
}