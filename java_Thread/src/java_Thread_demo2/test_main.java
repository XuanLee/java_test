package java_Thread_demo2;

public class test_main {
public static void main(String[] args) {
	Runnable sr =new SubRunnable();
	Thread t= new Thread(sr);
	t.start();
	for(int i=0;i<50;i++){
		System.out.println("main..."+i);
	}
	
		new Thread(){
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(11);
			}
		}.start();
}
}
