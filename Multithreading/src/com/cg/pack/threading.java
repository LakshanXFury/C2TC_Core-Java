package com.cg.pack;

	class Eclipse1 implements Runnable{
		public void run() {
		//	for(int i=0;i<5;i++) {
			System.out.println("Eclipse thread id is" +Thread.currentThread().getId());
			System.out.println("Eclipse thread priority is" +Thread.currentThread().getPriority());
		//	}
		}
		
	}
	class PPT1 implements Runnable{
		public void run() {
			
			//for(int i=0;i<5;i++) {
			System.out.println("PPT thread id is" +Thread.currentThread().getId());
			System.out.println("PPT thread priority is" +Thread.currentThread().getPriority());
			//}
		}
		
	}
	class notepad1 implements Runnable{
		public void run() {
			//for(int i=0;i<5;i++) {
		
			System.out.println("Notepad thread id is" +Thread.currentThread().getId());
			System.out.println("Notepad thread priority is" +Thread.currentThread().getPriority());
			//}
		}
		
	}

	public class threading {
		public static void main(String[] args) 
		{
		Eclipse1 obj1 = new Eclipse1();
		Thread t = new Thread(obj1);
		t.start();
		t.setPriority(6);
		PPT1 obj2 = new PPT1();
		Thread t2 = new Thread(obj2);
		t2.start();
		t2.setPriority(8);
		notepad1 obj3 = new notepad1();
		Thread t3 = new Thread(obj3);
		t3.start();
		t3.setPriority(4);
		}

	}

