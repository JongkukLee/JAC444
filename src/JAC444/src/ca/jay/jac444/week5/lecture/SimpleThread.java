package ca.jay.jac444.week5.lecture;

public class SimpleThread extends Thread {  
	public SimpleThread(String str) {
		super(str);
	}
	public void run() {
		for (int i = 0; i < 10; i++) {  
			System.out.println(i + " " + getName());  
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (InterruptedException e) {}
		}
		System.out.println("DONE! " + getName());
	}
	public static void main (String[] args) {
		SimpleThread t1 = new SimpleThread("First >>>>>>>>>");  
		SimpleThread t2 = new SimpleThread("Second <<<<<<<<<");
		

		
		try {
			t1.start();
			t2.start();			
			t1.join();
			t2.join();				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		System.out.println("DONE ALL!");
	}
}

