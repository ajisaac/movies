package co.aisaac.letterboxd;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		String token = new Login().authorize();
	}
}
