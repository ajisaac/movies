package co.aisaac.letterboxd;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.net.URIBuilder;

import java.io.IOException;
import java.net.URISyntaxException;

public class Login {
	String endpoint = "https://api.letterboxd.com/api/v0/auth/authorize";

	/**
	 * Gets an auth token for future requests.
	 */
	public String authorize() {

		try (CloseableHttpClient client = HttpClients.createDefault()) {
			URIBuilder builder = new URIBuilder(endpoint);
			ClassicHttpRequest request = new HttpGet(builder.build());

			client.execute(request, response -> {
				System.out.println(response.getCode() + " " + response.getReasonPhrase());
				System.out.println(response.getEntity().getContent());
				return null;
			});

		} catch (IOException | URISyntaxException e) {
			throw new RuntimeException(e);
		}
		return null;

	}

}
