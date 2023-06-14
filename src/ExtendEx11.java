/*
  상속 관계에서 부모클래스 메서드가 자손클래스 에서 오버라이딩 을 한 경우 부모의 메서드를 호출하고 싶을 때는
  super.메서드(); 를 사용한다. super는 상속관계에서 부모클래스를 가르키는 참조변수 키워드.
 */
class Parent11{ //부모 클래스
	int x;
	int y;
	
	public void pr(int x) {
		this.x = x;
		System.out.println("x: " + x);
	}
	
	public void pr(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("x: " + x + " \ny: " + y);
	}// 상속과 관련 없는 메서드 오버로딩(전달인자 개수가 다른 메서드 오버로딩)
}

class Child11 extends Parent11{
	int c;

	@Override
	public void pr(int x) {
		super.pr(x,20); // 부모클래스 메서드를 호출
	}// 메서드 오버라딩 o
}

public class ExtendEx11 {
	public static void main(String[] args) {
		Child11 ch = new Child11();
		ch.pr(10);
		
	}
}






















