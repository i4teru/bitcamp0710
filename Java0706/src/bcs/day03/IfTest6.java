package bcs.day03;

public class IfTest6 {

	public static void main(String[] args) {
		//����) �Ʒ��� ���� ������ ���� �־����� ��, ���� ������� ��µǵ��� �ڵ带 �ϼ��ϼ���. 
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
