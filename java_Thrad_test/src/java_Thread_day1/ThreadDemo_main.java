package java_Thread_day1;

public class ThreadDemo_main {
public static void main(String[] args) {
	subThread s =new subThread();
	s.start();
	System.out.println("线程对象 "+ s.currentThread().getName());
	fun();
}
static void fun(){
	for(int i = 0; i<40; i++){
		System.out.println("fun"+i);
	}
}
}
