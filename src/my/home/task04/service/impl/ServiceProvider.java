package my.home.task04.service.impl;

public final class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();

	private CaveServiceImpl caveServiceImpl = new CaveServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;

	}

	public CaveServiceImpl getCaveServiceImpl() {
		return caveServiceImpl;
	}

}
