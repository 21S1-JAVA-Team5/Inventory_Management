package Inven;

/**
 * @brief ��õ ���� â�� ����
 * @author ����, �̼ҿ�, �赿��, ������
 * @date 2021-06-16 
 * @version 2.0
 */
public class Warehouse2 extends Product {
	
	String wareName2;		//child�� â�� �̸� ǥ���ϴ� ���� �߰�
	
	public Warehouse2(String pName, double unitPrice, int stock, String category, String wareName2) {
		super(pName, unitPrice, stock, category);
		this.wareName2 = wareName2;
	}

	/**
	 * @brief ��õ â���� ��� ���� ���
	 */
	@Override
	public void showAll() {
		super.showAll();		//parent�� �޼ҵ� ȣ��
		System.out.println("Warehouse: " + wareName2);		//child Ŭ������ warehouse2���� �߰��� ������ ���
		System.out.println("");
	}
	
	/**
	 * @brief ��� ������ â���� ��� - ��õ â��
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
