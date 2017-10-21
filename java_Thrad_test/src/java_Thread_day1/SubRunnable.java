package java_Thread_day1;

public class SubRunnable implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<20;i++){
			System.out.println("run"+i);
		}
	}

}
