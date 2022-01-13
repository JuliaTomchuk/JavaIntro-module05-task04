package my.home.task04.service.impl;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -4596803283700617299L;

	public ServiceException() {
		super();
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}

}
