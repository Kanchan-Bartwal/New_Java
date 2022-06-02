package Unit_03;

public class P16_MultiThreading_WaitAndNotify {

	public static void main(String[] args) {
		SharedResources obj = new SharedResources();
		
		new Thread()
		{
			public void run()
			{
				obj.withdraw(150000);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				obj.deposite(1);
			}
		}.start();
	}

}

class SharedResources {
	int amt = 100000;
	
	synchronized void withdraw(int amt){
		System.out.println("Going to withdraw!!");
		
		if(this.amt<amt)
		{
			System.out.println("Less balance ; Waiting for Deposite!!!!!!!");
			try {
				wait();
			} catch (InterruptedException e) {
			}
			
		}
		this.amt-=amt;
		System.out.println("Withdraw completed!");
	}
	synchronized void deposite(int amt)
	{
		System.out.println("Going to deposite!!!");
		this.amt+=amt;
		
		System.out.println("Deposite completed...!");
		notify();  //OR  //notifyAll();
		
	}
}