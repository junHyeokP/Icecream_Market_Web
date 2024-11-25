package kr.ac.kopo.vo;

public class BoardVO {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private int viewCnt;
	private String regdate;
	
	
	public BoardVO() {
		
	}
	
	public BoardVO(int no, String title, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
	}

	public BoardVO(int no, String title, String writer, String content) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	public BoardVO(int no, String title, String writer, String content, int viewCnt, String regdate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.viewCnt = viewCnt;
		this.regdate = regdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "BoardVO [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", viewCnt="
				+ viewCnt + ", regdate=" + regdate + "]";
	}
	
	
}
