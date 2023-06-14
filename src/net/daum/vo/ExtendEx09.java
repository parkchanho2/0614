package net.daum.vo;
/*
 protected 로 선언된 것은 상속받은 자손에서는 다른 패키지 폴더에서도 접근 가능.
*/

class ParentPoint09{
	protected int a = 10; // or public
	protected int b = 20;
	
	// net.daum.vo 패키지 에서 parentpoint09 부모클래스를 상속 받은 자손클래스 childpoint09 를 생성한 다음 부모의 protected 로 선언된 변수 a,b를 상속받고 public void pr(){} 
	// 사용자 정의 메서드를 정의한 다음 상속받은 각 변수값을 출력해 보자.
}

public class ExtendEx09 extends ParentPoint09{
	public static void main(String[] args) {
		// 자손 클래스 childpoint09클래스 객체 cp 를 생성한 다음 pr() 메서드를 호출한다.
	}
}
