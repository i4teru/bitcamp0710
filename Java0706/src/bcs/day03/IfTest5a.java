package bcs.day03;

public class IfTest5a { //단일if제어문 최대숫자 
  public static void main(String[] args) {
	  int a=5,b=9,c=12;
	  int temp=0; //빈컵역할
	  //if if if 단일if제어문대신 다중if제어문으로 변경
	  
	  if(a>b) {temp=a;}
	  if(b>a) {temp=b;}
	  if(c>temp){ temp=c;}
	  System.out.println(a+" "+b +" "+c);
	  System.out.println("최대값 = " + temp);
  }
}//class END
