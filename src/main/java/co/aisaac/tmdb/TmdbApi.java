package co.aisaac.tmdb;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TmdbApi {

	public void accountInformation() {
		try (HttpClient httpClient = HttpClient.newHttpClient()) {
			HttpRequest request = HttpRequest.newBuilder()
					.header("accept", "application/json")
					.method("GET", HttpRequest.BodyPublishers.noBody())
					.build();
			HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
