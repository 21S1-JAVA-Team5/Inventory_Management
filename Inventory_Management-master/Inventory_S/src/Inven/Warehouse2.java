package Inven;

/**
 * @brief 인천 지역 창고 정보
 * @author 김상민, 이소영, 김동현, 안현진
 * @date 2021-06-16 
 * @version 2.0
 */
public class Warehouse2 extends Product {
	
	String wareName2;		//child에 창고 이름 표시하는 변수 추가
	
	public Warehouse2(String pName, double unitPrice, int stock, String category, String wareName2) {
		super(pName, unitPrice, stock, category);
		this.wareName2 = wareName2;
	}

	/**
	 * @brief 인천 창고의 재고 정보 출력
	 */
	@Override
	public void showAll() {
		super.showAll();		//parent의 메소드 호출
		System.out.println("Warehouse: " + wareName2);		//child 클래스인 warehouse2에서 추가된 데이터 출력
		System.out.println("");
	}
	
	/**
	 * @brief 재고 정보를 창고별로 출력 - 인천 창고
	 */
	@Override
	public void showWarehouse2() {
		System.out.println("Product Name: " + pName.toUpperCase());
		System.out.println("Price(each): " + unitPrice);
		System.out.println("Stock Info: " + stock);
		System.out.println("Category: " + category.toUpperCase());
		System.out.println("Warehouse: " + wareName2);
		System.out.println("");
	}
}
