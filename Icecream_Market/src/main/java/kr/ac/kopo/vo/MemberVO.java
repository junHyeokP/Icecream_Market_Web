package kr.ac.kopo.vo;

public class MemberVO {
	
	private String im_id;
	private String im_name;
	private String im_password;
	private String im_email_id;
	private String im_email_domain;
	private String im_basic_addr;
	private String im_detail_addr;
	private String im_reg_date;
	
	
	
	public MemberVO() {
		// mybatis가 자동적으로 객체를 생성할때는 디폴트 생성자가 존재해야한다.	
	}



	public MemberVO(String im_id, String im_name, String im_password, String im_email_id, String im_email_domain,
			String im_basic_addr, String im_detail_addr) {
		this.im_id = im_id;
		this.im_name = im_name;
		this.im_password = im_password;
		this.im_email_id = im_email_id;
		this.im_email_domain = im_email_domain;
		this.im_basic_addr = im_basic_addr;
		this.im_detail_addr = im_detail_addr;
	}



	public String getIm_id() {
		return im_id;
	}



	public void setIm_id(String im_id) {
		this.im_id = im_id;
	}



	public String getIm_name() {
		return im_name;
	}



	public void setIm_name(String im_name) {
		this.im_name = im_name;
	}



	public String getIm_password() {
		return im_password;
	}



	public void setIm_password(String im_password) {
		this.im_password = im_password;
	}



	public String getIm_email_id() {
		return im_email_id;
	}



	public void setIm_email_id(String im_email_id) {
		this.im_email_id = im_email_id;
	}



	public String getIm_email_domain() {
		return im_email_domain;
	}



	public void setIm_email_domain(String im_email_domain) {
		this.im_email_domain = im_email_domain;
	}



	public String getIm_basic_addr() {
		return im_basic_addr;
	}



	public void setIm_basic_addr(String im_basic_addr) {
		this.im_basic_addr = im_basic_addr;
	}



	public String getIm_detail_addr() {
		return im_detail_addr;
	}



	public void setIm_detail_addr(String im_detail_addr) {
		this.im_detail_addr = im_detail_addr;
	}



	public String getIm_reg_date() {
		return im_reg_date;
	}



	public void setIm_reg_date(String im_reg_date) {
		this.im_reg_date = im_reg_date;
	}



	@Override
	public String toString() {
		return "MemberVO [im_id=" + im_id + ", im_name=" + im_name + ", im_password=" + im_password + ", im_email_id="
				+ im_email_id + ", im_email_domain=" + im_email_domain + ", im_basic_addr=" + im_basic_addr
				+ ", im_detail_addr=" + im_detail_addr + ", im_reg_date=" + im_reg_date + "]";
	}

	
	
}
