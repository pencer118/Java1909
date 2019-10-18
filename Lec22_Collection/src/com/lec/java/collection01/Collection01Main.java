package com.lec.java.collection01;

/* Generic 클래스: 
 * 클래스의 멤버변수나 혹은 메소드의 리턴'타입', 매개변수 등의 '타입'을 
 * 지정하지 않고 generic(일반적으로)하게 정의하는 클래스
 * 
 * '동작' 은 같으나, '데이터 타입' 만 다른 경우 Generic 으로 설계함으로 코드 생산성 향상 
 */
public class Collection01Main {

	public static void main(String[] args) {
		System.out.println("Generics(제네릭스)");
		
		System.out.println();
		System.out.println("[1] generic 클래스 사용 전");		

		Orange orange1 = new Orange(10);
		OrangeBox orangeBox1 = new OrangeBox(orange1);
		orangeBox1.pullOut().displaySugar();
		
		Apple a1 = new Apple(100);
		AppleBox appleBox1 = new AppleBox(a1);
		appleBox1.pullOut().displayWeight();
		
		
		
		System.out.println();
		System.out.println("[2] generic 클래스 사용");
		
		Orange orange2 = new Orange(100);
		FruitBox<Orange> orangeBox2 = new FruitBox<Orange>(orange2);
		orangeBox2.pullOut().displaySugar();
		
		// TODO
		// 사과, 바나나 담는 FruitBox 생성하고 pullOut 해보기
		Apple a2 = new Apple(200);
		FruitBox<Apple> appleBox2 =  new FruitBox<Apple>(a2);
		appleBox2.pullOut().displayWeight();
		
		Banana b2 = new Banana(300);
		FruitBox<Banana> bananaBox2 = new FruitBox<Banana>(b2);
		bananaBox2.pullOut().displayNum();		
		

	} // end main()
} // end class


class Banana {
	int num; 
	public Banana() {}
	public Banana(int num) {this.num = num;}
	
	public void displayNum() {
		System.out.println("바나나 송이개수 : " + num);
	}
} // end Banana

class Orange {
	int sugar;
	
	public Orange() {}
	public Orange(int sugar) {this.sugar = sugar;}
	
	public void displaySugar() {
		System.out.println("오렌지 당도 : " + sugar);
	}
}

class Apple {
	int weight;
	
	public Apple() {}
	public Apple(int weight) {this.weight = weight;}
	
	public void displayWeight() {
		System.out.println("사과 무게: " + weight);
	}
} // end Apple

class BananaBox {
	Banana banana;
	
	public BananaBox() {}
	public BananaBox(Banana banana) {this.banana = banana;}
	
	public Banana pullOut() {return banana;}
}

class OrangeBox {
	Orange orange;
	
	public OrangeBox() {}
	public OrangeBox(Orange orange) {this.orange = orange;}
	
	public Orange pullOut() {return orange;}
}

class AppleBox {
	Apple apple;
	
	public AppleBox() {}
	public AppleBox(Apple apple) {this.apple = apple;}
	
	public Apple pullOut() { return apple; }
}

// Generic 클래스
class FruitBox<T>{
	T fruit;   // T 타입 멤버변수
	
	public FruitBox() {}
	public FruitBox(T fruit) {this.fruit = fruit;}  // T타입 매개변수
	
	public T pullOut() { return fruit; }  // T 타입 리턴	
}
























