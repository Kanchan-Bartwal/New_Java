package Assignment_01;

	import java.util.*;
	public class Ques08 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner obj=new Scanner(System.in);
			System.out.println("Enter the n:");
			int n=obj.nextInt();
			int arr[]=new int[n];
			System.out.println("ENTER THE VALUES OF ARRAY:");
			for(int i=0;i<n;i++)
			{
				arr[i]=obj.nextInt();
			}
			System.out.println("Enter the key:");
			int key=obj.nextInt();
			
			for(int i=key-1;i<n;i++)
			{
				if(i+1!=n)
				{
					arr[i]=arr[i+1];
				}
				else
				{
					arr[i]=0;
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]+" ");
			}
		}

	}

