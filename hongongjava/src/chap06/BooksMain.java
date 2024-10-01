package chap06;

import java.util.Scanner;

public class BooksMain {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		
		
		//도서관리 메인 - 메뉴 1. 도서 수 입력 2. 도서입력 3.도서목록조회 4.도서분석 5.종료
		Books[] bk = null; 
		//Books[] bk; 이렇게 하면 변수 초기화가 안되어서 오류뜸
		int bkNum = 0;
		int sum = 0;
		int max = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("메뉴 1.도서 수 입력 2. 도서 입력 3.도서목록 조회 4.도서 분석 5. 종료");
			System.out.print("번호 입력> ");
			String selNum = sc.nextLine();
			
			switch(selNum) {
			case "1" : 
				System.out.print("1. 도서 수 입력>");
				bkNum = Integer.parseInt(sc.nextLine());
				bk = new Books[bkNum];
				System.out.println(bk.length);
				break;
			case "2" :
				for(int i = 0; i < bkNum; i++) {
					
					
//					bk[i] = new Books[] ;
					
					
					System.out.print("2. 도서 제목>");
					String title = sc.nextLine();
//					bk[i].setTitle(title); // 왜 안되는지 모르겠음
					System.out.print("2. 도서 번호>");
					String id = sc.nextLine();
//					bk[i].setId(id);
					System.out.print("2. 도서 가격>");
					int price = Integer.parseInt(sc.nextLine());
//					bk[i].setPrice(price);
					
					bk[i] = new Books(title, id, price);
					
					sum += price;
					if(price > max) {
						max = price;
					}
					
				}
				break;
			case "3" :
				for(int i = 0; i < bkNum ; i++) {
					System.out.printf("도서명:%s 도서번호:%s 도서가격:%d\n",bk[i].getTitle(),bk[i].getId(), bk[i].getPrice());
				}
				break;
			case "4" :
				for(int i = 0; i < bk.length; i++) {
					sum += bk[i].getPrice();
					if(max < bk[i].getPrice()) {
						max = bk[i].getPrice();
					}
				}
				
				double avg = (double)sum / bkNum;
				System.out.printf("도서 평균 가격: " + avg + "최대 가격: " + max);
				break;
			default :
				run = false;
				System.out.println("프로그램 종료");
			}
			
		}
		sc.close();
		*/
		
		/*
		//교수님 풀이
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Books[] books =null;
		int bookCnt = 0;
		
		while(run) {
		System.out.println("메뉴 1.도서수 2.도서내용 3.목록 4.분석 5.종료");
		int menuNo = Integer.parseInt(sc.nextLine());
		
			switch(menuNo) {
			case 1 :
				System.out.print("도서 수> ");
				bookCnt = Integer.parseInt(sc.nextLine());
				books = new Books[bookCnt];
				break;
			case 2 :
				for(int i = 0; i < bookCnt; i++) {
					System.out.println((i+1) + "번째 도서 입력");
					System.out.println("책 제목> ");
					String title = sc.nextLine();
					System.out.println("책 번호> ");
					String id = sc.nextLine();
					System.out.println("책 가격> ");
					int price = Integer.parseInt(sc.nextLine());
					
					books[i] = new Books(title, id, price);
				}
				break;
			case 3 :
				for(Books book : books) { //배열의 첫번째 방 
					System.out.printf("%s %s %d\n",book.getTitle(),book.getId(),book.getPrice());
				}
				break;
			case 4 :
				int sum = 0;
				String title = null;
				int max = Integer.MIN_VALUE;
				for(Books book : books) {
					int p = book.getPrice();
					sum += p;
					if(max < p) {
						max = p;
						title = book.getTitle();
					}
				}
				System.out.println(title);
				System.out.println((double)sum / books.length);
				System.out.println(max);
				break;
				
			case 5 :
				run = false;
				break;
			default : 
				System.out.println("메뉴를 다시 선택하세요");
			}
			
		}
		sc.close();
		System.out.println("프로그램 종료");
		*/
		
	}//end main

}//end class
