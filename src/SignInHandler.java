import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class SignInHandler implements HttpHandler {
	@Override
	public void handle(HttpExchange t) throws IOException {
		if (t.getRequestMethod().equalsIgnoreCase("POST")) {
			OutputStream out = t.getResponseBody();
			 String resp = "hello";
			MobileServer.writeResponse(t, resp.toString());
		} else {
			StringBuilder resp = new StringBuilder();
			MobileServer.writeResponse(t, resp.toString());
		}
	}
}
