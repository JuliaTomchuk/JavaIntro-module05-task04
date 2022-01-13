package my.home.task04.main;

import my.home.task04.controller.impl.CaveController;

/*Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбора самого дорого по стоимости сокровища и выбор сокровищ на заданную сумму
 */
public class Main {

	public static void main(String args[]) {

		CaveController controller = new CaveController();

		controller.doAction("view all treasures");

		controller.doAction("get the most expensive treasure");

		controller.doAction("get treasures for amount,500");

	}
}
