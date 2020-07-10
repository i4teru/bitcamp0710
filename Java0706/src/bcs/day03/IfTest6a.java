package bcs.day03;

public class IfTest6a {
  public static void main(String[] args) {
	  int a=2,b=7,c=6; //2 6 7 
	  if(a<b && a<c){//a가 제일작은경우
		  if(b<c) {System.out.println(a+" "+b+" "+c+" ");} //a b c 
		  else {System.out.println(a+" "+c+" "+b+" "); } //a c b
	  }else if(b<c){ //b가 제일작은경우
	    if(a<c){ System.out.println(b+" "+a+" "+c+" "); } //b a c
	    else {System.out.println(b+" "+c+" "+a+" "); } //b c a
	  }else{ //c가 제일작은경우
		if(a<b) {System.out.println(c+" "+a+" "+b+" "); }  //c a b 
		else {System.out.println(c+" "+b+" "+a+" "); }//c b a 
	  } 
  }
}//class END
