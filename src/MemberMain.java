import java.util.Scanner;

import net.daum.vo.MemberVO;

// MemberVo.java 데이터 저장빈 클래스를 활용하는 예제

public class MemberMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력: ");
		String pwd = sc.nextLine();
		System.out.println("이름 입력: ");
		String name = sc.nextLine();
		System.out.println("폰 번호 입력: ");
		String phone = sc.nextLine();
		System.out.println("이메일 입력: ");
		String email = sc.nextLine();
		
		MemberVO member = new MemberVO();
		member.setMem_id(id); member.setMem_pwd(pwd); member.setMem_name(name); member.setMem_phone(phone); member.setMem_email(email);
		
		System.out.println("아이디: " + member.getMem_id() + "\n비번: " + member.getMem_pwd() + "\n이름: " 
		+ member.getMem_name() + "\n폰 번호: " + member.getMem_phone() + "\n이메일: "  + member.getMem_email());
	}
}
