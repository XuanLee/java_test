package java_Thread_tickets;

public class Tickets implements Runnable{
   private  int ticket = 100;
   Object o = new Object();
public void run() {
	// TODO Auto-generated method stub
	while(true){
	synchronized (o) {
		if(ticket>1){
			System.out.println(Thread.currentThread().getName()+"票为" + --ticket);
		}
		}
	}
	
}
   
   
   
}
