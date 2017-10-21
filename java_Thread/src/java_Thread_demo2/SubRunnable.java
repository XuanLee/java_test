package java_Thread_demo2;

public class SubRunnable implements Runnable{

	public void run() {
		for(int i=0;i<50;i++){
			System.out.println("run :"+i);
		}
	}

}
