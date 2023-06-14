/**/

class Parent13 extends Object{
	protected int x;
	protected int y;
	
	public Parent13() {
		super();//생략 가능. 부모 Object최고 조상클래스의 기본생성자를 호출하면서 생성자 호출은 끝난다.
	}
	public Parent13(int x, int y) {
		//super(); 생략.
		this.x = x;
		this.y = y;
	}
}

class Child13 extends Parent13{
	protected int z;
	public Child13() {
		
	}
	public Child13(int x, int y, int z) {
		super(x,y);  // 부모클래스의 오버로딩 된 생성자 호출
		this.z = z; 
	}// 전달인자 개수가 다른 생성자 오버로딩
	
	public void pr() {
		System.out.println("x: " + x + "\ny: " + y + "\nz: " + z);
	}
}

public class ExtendEx13 {
	public static void main(String[] args) {
		Child13 ch = new Child13(10,20,30); // 자손클래스의 전달인자 3개짜리 오버로딩 된 생성자 호출
		ch.pr();
 	}
}	
