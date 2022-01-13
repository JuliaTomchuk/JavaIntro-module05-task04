package my.home.task04.controller;

import my.home.task04.entity.Cave;
import my.home.task04.service.impl.ServiceException;

public interface Command {

	Cave execute(String request) throws ServiceException;

}
