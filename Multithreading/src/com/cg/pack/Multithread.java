package com.cg.pack;

	class Eclipse extends Thread{
		public void run() {
			System.out.println("Eclipse thread id is" +Thread.currentThread().getId());
			
		}
		
	}
	class PPT extends Thread{
		public void run() {
			System.out.println("PPT thread id is" +Thread.currentThread().getId());
		}
		
	}
	class notepad extends Thread{
		public void run() {
			System.out.println("Notepad thread id is" +Thread.currentThread().getId());
			
		}
		
	}

	public class Multithread {
		public static void main(String[] args)
		{
			Eclipse obj1 = new Eclipse();
			obj1.start();
			PPT obj2 = new PPT();
			obj2.start();
			notepad obj3 = new notepad();
			obj3.start();
			
		}

	}

