package my.home.task04.controller.impl;

import my.home.task04.controller.Command;
import my.home.task04.controller.Controller;
import my.home.task04.entity.Cave;
import my.home.task04.presentation.impl.PresentationProvider;
import my.home.task04.service.impl.ServiceException;

public class CaveController implements Controller {

	private static final CommandProvider commandProvider = new CommandProvider();

	private PresentationProvider presentationProvider = PresentationProvider.getInstance();

	@Override
	public void doAction(String request) {

		String[] temp = request.split("\\s*,\\s*");

		Command currentCommand = commandProvider.getCommand(temp[0]);
		Cave cave = new Cave();
		try {
			cave = currentCommand.execute(request);
		} catch (ServiceException e) {

			e.printStackTrace();
			presentationProvider.getCaveViewerImpl().errorMessage();
		}

		presentationProvider.getCaveViewerImpl().viewCave(cave);

	}
}
