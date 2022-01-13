package my.home.task04.dao.impl;

import my.home.task04.dao.TreasureDAO;

public final class DAOprovider {

	private static final DAOprovider instance = new DAOprovider();

	private TreasureDAO treasureDao = new TreasureDAOimpl();

	private DAOprovider() {
	}

	public static DAOprovider getInstance() {
		return instance;
	}

	public TreasureDAO getTreasureDao() {
		return treasureDao;
	}

}
