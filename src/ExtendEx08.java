
class Point08{ //extends Object
	private int x;
	private int y;

	//매개 변수가 없는 기본생성자 생략
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
		public void setY(int y) {
		this.y = y;
	}
}

class ChildPoint08 extends Point08{
	private int z;

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}

public class ExtendEx08 {
	public static void main(String[] args) {
		ChildPoint08 ch = new ChildPoint08();
		
		ch.setX(10); // 상속받아서 사용
		ch.setY(20); // 상속받아서 사용
		ch.setZ(30); // 자신것 사용
		
		System.out.println("x: " + ch.getX() + "\ny: " + ch.getY() + "\nz: " + ch.getZ());
	}
}


















