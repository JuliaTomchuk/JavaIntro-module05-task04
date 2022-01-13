package my.home.task04.controller.impl;

import my.home.task04.controller.Command;
import my.home.task04.entity.Cave;
import my.home.task04.service.impl.ServiceException;
import my.home.task04.service.impl.ServiceProvider;

public class GetTreasuresForAmount implements Command {

	private ServiceProvider provider = ServiceProvider.getInstance();

	@Override
	public Cave execute(String request) throws ServiceException {

		String[] temp = request.split(",");
		double amount = Double.parseDouble(temp[1]);

		return provider.getCaveServiceImpl().getTreasuresForAmount(amount);
	}

}
