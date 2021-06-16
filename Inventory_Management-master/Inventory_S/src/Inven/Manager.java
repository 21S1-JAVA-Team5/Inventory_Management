package Inven;

import java.util.Scanner;

/**
 * @brief ����� ���, ����, ���� �� ��κ��� ����� ����
 * @author ����, �̼ҿ�, �赿��, ������
 * @date 2021-06-16 
 * @version 2.0
 */
public class Manager {
	private Product[] jProducts;
	private int numOfProducts;

	public Manager(int num) {		//��ǰ ������ ������ �迭 ����
		this.jProducts = new Product[num];
		numOfProducts = 0;
	}

	/**
	 * @brief ��ǰ ���� ���
	 */
	public void addProduct() {
		
		Scanner keyboard = new Scanner(System.in);

		String jPName;			//��ǰ �̸�
		double jUnitPrice;		//���� ����
		int jStock;				//��� ����
		String jCategory;		//��ǰ �з�
		String jWareName1;		//���� â��
		String jWareName2;		//��õ â��
		String jWareName3;		//��� â��

		//�⺻ ��ǰ ���� ���
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

		//��ǰ�� ����Ǵ� â�� ����
		System.out.println("Select Warehouse Location");
		System.out.println("Press [1]-SEOUL Warehouse");
		System.out.println("Press [2]-Incheon Warehouse");
		System.out.println("Press [3]-Gyeonggi Warehouse");
		System.out.println("=============================");
		
		int selectStore = keyboard.nextInt();		//â�� ��ġ

		if (selectStore == 1) {		//���� â�� ���ý�
			System.out.println("You selected SEOUL Storage");
			jWareName1 = "SEOUL Warehouse";		//���� â�� ���
			Warehouse1 seoul = new Warehouse1(jPName, jUnitPrice, jStock, jCategory, jWareName1);
			jProducts[numOfProducts++] = seoul;
		}

		else if (selectStore == 2) {	//��õ â�� ���ý�
			System.out.println("You selected INCHEON Storage");
			jWareName2 = "INCHEON Warehouse";		//���� â�� ���
			Warehouse2 incheon = new Warehouse2(jPName, jUnitPrice, jStock, jCategory, jWareName2);
			jProducts[numOfProducts++] = incheon;
		}

		else if (selectStore == 3) {	//��� â�� ���ý�
			System.out.println("You selected GYEONGGI Storage");
			jWareName3 = "GYEONGGI Warehouse";		//���� â�� ���
			Warehouse3 gyeonggi = new Warehouse3(jPName, jUnitPrice, jStock, jCategory, jWareName3);
			jProducts[numOfProducts++] = gyeonggi;
		}
	}

	/**
	 * @brief ��� â���� ��� ���
	 */
	public void showAll() {
		for(int i = 0; i < numOfProducts; i++) {
			jProducts[i].showAll();
		}
	}

	/**
	 * @brief ������ â���� ��� ���
	 */
	public void showSelect() {
		System.out.println("Select Warehouse Location");
		System.out.println("Press [1]-SEOUL Warehouse");
		System.out.println("Press [2]-INCHEON Warehouse");
		System.out.println("Press [3]-GYEONGGI Warehouse");
		System.out.println("=============================");

		Scanner keyboard = new Scanner(System.in);
		int select = keyboard.nextInt();

		if(select == 1) {		//���� â�� ��ȸ
			System.out.println("==SEOUL Warehouse Information==");

			for(int i = 0; i < numOfProducts; i++) {
				jProducts[i].showWarehouse1();
			}
		}
		else if(select == 2) {		//��õ â�� ��ȸ
			System.out.println("==INCHEON Warehouse Information==");

			for(int i = 0; i < numOfProducts; i++) {
				jProducts[i].showWarehouse2();
			}
		}
		else if(select == 3) {		//��� â�� ��ȸ
			System.out.println("==GYEONGGI Warehouse Information==");

			for(int i = 0; i < numOfProducts; i++) {
				jProducts[i].showWarehouse3();
			}
		}
	}

	/**
	 * @brief Ư�� ��ǰ ��ȸ
	 */
	public void searchProduct() {
		boolean isFound = false;		//���� ���� Ȯ��
		
		System.out.println("Enter product name to find: ");
		
		Scanner keyboard = new Scanner(System.in);
		String searchName = keyboard.nextLine();

		for(int i = 0; i < numOfProducts; i++) {
			if(searchName.compareTo(jProducts[i].pName) == 0) {
				jProducts[i].showAll();

				isFound = true;		//�˻��� ������ ������
			}
		}
		if(isFound == false) {		//�˻��� ������ ����
			System.out.println("Error: Product==" + searchName + " does not exist");
		}
	}

	/**
	 * @brief ������ ��ǰ ����
	 */
	public void modifyProduct() {
		boolean isFound = false;		//���� ���� Ȯ��
		
		System.out.println("Enter product name to modify:");
		
		Scanner keyboard = new Scanner(System.in);
		String modiName = keyboard.nextLine();
		
		for(int i = 0; i < numOfProducts; i++) {
			if(modiName.compareTo(jProducts[i].pName) == 0) {		//�˻��� ��ǰ�� �����Ѵٸ�
				System.out.println("Ready to Modify Product:" + modiName);
				System.out.println("Press [1]-Modify Price");
				System.out.println("Press [2]-Modify Stock");
				System.out.println("Press [3]-Modify Category");
				
				int select = keyboard.nextInt();
				double nPrice;		//������ ����
				int nStock;			//������ ��� ����
				String nCategory;	//������ ī�װ�
				
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
		if(isFound == false) {		//�˻��� ����� ����
			System.out.println("Error: Product==" + modiName + " does not exist");
		}
	}
	
	/**
	 * @brief ������ ��ǰ ����
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

		if(delIndex == -1) {		//�˻��� ������ ����
			System.out.println("Error: Product==" + delName + " does not exist");
		}
		else {		//���� ���� ������ �迭 ���� ��Ȯ��
			for(int i = delIndex; i < numOfProducts; i++) {
				jProducts[i] = jProducts[i + 1];
			}
			System.out.println(delName + " has been deleted");
		}
	}
}