package my.home.task04.dao.impl;

public class DAOException extends Exception {

	private static final long serialVersionUID = 325689852052466999L;

	public DAOException() {
		super();
	}

	public DAOException(Exception e) {
		super(e);
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Exception e, String message) {
		super(message, e);
	}

}
