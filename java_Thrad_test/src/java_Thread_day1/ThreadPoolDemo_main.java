package java_Thread_day1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo_main {
public static void main(String[] args) {
	ExecutorService es = Executors.newFixedThreadPool(3);
	es.submit(new ThreadPoolRunnableDemo());
	es.submit(new ThreadPoolRunnableDemo());
	es.submit(new ThreadPoolRunnableDemo());
	es.submit(new ThreadPoolRunnableDemo());
	es.submit(new ThreadPoolRunnableDemo());

	//	关闭线程池
	es.shutdown();
	
}
}
