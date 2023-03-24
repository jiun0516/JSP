package ch01;

public class MainTest {

	/**
	 * 
	 *  람다식(Lambda expression)
	 *  
	 *  함수형 프로그래밍 방식
	 *  자바 8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라고 한다
	 *  
	 *  함수형 프로그래밍이란 (FP : Functional Programming)
	 *  함수를 기반으로 하는 프로그래밍 입력 방식이고 매개변수로 전달 받는 입력 외에
	 *  외부 자료(데이터)를 사용하지 않아 여러 자료가 동시에 수행되는 병렬처리 가능한 
	 *  코딩 방식이다.
	 *  
	 *  순수 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)를 주지
	 *  않도록 구현하는 방식이다.
	 *  
	 *  익명 함수 --> 컴파일러가 타입 추론이 가능하기 때문에 코드를 줄여서 사용할 수 
	 *  있는 개념으로 발전 되었다.
	 *  () -> {System.out.println("반가워 람다");};
	 *  (X) -> {(System.out.println(x + "<<<"));};
	 *   x -> {};
	 *   x - > System.out.println();
	 *   
	 *   !! 람다식을 사용하기 위해서는 반드시 선행 되어야 할 부분은 !!!
	 *   인터페이스가 먼저 만들어져 있어야 한다!!!
	 */
	public static void main(String[] args) {
		// int add(int x, int y);
		
		// 1. 인터 페이스가 있고
		// 2. 어떻게 구현될지 식을 재정 한다. (람다 표현식으로)
		
		IAdd iAdd = (x, y) -> {return x * y;};
		// IAdd sub = (x, y) -> {return x - y;};
		
		// int resultAdd = add(10, 10);
		System.out.println(iAdd.cal(10, 10));
		
		IPrint iPrint = (a, b) -> {System.out.println(a + " : " + b);};
		
		iPrint.myPrint("홍길동", "ddd");
		
		IPrint2 print2 = () -> {return "반가워 람다";};
		
		String temp = print2.print();
		System.out.println(temp);
		
		// 람다식을 만들기 위해서 선행 조건 및 실행 순서
		// 1. 인터페이스가 있어야 한다.
		// 2. 인터페이스 안에는 반드시 하나의 추상 메서드만 존재 해야 한다.
		// 3. 1, 2 조건을 만족한다면 우리가 필요한 식을 정의할 수 있다.
		// 4. 3번에서 람다식을 정의 하였다면 식을 정의할 때 사용한 인터페이스 타입을
		//		이용하고 그 안에 추상 메서드 이름을 사용해서 호출해서 사용할 수 있다.
		
		// new Thread(() -> {}).start();
	}

}

// 람다 표현식 만들기 인터 페이스 먼저 정의 되어야 한다. !!
// 주의점 2 , 함수형 인터페이스라고 한다. (단, 인터페이스안에 추상메소드는 반드시 한개여야 한다.)
interface IPrint {
	void myPrint(String str, String token);
}

interface IPrint2 {
	String print();
}

