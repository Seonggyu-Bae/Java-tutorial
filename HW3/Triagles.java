import java.util.Scanner;

class Triagles{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int dan;
		
		System.out.print("직각 삼각형 높이: ");
		dan = s.nextInt();
		
		/* //패턴 1
			*
			**
			***
		*/
		
		for(int i=1; i<=dan; i++){
			for(int j=0; j<i; j++) System.out.print("*");
			System.out.println();
		}
		
		
		
		System.out.println();
		/* //패턴 2
			  *
			 **
			***
		*/
		/**/
		for(int i=1; i<=dan; i++){
			for(int j=0; j<dan-i; j++) System.out.print(" ");
			for(int j=0; j<i; j++) System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		/* //패턴 3  
			***
			**
			*
		*/
		/**/
		for(int i=1; i<=dan; i++){
			for(int j=0; j<dan+1-i; j++) System.out.print("*");
			System.out.println();
		}
		
		
		System.out.println();
		/* //패턴 4
			  *
			 ***
			*****
		*/
		/**/
		for(int i=1; i<=dan; i++){
			for(int j=0; j<dan-i; j++) System.out.print(" ");
			for(int j=0; j<2*i-1; j++) System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		/* //패턴 5  
			***
			 **
			  *
		*/
		/**/
		for(int i=1; i<=dan; i++){
			for(int j=0; j<i-1; j++) System.out.print(" ");
			for(int j=0; j<dan+1-i; j++) System.out.print("*");
			System.out.println();
		}
		
		
		
	}
}