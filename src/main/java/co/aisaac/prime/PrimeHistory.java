package co.aisaac.prime;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;

public class PrimeHistory {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("data/prime-history.csv");

		// parse file into array of text, deduping titles
		List<String> titles = new HashSet<>(Files.readAllLines(p)).stream().sorted().toList();

		for (String title : titles) {
			URI uri = URI.create("https://letterboxd.com/search/" + URLEncoder.encode(title, StandardCharsets.UTF_8));
			System.out.println(uri);
		}
	}
}
