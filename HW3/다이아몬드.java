import java.util.Scanner;

class 다이아몬드{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		int line;
		
		System.out.print("출력할 줄 수(홀수): ");	
		line = s.nextInt();
			
		for(int i=0;i<=line/2;i++){
			for(int j=line/2-i; j>0;j--){
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<line/2;i++){
			for(int j=0; j<=i;j++){
				System.out.print(" ");
			}
			for(int j=0; j<2*(line/2-i)-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	