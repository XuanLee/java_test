package java_Thread_day1;

public class mainThread_dmo{
	public static void main(String[] args) throws InterruptedException {
	 subThread sub = new subThread();
	 sub.start();
	 for(int i=0;i<55;i++){
		// Thread.sleep(1000);

		 System.out.println(Thread.currentThread().getName()+":"+i);
	 }
		
	}
	
}
