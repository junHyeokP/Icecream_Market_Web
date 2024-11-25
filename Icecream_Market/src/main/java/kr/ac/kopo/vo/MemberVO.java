package kr.ac.kopo.vo;

public class MemberVO {
	
	int id;
	String name;
	String password;
	String email_id;
	String email_domain;
	String basic_addr;
	String detail_addr;
	String reg_date;
	
	public MemberVO(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public MemberVO(int id, String name, String password, String email_id, String email_domain, String basic_addr,
			String detail_addr, String reg_date) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email_id = email_id;
		this.email_domain = email_domain;
		this.basic_addr = basic_addr;
		this.detail_addr = detail_addr;
		this.reg_date = reg_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getEmail_domain() {
		return email_domain;
	}

	public void setEmail_domain(String email_domain) {
		this.email_domain = email_domain;
	}

	public String getBasic_addr() {
		return basic_addr;
	}

	public void setBasic_addr(String basic_addr) {
		this.basic_addr = basic_addr;
	}

	public String getDetail_addr() {
		return detail_addr;
	}

	public void setDetail_addr(String detail_addr) {
		this.detail_addr = detail_addr;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	
	
	
}
