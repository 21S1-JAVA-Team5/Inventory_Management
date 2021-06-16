package Inven;

import java.util.Scanner;

/**
 * @brief ���� �޴� ��
 * @author ����, �̼ҿ�, �赿��, ������
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
		
		Manager manager = new Manager(1000);		//��� ������ ����� �迭 1000���� �ʱ�ȭ
		
		while(true) {
			showMenu();
			
			Scanner keyboard = new Scanner(System.in);
			int select = keyboard.nextInt();
			
			switch(select) {
			case 1:		//��ü ��� ���� ���
				manager.showAll();
				break;
			case 2:		//â���� ��� ���� ���
				manager.showSelect();
				break;
			case 3:		//��ǰ ���� ���
				manager.addProduct();
				break;
			case 4:		//��ϵ� ��ǰ �˻�
				manager.searchProduct();
				break;
			case 5:		//��ϵ� ��ǰ ����
				manager.modifyProduct();
				break;
			case 6:		//��ǰ ����
				manager.deleteProduct();
				break;
			case 7:		//���α׷� ����
				System.out.println("Program Terminated");
				return;
			}
		}
	}
}
