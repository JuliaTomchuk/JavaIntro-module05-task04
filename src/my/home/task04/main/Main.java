package my.home.task04.main;

import my.home.task04.controller.impl.CaveController;

/*������� ���������, ����������� ������������ �������� � 100 ���������� � ������ �������.
 * ����������� ����������� ��������� ��������, ������ ������ ������ �� ��������� ��������� � ����� �������� �� �������� �����.
*/
public class Main {

	public static void main(String args[]) {

		CaveController controller = new CaveController();

		controller.doAction("view all treasures");

		controller.doAction("get the most expensive treasure");

		controller.doAction("get treasures for amount,500");

	}
}