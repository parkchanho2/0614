package net.daum.vo; // pacjage 키워드로 net.daum.vo 패키지 폴더명을 생성
// 회원 저장빈 엔티티 빈 클래스

public class MemberVO { // 데이터 저장빈 클래스
	
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	private String mem_phone;
	private String mem_email;
	
	
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	
	
}
