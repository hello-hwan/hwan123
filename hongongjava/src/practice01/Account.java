package practice01;

public class Account {
	//필드
	private String ano;
	private String owner;
	private int balance;
	
	static final int MIN_VALUE = 0;
	static final int MAX_VALUE = 1000000;
	
	//생성자
	Account(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	//메소드
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public int hashCode() {
		return ano.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account acc = (Account) obj;
			return acc.getAno().equals(ano);
		}
		return super.equals(obj);
	}
	
}
