import java.util.ArrayList;
import java.util.List;

public class Storage {
	public static List<Category> getCategoryList() {
		List<Category> categoryList = new ArrayList<Category>();
		categoryList.add(new Category(1, "Компьютеры"));
        categoryList.add(new Category(2, "Ноутбуки"));
        categoryList.add(new Category(3, "Планшеты"));
        categoryList.add(new Category(4, "Телефоны"));
		return categoryList;
	}
}
