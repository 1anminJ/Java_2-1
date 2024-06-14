package w11.Addr;

import javax.swing.text.Style;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddrMain {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Addr> addlist = new ArrayList<Addr>();
	public static void main(String[] args) {
		while(true) {
			System.out.println("-------------");
			System.out.println("1. 주소록 입력");
			System.out.println("2. 주소록 검색");
			System.out.println("3. 주소록 전체 조회");
			System.out.println("4. 주소록 수정");
			System.out.println("5. 주소록 삭제");
			System.out.println("0. 종료");
			System.out.println("-------------");
			System.out.println("메뉴를 입력하세요: ");
			int menu = sc.nextInt();
			//여기에 if문 또는 case 문
			switch (menu){
				case 1 :
					addrInput();
					break;
				case 2 :
					addrSearch();
					break;
				case 3 :
					addrDisplay();
					break;
				case 4 :
					addrUpdate();
					break;
				case 5 :
					addrDelete();
					break;
				case 0:
					System.out.println("종료되었습니다.");
					System.exit(0);
					break;
				default:
					System.out.println("잘못 했습니다. 1~5까지 다시 입력하십시오.");
					break;
			}
		}
//		sc.close(); //프로그램이 끝나는 곳에 넣어야 함
	}
	// main end
	static void addrSearch(){
		System.out.println("검색할 이름을 입력하시오.");
		String name = sc.next();
		for(Addr search : addlist){
			if(name.equals(search.getName())){
				System.out.println(search);
			}
		}
	}
	static void addrDisplay(){
		System.out.println("== 전체 리스트 조회 ==");
		for(Addr one : addlist){
			System.out.println(one);
		}

	}
	static void addrDelete() {
		System.out.println("삭제할 이름을 입력하시오.");
		String name = sc.next();
		for(int i = 0; i < addlist.size();i++){
			if(addlist.get(i).getName().equals(name))
				addlist.remove(i);
		}
	}

	static void addrUpdate() {
		System.out.println("수정할 이름을 입력하시오.");
		String name = sc.next();
		System.out.println("수정할 전화번호를 입력하시오.");
		String tel = sc.next();
		System.out.println("수정할 회사 이름을 입력하시오.");
		String com = sc.next();
		for(Addr update : addlist){
			if(update.getName().equals(name)) {
				update.setTel(tel);
				update.setCom(com);
				System.out.println(update + "로 수정되었습니다.");
			}
		}
	}
	public static void addrInput() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("전화번호를 입력하세요. : ");
		String tel = sc.next();
		System.out.println("회사 이름을 입력하세요. : ");
		String com = sc.next();
		LocalDateTime createDate = LocalDateTime.now();
		addlist.add(new Addr(name, tel, com, createDate));
	}
	
}
