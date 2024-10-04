package 도서관리;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		//도서관리 - 행이 추가되면 1을 받아서 성공, 아니면 실패라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		BookDao dao = null;
		int cnt = 0;
		boolean run = true;
		
		//메인메뉴
		while(run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.도서등록 2.도서검색 3.도서전체조회 4.도서삭제 5.도서 정보 변경 6.종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("선택> ");
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			//선택1번: 도서등록
			case 1 :
				System.out.println("-------");
				System.out.println("도서등록");
				System.out.println("-------");
				
				//데이터 베이스에 추가하기 위하여 객체에 값 넣는 작업
				System.out.print("책제목> ");
				String title = sc.nextLine();
				System.out.print("저자> ");
				String writer = sc.nextLine();
				System.out.print("가격> ");
				int price =Integer.parseInt(sc.nextLine());
				System.out.print("책번호> ");
				String bNum = sc.nextLine();
				
				//DateBase에 넣을 객체 생성 (Book 객체)
				Book book = new Book(title, writer,price,bNum);
				//DataBase에 접근 메소드를 사용하기 위한 객체 생성 (BookDao 객체)
				dao = new BookDao();
				//DataBase에 조회, 삽입, 수정, 삭제하는 작업
				//여기서는 dao객체의 메소드를 사용하여 book 객체를 넣어서 인트cnt 값으로 반환 
				//select문에서 리턴값을 int로 지정하여서 받을값을 미리 int cnt=0;으로 저장
				cnt = dao.insert(book);
				
				
				if(cnt == 1) {
					System.out.println("추가성공");
				}else {
					System.out.println("추가실패");
				}
			}
			
		}
		
		//선택2번: 도서검색 - 책 제목으로 검색
		
		//선택3번: 도서전체 조회
		
		//선택4번: 도서삭제
		
		//선택5번: 도서 정보 변경 - 책제목:변경할 책번호, 변경할 책가격입력=> 수정
		
		//선택 6번 종료
		
		
	}// end main
	
}// end class
