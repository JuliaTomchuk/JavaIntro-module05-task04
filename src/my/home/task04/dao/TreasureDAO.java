package my.home.task04.dao;

import my.home.task04.dao.impl.DAOException;
import my.home.task04.entity.Cave;

public interface TreasureDAO {

	Cave getCave() throws DAOException;

}
