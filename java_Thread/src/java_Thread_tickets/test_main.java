package java_Thread_tickets;

public class test_main {
public static void main(String[] args) {
		//CopyOfTickets tickets =new CopyOfTickets();
		//Tickets tickets =new Tickets();
		test tickets =new test();
		Thread t = new Thread(tickets);
		Thread t1 = new Thread(tickets);
		Thread t2 = new Thread(tickets);
		Thread t3= new Thread(tickets);

		t.start();
		System.out.println("t");
		t1.start();
		System.out.println("t2");
		t2.start();
		System.out.println("t3");
		t3.start();
		System.out.println("t4");

}
}
