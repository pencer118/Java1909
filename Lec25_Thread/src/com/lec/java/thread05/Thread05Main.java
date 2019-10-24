package com.lec.java.thread05;

/* join() 
	 지정한 시간 동은 쓰레드가 실행되도록 둔다.
	 지정한 시간이 지나거나, 작업이 종료되면 (쓰레드가 종료되면)  join()을 호출한 쓰레드로 돌아와 실행을 한다
	 특정 쓰레드가 종료한 시점을 기다릴 필요가 있을때  사용
*/

public class Thread05Main {

	public static void main(String[] args) {
		System.out.println("join() 메소드\n");
		
		Thread th1 = new MyThread("One");
		Thread th2 = new MyThread("Two");
		
		th1.start();
		th2.start();
		
		
		try {
			th1.join(); // 현재 쓰레드인 메인쓰레드에서 th1이 끝날때까지 기다립니다
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}   
		
		System.out.println("이 라인은 언제 실행될까요?");
		System.out.println();
		
		
		// 두개의 쓰레드를 순차적으로 진행하고 싶다면?
		
		th1 = new MyThread("하나");
		th2 = new MyThread("둘");
		
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th2.start();
		
		
		
		
		
		

	} // end main()

} // end class


// Thread 클래스를 상속받는 클래스 정의
class MyThread extends Thread{
	public MyThread() {}
	public MyThread(String name) {
		setName(name); // 쓰레드 이름
	}

	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(getName() + " - " + i);
		}
		System.out.println("<<" + getName() + ">> 종료");
	}
	
} // end class MyThread















