package my.home.task04.presentation.impl;

public final class PresentationProvider {

	private static final PresentationProvider instance = new PresentationProvider();

	private CaveViewerImpl caveViewerImpl = new CaveViewerImpl();

	private PresentationProvider() {
	}

	public static PresentationProvider getInstance() {
		return instance;
	}

	public CaveViewerImpl getCaveViewerImpl() {
		return caveViewerImpl;
	}

}
