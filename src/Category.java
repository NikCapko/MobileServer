
public class Category {

	public Category(String categoryName) {
		this.categoryName = categoryName;
	}

	private String categoryName;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "categoryName:" + categoryName;
	}
}
