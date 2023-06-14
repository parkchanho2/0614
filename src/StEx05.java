import java.util.Scanner;

/*
  내장 api 클래스 하위의 내장메서드를 활용하는 예제 
 */

public class StEx05 {
	public static void main(String[] args) {
	/*
	  문제) 스캐너를 활용하여 두 정수숫자값을 입력받아서 int 타입 a,b 변수에 입력받은 다음 Math클래스 하위의 내장메서드 를
	  활용해서 최대값과 최소값을 구하는 프로그램을 작성해 보자.
	  
	 parseInt() 내장메서드는 입력 받은 문자열을 정수 숫자로 변경해 준다.
	 */
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("입력: ");
		int a = sc.nextInt();
		// a = Integer.parseInt(sc.nextLine());
		System.out.println("입력: ");
		int b = sc.nextInt();
		// b = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		System.out.println("최대값: " + Math.max(a, b)); // 최대값
		System.out.println("최소값: " + Math.min(a, b)); // 최소값
	}
}
