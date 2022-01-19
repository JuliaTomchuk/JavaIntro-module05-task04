package my.home.task04.controller.impl;

import java.util.HashMap;
import java.util.Map;

import my.home.task04.controller.Command;

public final class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();

	CommandProvider() {

		commands.put("view all treasures", new ViewAllTreasureCommand());
		commands.put("get the most expensive treasure", new GetMostExpensiveTreasure());
		commands.put("get treasures for amount", new GetTreasuresForAmount());
	}

	public Command getCommand(String commandName) {

		return commands.get(commandName);
	}
}
