package bcs.day03;

public class GugudanForA {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
		      System.out.print(j+"*"+i+"="+(i*j) + "\t");
			} //j end
			System.out.println(); //단순개행
		}//i end		
	}//end
}//class END
