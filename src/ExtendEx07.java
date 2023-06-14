/*
  class 자손클래스 extends 부모(조상) 클래스{
  
  }
  extends(확장하다) 키워드를 사용해서 상속받는다.
  
   클래스 상속은 하나의 부모로부터 단일 상속만 가능하고, 하나이상의 부모로 부터 다중 상속을 불가능하다.
 */

class Parent07 extends Object{
	/*
	 1. 자바 최상위 부모 조상클래스 Object으로 부터 상속 받는다
	 2. 자바의 모든 클래스는 명시적인 상속을 받지 않으면 묵시적으로 Object으로 부터 상속받는다
	 3. 결국 extends Object은 생략가능
	 */
	void parent07() {
		System.out.println("부모 클래스에서 정의 parent07() 메소드");
	}
}
class Child07 extends Parent07{
	//child07 자손클래스 부모클래스 Parent07로 부터 명시적인 상속을 받는다.
	void child07() {
		System.out.println("자손에서 정의 메서드 child07()");
	}
}
public class ExtendEx07 {
	public static void main(String[] args) {
		Child07 child = new Child07();
		child.parent07(); // 부모로 부터 상속받아서 호출
		child.child07(); // 자손에서 정의된 메서드 호출
		
		Parent07 p07 = new Parent07();
		
		p07.parent07(); //부모에서 정의딘 메서드 호출
		//p07.child07(); 부모객체 입장에서 자손에서 정의된 메서드 호출불가 
	}
}
