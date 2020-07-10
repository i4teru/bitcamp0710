package bcs.day03;

public class IfTest6 {

	public static void main(String[] args) {
		//문제) 아래와 같이 세개의 수가 주어졌을 때, 작은 순서대로 출력되도록 코드를 완성하세요. 
		int a=2,b=7,c=6; //2 6 7 
		  if(a<b && a<c){
			  if(b<c) {System.out.println();}  
			  else { } 
		  }else if(b<c){
		    if(a<c){ } 
		    else { } 
		  }else{ 
			if(a<b) { } 
			else { }
		  }

	}

}
