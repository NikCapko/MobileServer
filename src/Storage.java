import java.util.ArrayList;
import java.util.List;

public class Storage {
	public static List<Category> getCategoryList() {
		List<Category> categoryList = new ArrayList<Category>();
		categoryList.add(new Category("1"));
		categoryList.add(new Category("2"));
		categoryList.add(new Category("3"));
		categoryList.add(new Category("4"));
		return categoryList;
	}
}
