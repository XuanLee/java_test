package java_Thread_tickets;

public class test implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			
			for(int i=0;i<10;i++){
				
				System.out.println(Thread.currentThread().getName()+"  "+i);
				
			}
		}
		
	}
}
