package Unit_03;

/*
 * Multiprocessing :-
 *                 - parallel processing.
 *                 -Sequential processing.
 *                 -concurrent processing.
 *                 
 * Multitasking :-
 *             -Parallel multitasking.
 *             -Sequential multitasking.
 *             -Concurrent multitasking.
 *                 
 * Program counter :- holds the address of the next instruction to be executed 
 *                 by 1 processing unit.
 *                 
 *                 
 * MultiThreading Task :- 
 *                 -It is users job to find out the independent task of that process.
 *                 -Your findings are T1,T2,T3,T4 Task of process T1 out of 8 total task.
 *                 -Context switching between these task and the worst time 
 *                  is not decided by the user instead JVM will decide this.
 *                 -MultiThreading is applied when concurrent multitasking occurs.
 *                 -It is users job to put these independent codes into their 
 *                  respective threads.
 *                 -User have to start these threads by T1.start,T2.start,T3.start,T4.start.
 *     
 *                 
 */
public class P16_MultiThreadingInJava {

	public static void main(String[] args) {
	/* MultiThreading obj=new MultiThreading();
	obj.threadConcept();
	obj.threadSynchronization();
	obj.interThreadCommunication();
	obj.ProducerConsumerProblems();
	obj.Wait_And_Notify();
	*/
		
	//	c1 obj1=new c1();
    //	c2 obj2=new c2();
	//	obj1.display();
	//	obj2.display();

		Thread obj3=new Thread(new T1(),"T1");
		Thread obj4=new Thread(new T2(),"T2");
		obj3.start();
		obj4.start();
		
		Thread obj5=new Thread(new T3(),"T3");
		Thread obj6=new Thread(new T4(),"T4");
		obj5.start();
		obj6.start();
	}

}
class MultiThreading
{
	void threadConcept()
	{
		
	}
	void threadSynchronization()
	{
		
	}
	void interThreadCommunication()
	{
		
	}
	void ProducerConsumerProblems()
	{
		
	}
	void Wait_And_Notify()
	{
		
	} 
	}

  class c1{
	 
	 void display()
	 {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Gulambi C1 ");
		 }
	 }
 }
 
 class c2{
	 
	 void display() {
		 
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Kamli  C2");
		 }
	 }
 }
 
 
 /* "Implements"  and "extends" works almost same but we prefer "implements" as using 
  * "extend" is costly or we can say extending is costlier than implementing.
  * 
  * "Runnable" and "Thread" are predefined class.
  * 
  */
 class T1 implements Runnable {
	 
	 public void run() {
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Hi T1");
		 }
		 
	 }
 }
	
class T2 implements Runnable {
	 
	 public void run() {
		 
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("HELLO T2");
		 }
		 
	 }
 }
class T3 implements Runnable {
	 
	 public void run() {
		 try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 System.out.println("Heyaaaa T3");
		 
		 
	 }
}
class T4 extends Thread {
	 
	 public void run() {
		 
		 for(int i=0;i<10;i++)
		 {
			 System.out.println("Hiii T4");
		 }
		
			
		 
	 }
}