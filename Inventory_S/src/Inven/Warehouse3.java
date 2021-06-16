package Inven;

/**
 * @brief 경기 지역 창고 정보
 * @author 김상민, 이소영, 김동현, 안현진
 * @date 2021-06-16 
 * @version 2.0
 */
public class Warehouse3 extends Product {

	String wareName3;		//child에 창고 이름 표시하는 변수 추가

	public Warehouse3(String pName, double unitPrice, int stock, String category, String wareName3) {
		super(pName, unitPrice, stock, category);
		this.wareName3 = wareName3;
	}
	
	/**
	 * @brief 경기 창고 재고 정보 출력
	 */
	@Override
	public void showAll() {
		super.showAll();		//parent의 메소드 호출
		System.out.println("Warehouse: " + wareName3);		//child 클래스인 warehouse3에서 추가된 데이터 출력
		System.out.println("");
	}
	
	/**
	 * @brief 재고 정보를 창고별로 출력 - 경기 창고
	 */
	@Override
	public void showWarehouse3() {
		System.out.println("Product Name: " + pName.toUpperCase());
		System.out.println("Price(each): " + unitPrice);
		System.out.println("Stock Info: " + stock);
		System.out.println("Category: " + category.toUpperCase());
		System.out.println("Warehouse: " + wareName3);
		System.out.println("");
	}
	
}
