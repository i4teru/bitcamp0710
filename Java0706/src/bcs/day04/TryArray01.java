package bcs.day04;

public class TryArray01 {

	public static void main(String[] args) {

		String[] city = { "¼­¿ï", "µµÄì", "º£ÀÌÂ¡", "´º¿å", "ÇÏ³ëÀÌ" };

		for (int i = 0; i < city.length; i++) {
			System.out.print(city[i] + " ");
		}

		System.out.println();
		for (String temp : city) {
			System.out.print(temp + " ");
		}

	}// main end

}// class end
