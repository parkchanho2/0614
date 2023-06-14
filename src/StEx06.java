import java.util.Scanner;

public class StEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("원의 원주율 값: " + Math.PI);
		System.out.println("원의 반지름 정수 숫자로 입력: ");
		
		int r = Integer.parseInt(sc.nextLine());
		
		double a = r * r * Math.PI;
		System.out.println("반지름: " + r + "\n원의 면적: " + a);
	}
}
