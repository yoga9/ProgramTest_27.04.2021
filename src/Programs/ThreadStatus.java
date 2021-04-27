package Programs;

public class ThreadStatus extends Thread {

	public static void main(String[] args) {
		
		ThreadStatus thread1 = new ThreadStatus();
		ThreadStatus thread2 = new ThreadStatus();
	
		thread1.start();
		thread1.setName("Thread1 Started");
		thread1.setPriority(NORM_PRIORITY);
		thread2.start();
		thread2.setName("Thread2 Started");
		thread2.setPriority(MAX_PRIORITY);
		
		System.out.println("Thread is Started");
	
	
	}
	

	public void run() {
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " " + Thread.currentThread().getPriority());
			System.out.println("Thread is running");
		}

}
}
