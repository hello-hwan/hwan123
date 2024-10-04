package javadb;

import java.sql.Date;

public class Boards {
	private int bno;
	private String btitle;
	private String content;
	private String bwriter;
	private Date bdate; //import할때 sql로 가져와야 데이터 타입
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBwriter() {
		return bwriter;
	}
	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bno + "\t" + btitle + "\t" + content + 
				"\t" + bwriter + "\t" + bdate ;
	}
	
	
}
