package practice01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BankAppMain2 {
	
	static int aaa(Set<Account> set, String reAno) {
		int cnt = 0;
		for(Account ele : set) {
			if(ele.getAno().equals(reAno)) {
				cnt++;
				break;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Account> set = new HashSet<>();
		
		boolean run = true;
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			case 1 :
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				System.out.print("계좌번호: ");
				String accNum = sc.nextLine();
				System.out.print("계좌주: ");
				String accOwner = sc.nextLine();
				System.out.print("초기입금액: ");
				int firBal =Integer.parseInt(sc.nextLine());
				
				/*
				int failAcc = 0;
				while (iterator.hasNext()) {
					Account ele = iterator.next();
					if(ele.getAno().equals(accNum)) {
						System.out.println("중복된 계좌입니다");
						failAcc++;
						break;
					}
				}
				if (failAcc == 1) break;
				*/
				int front = set.size();
				
				set.add(new Account(accNum, accOwner, firBal));
				
				int rear = set.size();
				
				if(front == rear) {
					System.out.println("중복된 계좌입니다");
				}else {
					System.out.println("계좌가 생성되었습니다");
				}
				
				break;

			case 2 :
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				for(Account ele : set) {
					System.out.println(ele.getAno() +" "+ ele.getOwner() +" "+ ele.getBalance());
				}
				
				break;
				
			case 3 :
				
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");
				System.out.print("계좌번호: ");
				String reAno = sc.nextLine();
				/*
				int cnt = 0;
				
				for(Account ele : set) {
					if(ele.getAno().equals(reAno)) {
						cnt++;
						break;
					}
				}
				*/
				
				
				
				if(aaa(set,reAno) != 1) {
					System.out.println("계좌번호를 확인해주세요.");
					break;
				}
				System.out.print("예금액: ");
				int reBal = Integer.parseInt(sc.nextLine());
				
				Iterator<Account> iterator = set.iterator();
				//Iterator는 실행문 바로 위에 있어야 작동한다
				//Iterator 는 자동초기화 안돼서 무조건 해당 위치에서 설정을 해야한다.
				
				
				while(iterator.hasNext()) {
					Account insert = iterator.next();
					if(insert.getAno().equals(reAno)) {
						insert.setBalance(insert.getBalance() + reBal );
						System.out.println("예금이 성공하였습니다");
						break;
					}
				}
				break;
				
			case 4 :
				
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");
				System.out.print("계좌번호: ");
				String backAno = sc.nextLine();
				System.out.print("예금액: ");
				int backBal = Integer.parseInt(sc.nextLine());
				
				Iterator<Account> iterator1 = set.iterator();
				
				while(iterator1.hasNext()) {
					Account spend = iterator1.next();
					if(spend.getAno().equals(backAno)) {
						spend.setBalance(spend.getBalance() - backBal );
						System.out.println("출금이 성공하였습니다");
						break;
					}
				}
				break;
				
			case 5 :
				System.out.println("프로그램 종료");
				run = false;
				break;
				
			}
		}
		
		sc.close();
	}

}
