package my.home.task04.presentation.impl;

import my.home.task04.entity.Cave;
import my.home.task04.entity.Treasure;
import my.home.task04.presentation.CaveViewer;

public class CaveViewerImpl implements CaveViewer {

	@Override
	public void viewCave(Cave cave) {

		if (cave.getTreasures().isEmpty()) {

			errorMessage();

		} else {

			for (Treasure e : cave.getTreasures()) {
				System.out.println(e);

			}

			System.out.println("Your request has been successfully completed");
		}

	}

	@Override
	public void errorMessage() {

		System.out.println("Something went wrong");
	}

}
