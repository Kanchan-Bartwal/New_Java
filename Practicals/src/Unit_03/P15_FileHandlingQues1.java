package Unit_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P15_FileHandlingQues1 {

	public static void main(String[] args) {
		A obj = new A();
		try {
			obj.CountWord();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class A
{
	int ctr=0;
	void CountWord()  throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\git\\New_Java\\Practicals\\src\\Unit_03\\Input.txt"));
		
//		String s = br.readLine();
		int str=0;
		
		while((str=br.read())!=-1)
		{
			if(str==32|| (char)str=='\n')
				ctr++;
		}
		
		System.out.println("Total number of words are: " +ctr);
		
		br.close();
	}
}