package Assignment_01;
	import java.util.*;
	public class Ques10 {

		public static void main(String[] args) {
			
			String city;
			int maruti;
			int zen;
			int wagnor;
			int sx;
			city c[]=new city[4];
			Scanner s1= new Scanner(System.in);
			
			for(int i=0;i<4;i++)
			{
				city=s1.nextLine();
				maruti=s1.nextInt();
				zen=s1.nextInt();
				wagnor=s1.nextInt();
				sx=s1.nextInt();
				s1.nextLine();
				c[i]=new city(city,maruti,zen,wagnor,sx);
			}
			int t1=c[0].maruti+c[1].maruti+c[2].maruti+c[3].maruti;
			int t2=c[0].zen+c[1].zen+c[2].zen+c[3].zen;
			int t3=c[0].wagnor+c[1].wagnor+c[2].wagnor+c[3].wagnor;
			int t4=c[0].sx+c[1].sx+c[2].sx+c[3].sx;
	     System.out.println("Total Maruti:"+t1);
	     System.out.println("Total Zen:"+t2);
	     System.out.println("Total Wagnor:"+t3);
	     System.out.println("Total Sx:"+t4);
		}

	}
	class city
	{
		String city;
		int maruti;
		int zen;
		int wagnor;
		int sx;
		
		city(String s,int a , int b,int c,int d)
		{
			city=s;
			maruti=a;
			zen=b;
			wagnor=c;
			sx=d;
		}
		
	}
