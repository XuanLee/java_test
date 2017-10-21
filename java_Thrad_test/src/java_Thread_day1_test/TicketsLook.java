package java_Thread_day1_test;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketsLook implements Callable{
	private int tickets = 100;
	Object o =new Object();
//	private Lock k = new ReentrantLock();
	


	public Object call() throws Exception {
//		k.lock();
		synchronized (o) {
			func();
		}
//		k.unlock();
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	public  void func(){
		while(true){
			if(tickets>1){
				System.out.println(Thread.currentThread().getName()+"还剩"+--tickets);
			}
		}
	}


	
	
	
}
