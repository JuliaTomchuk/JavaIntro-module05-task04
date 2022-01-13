package my.home.task04.service;

import my.home.task04.entity.Cave;
import my.home.task04.service.impl.ServiceException;

public interface CaveService {

	Cave getMostExpensiveTreasure() throws ServiceException;

	Cave getAllSortedTreasure() throws ServiceException;

	Cave getTreasuresForAmount(double amount) throws ServiceException;

}
