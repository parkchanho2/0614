
class Point17 extends Object{
	int x = 10;
	int y = 20;
	
	Point17(int x, int y){
		//super(); 가 생략됨. 최고조상 Object의 기본 생성자를 묵시적 제공 하지 않는다.
		this.x = x;
		this.y = y;
	}
}

class ChildPoint17 extends Point17{
	int z = 30;
	
	ChildPoint17(){
		this(100,200,300); 
	}
	ChildPoint17(int x, int y, int z){
		super(x,y); //부모의 오버로딩 된 생성자 호출 경로로 변경
		this.z = z;
	}
	
	void print() {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}
}
public class ExtendEx17 {
	public static void main(String[] args) {
		new ChildPoint17().print();
	}
}
