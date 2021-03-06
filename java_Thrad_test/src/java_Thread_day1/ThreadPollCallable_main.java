package java_Thread_day1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadPollCallable_main {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService es =Executors.newFixedThreadPool(2);
	Future f= es.submit(new ThreadPoolCallableDemo(13,12));
	System.out.println(f.get());
	f= es.submit(new ThreadPoolCallableDemo(22,22));
	System.out.println(f.get());
	es.shutdown();
}
}
