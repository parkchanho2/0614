/*
 부모클래스와 자손클래스에서 동일 멤버변수가 정의된 경우 부모로 상속받은 멤버변수에 접근하려면 super. 변수명으로 접근하고,
 자손에서 정의된 멤버변수에 접근하려면 this.변수명 또는 변수명 (this.이 생략됨)으로 접근됨.
 */

class Parent12{
	int a = 10;
	int b = 20;
}

class Child12 extends Parent12{
	int a = 40;
	int b = 50;
	int c = 30;
	
	void print() {
		System.out.println("this.a: " + this.a + "\nb: " + this.b); // this.이 생략
		System.out.println("super.a: " + super.a + "\nsuper.b: " + super.b);
		System.out.println("c: " + c + "\nthis.c: " + this.c);
	}
}
public class ExtendEx12 {
	public static void main(String[] args) {
		Child12 ch = new Child12();
		ch.print();
	}
}
