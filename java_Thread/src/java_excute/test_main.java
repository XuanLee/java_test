package java_excute;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test_main {
public static void main(String[] args) throws InterruptedException, ExecutionException {

	ExecutorService es =Executors.newFixedThreadPool(2);
	
	es.submit(new Runnable() {
		
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("PGOne");
		}
	});
	
	Future submit = es.submit(new Callable<Integer>() {
		private int n;
		public void setN(int n){
			this.n=n;
		}
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			int sum=0;
			for(int i=0;i<=n;i++){
				sum+=i;
			}
			return sum;
		}
		
	});
	System.out.println(submit.get());
}
}
 