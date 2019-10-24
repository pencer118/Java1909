package com.lec.java.thread06;

/* sleep() 
 *  지정된 시간 동안 쓰레드 일시 정지
 */

public class Thread06Main {

	public static void main(String[] args) {
		System.out.println("sleep() 메소드\n");
		
		Thread th1 = new MyThread("One");
		Thread th2 = new MyThread("Two");
		
		th1.start();
		th2.start();
		
		th1.suspend();
		
		try {			
			th1.sleep(5000); //<-- th1 이 sleep() 되는게 아니라
					// 이 코드를 수행하는 main쓰레드가 sleep() 됨.2
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th1.resume();
		
		
		System.out.println("<< main 종료 >>");
		
	} // end main()

} // end class Thread04Main


// Thread 클래스를 상속받는 클래스 정의
class MyThread extends Thread {
	public MyThread() {}
	public MyThread(String name) {
		setName(name);  // 쓰레드 이름 지정
	}
	
	@Override
	public void run() {
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		for(int i = 0; i < 50; i++) {
			System.out.println(getName() + " - " + i);
		}
		System.out.println("<<" + getName() + ">> 종료");	
	} // run()
	
} // end class MyThread














