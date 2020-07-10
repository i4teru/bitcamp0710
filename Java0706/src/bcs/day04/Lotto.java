package bcs.day04;


public class Lotto {

	public static void main(String[] args) {
	
		int[] lt= new int[6];
		
		for(int i=0;i<lt.length;i++) {
			lt[i] = (int)(Math.random()*45)+1;
			for(int j=0;j<lt.length;j++)
				if(lt[i]==lt[j]) i--;
			
		System.out.println(lt);
		
		}
				
				
	}//main end

}//class end
