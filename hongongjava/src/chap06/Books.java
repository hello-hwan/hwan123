package chap06;

public class Books {
	// 필드
	private String title;
	private String id;
	private int price;
	
	//생성자
	Books(String title, String id, int price) {
		this.title = title;
		this.id = id;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메소드
	
	
	
}//end class
