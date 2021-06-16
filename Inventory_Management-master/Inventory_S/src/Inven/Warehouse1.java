package Inven;

/**
 * @brief ���� ���� â�� ����
 * @author ����, �̼ҿ�, �赿��, ������
 * @date 2021-06-16 
 * @version 2.0
 */
class Warehouse1 extends Product {
	
	String wareName1;		//child�� â�� �̸� ǥ���ϴ� ���� �߰�
	
	public Warehouse1(String pName, double unitPrice, int stock, String category, String wareName1) {
		super(pName, unitPrice, stock, category);
		this.wareName1 = wareName1;
	}
	
	/**
	 * @brief ���� â���� ��� ���� ���
	 */
	@Override
	public void showAll() {
		super.showAll();		//parent�� �޼ҵ� ȣ��
		System.out.println("Warehouse: " + wareName1);		//child Ŭ������ warehouse1���� �߰��� ������ ���
		System.out.println("");
	}
	
	/**
	 * @brief ��� ������ â���� ��� - ���� â��
	 */
	@Override
	public void showWarehouse1() {
		System.out.println("Product Name: " + pName.toUpperCase());
		System.out.println("Price(each): " + unitPrice);
		System.out.println("Stock Info: " + stock);
		System.out.println("Category: " + category.toUpperCase());
		System.out.println("Warehouse: " + wareName1);
		System.out.println("");
	}
}
