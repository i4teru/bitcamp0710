package bcs.test;

public class StringTest {

	public static void main(String[] args) {
		System.out.println("Hello "
				+ "World");
		System.out.println("Hello \nWorld");
		System.out.println("Hello \"World\"");
		System.out.println("Hello 'world'");
		System.out.println("Hello world".length()); 
		System.out.println("Hello world ... bye".replace("world", "class"));
	}

}
