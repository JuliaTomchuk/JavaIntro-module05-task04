package my.home.task04.service.impl;

import java.util.Collections;

import my.home.task04.dao.impl.DAOException;
import my.home.task04.dao.impl.DAOprovider;
import my.home.task04.entity.Cave;
import my.home.task04.entity.Treasure;
import my.home.task04.service.CaveService;

public class CaveServiceImpl implements CaveService {

	private DAOprovider daoProvider = DAOprovider.getInstance();

	@Override
	public Cave getMostExpensiveTreasure() throws ServiceException {
		Cave cave;
		try {
			cave = daoProvider.getTreasureDao().getCave();
		} catch (DAOException e) {
			throw new ServiceException();
		}

		Treasure theMostExpensiceTreasure = cave.getTreasure(0);

		for (int i = 0; i < cave.getTreasures().size(); i++) {

			if (theMostExpensiceTreasure.getPrice() < cave.getTreasure(i).getPrice()) {

				theMostExpensiceTreasure = cave.getTreasure(i);
			}

		}

		Cave result = new Cave();
		result.addTreasure(theMostExpensiceTreasure);

		return result;

	}

	@Override
	public Cave getTreasuresForAmount(double amount) throws ServiceException {

		Cave cave;
		Cave newCave = new Cave();
		double price = 0;
		try {
			cave = daoProvider.getTreasureDao().getCave();
		} catch (DAOException e) {
			throw new ServiceException();
		}

		double cheapestTreasure = findTheCheapestTreasure(cave);
		if (amount < cheapestTreasure) {

			return new Cave();

		} else if (getTotalPrice(cave) <= amount) {

			return cave;
		}

		else {

			Collections.sort(cave.getTreasures());
			price = 0;
			int i = 0;
			for (; i < cave.getTreasures().size(); i++) {

				if (price < amount) {

					newCave.addTreasure(cave.getTreasure(i));
					price += cave.getTreasure(i).getPrice();
				}
			}

			i = 0;

			while (price > amount && i < newCave.getTreasures().size()) {

				newCave.getTreasures().remove(i);
				price -= newCave.getTreasure(i).getPrice();

				i++;

			}

		}

		return newCave;
	}

	private double getTotalPrice(Cave cave) {
		double result = 0;
		for (int i = 0; i < cave.getTreasures().size(); i++) {
			result += cave.getTreasure(i).getPrice();

		}

		return result;

	}

	private double findTheCheapestTreasure(Cave cave) {
		double result = cave.getTreasure(0).getPrice();

		for (int i = 0; i < cave.getTreasures().size(); i++) {
			if (result > cave.getTreasure(i).getPrice()) {
				result = cave.getTreasure(i).getPrice();
			}
		}

		return result;
	}

	@Override
	public Cave getAllSortedTreasure() throws ServiceException {
		Cave cave;
		try {
			cave = daoProvider.getTreasureDao().getCave();
		} catch (DAOException e) {
			throw new ServiceException();
		}
		Collections.sort(cave.getTreasures());

		return cave;
	}

}
