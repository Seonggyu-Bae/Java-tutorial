import java.util.Scanner;

class HW2_1{
	public static void main(String [] args){
		int a, quo; 
		Scanner s = new Scanner(System.in);
		
		System.out.print("일억미만의 정수: ");
		a = s.nextInt();
		
		quo = a/10000;
		a %=10000; //a = a%10000;
		
		if(quo>1) System.out.format(quo+"만 ");
		else if(quo==1) System.out.format("만 ");
		
		quo = a/1000;
		a %= 1000; 
		
		if(quo>1) System.out.format(quo+"천 ");
		else if(quo==1) System.out.format("천 ");
		
		quo = a/100;
		a %= 100; 
		
		if(quo>1) System.out.format(quo+"백 ");
		else if(quo==1) System.out.format("백 ");
		
		quo = a/10;
		a %=10; 
		
		if(quo>1) System.out.format(quo+"십 ");
		else if(quo==1) System.out.format("십 ");
		
		if(a>0) System.out.println(a+"입니다.");
	}
}