package java_Thread_tickets;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CopyOfTickets implements Runnable{
   private  int ticket = 100;
   Object o = new Object();
   Lock lock = new ReentrantLock();
public void run() {
	// TODO Auto-generated method stub
	while(true){
	synchronized (o) {
		
		lock.lock();
		fun1();
		lock.unlock();
		
		}
	}	
}
   
   public void  fun1(){
	   
	   if(ticket>1){
		   System.out.println("票为" + --ticket);
	   }
   }
   
}
