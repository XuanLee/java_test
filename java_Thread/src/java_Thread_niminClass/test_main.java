package java_Thread_niminClass;

public class test_main {
public static void main(String[] args) {
	
	//用继承方法实现
	new Thread(){
		public void run() {
			System.out.println("Thread"+"11");
		};
	}.start();
	
	
	Runnable r=new Runnable() {
		
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable"+2222);
		}
	};
	 new Thread(r).start();
	 
	 
	 //
	 new Thread(new Runnable() {
		
		public void run() {
			System.out.println("run Runnable"+33333);
		}
	}).start();
	 
}
}
