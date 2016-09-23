package bo;

import dao.ImageDAO;

public class ImageBO {
	private ImageDAO mImageDAO;

	public ImageBO() {
		super();
		mImageDAO = new ImageDAO();
	}

}
