package Inven;

/**
 * @brief ��� ���� â�� ����
 * @author ����, �̼ҿ�, �赿��, ������
 * @date 2021-06-16 
 * @version 2.0
 */
public class Warehouse3 extends Product {

	String wareName3;		//child�� â�� �̸� ǥ���ϴ� ���� �߰�

	public Warehouse3(String pName, double unitPrice, int stock, String category, String wareName3) {
		super(pName, unitPrice, stock, category);
		this.wareName3 = wareName3;
	}
	
	/**
	 * @brief ��� â�� ��� ���� ���
	 */
	@Override
	public void showAll() {
		super.showAll();		//parent�� �޼ҵ� ȣ��
		System.out.println("Warehouse: " + wareName3);		//child Ŭ������ warehouse3���� �߰��� ������ ���
		System.out.println("");
	}
	
	/**
	 * @brief ��� ������ â���� ��� - ��� â��
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
