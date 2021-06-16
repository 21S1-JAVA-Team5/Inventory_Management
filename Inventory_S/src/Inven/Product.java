package Inven;

/**
 * @brief 재고 물품 정보 클래스
 * @author 김상민, 이소영, 김동현, 안현진
 * @date 2021-06-16 
 * @version 2.0
 */
public class Product {
	
	String pName;	//제품 이름
	double unitPrice;		//개당 가격
	int stock;				//재고 수량
	String category;		//물품 분류
	
	public Product(String pName, double unitPrice, int stock, String category) {
		this.pName = pName;
		this.unitPrice = unitPrice;
		this.stock = stock;
		this.category = category;
	}
	
	/**
	 * @brief 기본 재고 정보 출력
	 */
	public void showAll() {
		System.out.println("Product Name: " + this.pName.toUpperCase());
		System.out.println("Price(each): " + this.unitPrice);
		System.out.println("Stock Info: " + this.stock);
		System.out.println("Category: " + this.category.toUpperCase());
	}

	/**
	 * @brief 재고 정보를 창고별로 출력 - 서울 창고
	 */
	public void showWarehouse1() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @brief 재고 정보를 창고별로 출력 - 인천 창고
	 */
	public void showWarehouse2() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @brief 재고 정보를 창고별로 출력 - 경기 창고
	 */
	public void showWarehouse3() {
		// TODO Auto-generated method stub
		
	}
}


//체크완료