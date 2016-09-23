package bo;

import dao.CategoryDAO;

public class CategoryBO {
	private CategoryDAO mCategoryDAO;

	public CategoryBO() {
		super();
		mCategoryDAO = new CategoryDAO();
	}

}
