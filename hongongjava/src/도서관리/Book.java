package 도서관리;

public class Book {
	//필드는 외부 접근 막기 - Getter, Setter
	private String title;
	private String writer;
	private int price;
	private String bNum;
	
	//생성자
	Book(String title, String writer, int price, String bNum){
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.bNum = bNum;
	}
	
	//메소드
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
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getbNum() {
		return bNum;
	}
	
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	
	@Override
	public String toString() {
		return title + "\t" + writer + "\t" + price +"\t" + bNum;
	}
	
}
