package Inven;

/**
 * @brief ��� ��ǰ ���� Ŭ����
 * @author ����, �̼ҿ�, �赿��, ������
 * @date 2021-06-16 
 * @version 2.0
 */
public class Product {
	
	String pName;	//��ǰ �̸�
	double unitPrice;		//���� ����
	int stock;				//��� ����
	String category;		//��ǰ �з�
	
	public Product(String pName, double unitPrice, int stock, String category) {
		this.pName = pName;
		this.unitPrice = unitPrice;
		this.stock = stock;
		this.category = category;
	}
	
	/**
	 * @brief �⺻ ��� ���� ���
	 */
	public void showAll() {
		System.out.println("Product Name: " + this.pName.toUpperCase());
		System.out.println("Price(each): " + this.unitPrice);
		System.out.println("Stock Info: " + this.stock);
		System.out.println("Category: " + this.category.toUpperCase());
	}

	/**
	 * @brief ��� ������ â���� ��� - ���� â��
	 */
	public void showWarehouse1() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @brief ��� ������ â���� ��� - ��õ â��
	 */
	public void showWarehouse2() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @brief ��� ������ â���� ��� - ��� â��
	 */
	public void showWarehouse3() {
		// TODO Auto-generated method stub
		
	}
}


//üũ�Ϸ�