import java.io.IOException;
import java.util.List;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class CategoriesHandler implements HttpHandler {
	@Override
	public void handle(HttpExchange t) throws IOException {
		if (t.getRequestMethod().equalsIgnoreCase("GET")) {
			List<Category> list = Storage.getCategoryList();
			String resp = MobileServer.getJsonArray(list);
			MobileServer.writeResponse(t, resp.toString());
		} else {
			StringBuilder resp = new StringBuilder();
			MobileServer.writeResponse(t, resp.toString());
		}
	}
}
