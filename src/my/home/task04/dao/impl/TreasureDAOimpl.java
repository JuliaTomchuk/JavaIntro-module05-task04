package my.home.task04.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import my.home.task04.dao.TreasureDAO;
import my.home.task04.entity.Cave;
import my.home.task04.entity.Treasure;

public class TreasureDAOimpl implements TreasureDAO {

	@Override
	public Cave getCave() throws DAOException {
		Cave cave = new Cave();

		String path = System.getProperty("user.dir") + "\\source\\Cave.csv";

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

			String line;

			while ((line = reader.readLine()) != null) {

				String[] temp = line.split(",");
				cave.addTreasure(new Treasure(temp[0], Double.valueOf(temp[1])));
			}
		} catch (IOException e) {
			throw new DAOException();

		}

		return cave;
	}

}
