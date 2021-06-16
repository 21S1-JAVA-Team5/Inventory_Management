package Inven;

import java.util.Scanner;

/**
 * @brief 메인 메뉴 등
 * @author 김상민, 이소영, 김동현, 안현진
 * @date 2021-06-16 
 * @version 2.0
 */
public class MainMenu {

	public static void showMenu() {
		System.out.println("=============================");
		System.out.println("-------Inventory Management Menu-------");
		System.out.println("");
		System.out.println("Press [1] - Display All Product ");
		System.out.println("Press [2] - Select Warehouse ");
		System.out.println("Press [3] - Add New Product Information ");
		System.out.println("Press [4] - Search Product ");
		System.out.println("Press [5] - Modify Product Information ");
		System.out.println("Press [6] - Remove Product Information ");
		System.out.println("Press [7] - End Program ");
		System.out.println("");
		System.out.println("=============================");
		System.out.println("");
	}
	
	public static void main(String[] args) {
		
		Manager manager = new Manager(1000);		//재고 정보가 저장될 배열 1000으로 초기화
		
		while(true) {
			showMenu();
			
			Scanner keyboard = new Scanner(System.in);
			int select = keyboard.nextInt();
			
			switch(select) {
			case 1:		//전체 재고 정보 출력
				manager.showAll();
				break;
			case 2:		//창고별로 재고 정보 출력
				manager.showSelect();
				break;
			case 3:		//상품 정보 등록
				manager.addProduct();
				break;
			case 4:		//등록된 상품 검색
				manager.searchProduct();
				break;
			case 5:		//등록된 상품 수정
				manager.modifyProduct();
				break;
			case 6:		//상품 제거
				manager.deleteProduct();
				break;
			case 7:		//프로그램 종료
				System.out.println("Program Terminated");
				return;
			}
		}
	}
}
