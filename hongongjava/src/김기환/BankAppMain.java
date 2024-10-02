package 김기환;

import java.util.Scanner;

public class BankAppMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account[] acc = new Account[100];
		
		boolean run = true;
		
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			case 1 :
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				System.out.print("계좌번호> ");
				String accNum = sc.nextLine();
				
				System.out.print("계좌주> ");
				String accOwner = sc.nextLine();
				System.out.print("초기입금액> ");
				int accFirst = Integer.parseInt(sc.nextLine());
				
				
				/*
				for(Account ee : acc) {
						if(ee.getAno().equals(accNum)) {
							System.out.println("중복된 번호입니다");
							break;
						}
				}
				*/
				
				for(int i = 0; i < acc.length; i++) {
					if(accFirst < Account.MIN_BALANCE || accFirst > Account.MAX_BALANCE) {
						System.out.println("0 ~ 1000000 사이의 금액을 입력하세요");
						break;
					}
					if(acc[i] == null) {
						acc[i] = new Account(accNum, accOwner, accFirst);
						System.out.println("결과: 계좌가 생성되었습니다.");
						break;
					}
					if(i == 99) {
						System.out.println("결과: 더이상 계좌를 생성할 수 없습니다.");
					}
				}
				break;
				
			case 2 :
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				
				if(acc[0] == null) {
					System.out.println("조회할 계좌가 없습니다");
					break;
				}
				
				for(Account ele : acc) {
					if(ele != null) {
						System.out.printf("%s\t%s\t%d\n",ele.getAno(), 
								ele.getOwner(), ele.getBalance());
					}
				}
				
				break;
			case 3 :
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호> ");
				String other = sc.nextLine();
				System.out.print("예금액> ");
				int newBal = Integer.parseInt(sc.nextLine());
				
				if(newBal <= Account.MIN_BALANCE) {
					System.out.println("0원보다 큰 금액을 입력하세요");
					break;
				}
				
				for(Account ele : acc) {
					if(ele.getAno().equals(other)){
						if(ele.getBalance() + newBal <= Account.MAX_BALANCE) {
							ele.setBalance( ele.getBalance() + newBal );
							System.out.printf("예금액 : %d 잔액: %d\n",newBal,ele.getBalance());
							break;
						}else {
							System.out.println("예금 한도는 1000000원 입니다");
							break;
						}
					}
				}
				break;
			case 4 :
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호> ");
				String other1 = sc.nextLine();
				System.out.print("출금액> ");
				int newBal1 = Integer.parseInt(sc.nextLine());
				
				if(newBal1 <= Account.MIN_BALANCE) {
					System.out.println("0원보다 큰 금액을 입력하세요");
					break;
				}
				
				for(Account ele : acc) {
					if(ele.getAno().equals(other1)){
						if(ele.getBalance() - newBal1 >= Account.MIN_BALANCE) {
							ele.setBalance( ele.getBalance() - newBal1 );
							System.out.printf("출금액 : %d 잔액: %d\n",newBal1,ele.getBalance());
							break;
						}else {
							System.out.println("잔액이 부족합니다");
							break;
						}
					}
				}
				break;
			case 5 :
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
		
	}//end main

}//end class
