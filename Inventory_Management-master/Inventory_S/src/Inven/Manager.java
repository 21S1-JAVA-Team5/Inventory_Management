package Inven;

import java.util.Scanner;

/**
 * @brief 재고의 등록, 삭제, 수정 등 대부분의 기능을 조작
 * @author 김상민, 이소영, 김동현, 안현진
 * @date 2021-06-16 
 * @version 2.0
 */
public class Manager {
	private Product[] jProducts;
	private int numOfProducts;

	public Manager(int num) {		//상품 정보를 저장할 배열 생성
		this.jProducts = new Product[num];
		numOfProducts = 0;
	}

	/**
	 * @brief 상품 정보 등록
	 */
	public void addProduct() {
		
		Scanner keyboard = new Scanner(System.in);

		String jPName;			//제품 이름
		double jUnitPrice;		//개당 가격
		int jStock;				//재고 수량
		String jCategory;		//물품 분류
		String jWareName1;		//서울 창고
		String jWareName2;		//인천 창고
		String jWareName3;		//경기 창고

		//기본 상품 정보 등록
		System.out.println("Product Name: ");
		jPName = keyboard.nextLine();

		System.out.println("Unit Price: ");
		jUnitPrice = keyboard.nextDouble();
		keyboard.nextLine();

		System.out.println("Stock: ");
		jStock = keyboard.nextInt();
		keyboard.nextLine();

		System.out.println("Category: ");
		jCategory = keyboard.nextLine();

		//제품이 저장되는 창고 선택
		System.out.println("Select Warehouse Location");
		System.out.println("Press [1]-SEOUL Warehouse");
		System.out.println("Press [2]-Incheon Warehouse");
		System.out.println("Press [3]-Gyeonggi Warehouse");
		System.out.println("=============================");
		
		int selectStore = keyboard.nextInt();		//창고 위치

		if (selectStore == 1) {		//서울 창고 선택시
			System.out.println("You selected SEOUL Storage");
			jWareName1 = "SEOUL Warehouse";		//서울 창고 등록
			Warehouse1 seoul = new Warehouse1(jPName, jUnitPrice, jStock, jCategory, jWareName1);
			jProducts[numOfProducts++] = seoul;
		}

		else if (selectStore == 2) {	//인천 창고 선택시
			System.out.println("You selected INCHEON Storage");
			jWareName2 = "INCHEON Warehouse";		//서울 창고 등록
			Warehouse2 incheon = new Warehouse2(jPName, jUnitPrice, jStock, jCategory, jWareName2);
			jProducts[numOfProducts++] = incheon;
		}

		else if (selectStore == 3) {	//경기 창고 선택시
			System.out.println("You selected GYEONGGI Storage");
			jWareName3 = "GYEONGGI Warehouse";		//서울 창고 등록
			Warehouse3 gyeonggi = new Warehouse3(jPName, jUnitPrice, jStock, jCategory, jWareName3);
			jProducts[numOfProducts++] = gyeonggi;
		}
	}

	/**
	 * @brief 모든 창고의 재고를 출력
	 */
	public void showAll() {
		for(int i = 0; i < numOfProducts; i++) {
			jProducts[i].showAll();
		}
	}

	/**
	 * @brief 선택한 창고의 재고만 출력
	 */
	public void showSelect() {
		System.out.println("Select Warehouse Location");
		System.out.println("Press [1]-SEOUL Warehouse");
		System.out.println("Press [2]-INCHEON Warehouse");
		System.out.println("Press [3]-GYEONGGI Warehouse");
		System.out.println("=============================");

		Scanner keyboard = new Scanner(System.in);
		int select = keyboard.nextInt();

		if(select == 1) {		//서울 창고 조회
			System.out.println("==SEOUL Warehouse Information==");

			for(int i = 0; i < numOfProducts; i++) {
				jProducts[i].showWarehouse1();
			}
		}
		else if(select == 2) {		//인천 창고 조회
			System.out.println("==INCHEON Warehouse Information==");

			for(int i = 0; i < numOfProducts; i++) {
				jProducts[i].showWarehouse2();
			}
		}
		else if(select == 3) {		//경기 창고 조회
			System.out.println("==GYEONGGI Warehouse Information==");

			for(int i = 0; i < numOfProducts; i++) {
				jProducts[i].showWarehouse3();
			}
		}
	}

	/**
	 * @brief 특정 상품 조회
	 */
	public void searchProduct() {
		boolean isFound = false;		//존재 여부 확인
		
		System.out.println("Enter product name to find: ");
		
		Scanner keyboard = new Scanner(System.in);
		String searchName = keyboard.nextLine();

		for(int i = 0; i < numOfProducts; i++) {
			if(searchName.compareTo(jProducts[i].pName) == 0) {
				jProducts[i].showAll();

				isFound = true;		//검색한 정보가 존재함
			}
		}
		if(isFound == false) {		//검색한 정보가 없음
			System.out.println("Error: Product==" + searchName + " does not exist");
		}
	}

	/**
	 * @brief 지정한 상품 수정
	 */
	public void modifyProduct() {
		boolean isFound = false;		//존재 여부 확인
		
		System.out.println("Enter product name to modify:");
		
		Scanner keyboard = new Scanner(System.in);
		String modiName = keyboard.nextLine();
		
		for(int i = 0; i < numOfProducts; i++) {
			if(modiName.compareTo(jProducts[i].pName) == 0) {		//검색한 제품이 존재한다면
				System.out.println("Ready to Modify Product:" + modiName);
				System.out.println("Press [1]-Modify Price");
				System.out.println("Press [2]-Modify Stock");
				System.out.println("Press [3]-Modify Category");
				
				int select = keyboard.nextInt();
				double nPrice;		//수정할 가격
				int nStock;			//수정할 재고 수량
				String nCategory;	//수정할 카테고리
				
				if(select == 1) {
					System.out.println("Enter price to update: ");
					nPrice = keyboard.nextDouble();
					jProducts[i].unitPrice = nPrice;
				}
				else if(select == 2) {
					System.out.println("Enter stock to update: ");
					nStock = keyboard.nextInt();
					jProducts[i].stock = nStock;
				}
				else if(select == 3) {
					System.out.println("Enter category to update: ");
					nCategory = keyboard.nextLine();
					jProducts[i].category = nCategory;
				}
				isFound = true;
			}
		}
		if(isFound == false) {		//검색한 대상이 없음
			System.out.println("Error: Product==" + modiName + " does not exist");
		}
	}
	
	/**
	 * @brief 지정한 상품 제거
	 */
	public void deleteProduct() {
		System.out.println("Enter product name to delete: ");
		
		Scanner keyboard = new Scanner(System.in);
		String delName = keyboard.nextLine();

		int delIndex = -1;

		for(int i = 0; i < numOfProducts; i++) {
			if(delName.compareTo(jProducts[i].pName) == 0) {
				jProducts[i] = null;
				delIndex = i;
				numOfProducts--;
			}
		}

		if(delIndex == -1) {		//검색한 정보가 없음
			System.out.println("Error: Product==" + delName + " does not exist");
		}
		else {		//정보 삭제 이후의 배열 순서 재확인
			for(int i = delIndex; i < numOfProducts; i++) {
				jProducts[i] = jProducts[i + 1];
			}
			System.out.println(delName + " has been deleted");
		}
	}
}