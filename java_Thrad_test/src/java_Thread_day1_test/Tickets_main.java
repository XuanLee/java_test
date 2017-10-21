package java_Thread_day1_test;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tickets_main {


public static void main(String[] args) {

	//用Runnable实现多线程买票
	Runnable();
	//用线程池实现
	//ExecutorService();
	
}	

public static void ExecutorService(){
	ExecutorService es =Executors.newFixedThreadPool(2);
	es.submit(new TicketsLook());
	es.submit(new TicketsLook());
	es.shutdown();

}



public static void Runnable(){
	TicketsRunnable tickets = new TicketsRunnable();
	Thread  t = new Thread(tickets);
	Thread  t1 = new Thread(tickets);
	Thread  t2 = new Thread(tickets);
	t.start();
	t1.start();
	t2.start();
}
}
