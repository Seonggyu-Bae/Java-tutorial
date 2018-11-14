import java.util.Scanner;

class 피라미드{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		int line;
		System.out.print("출력할 줄 수(10이하의 양의 정수): ");	
		line = s.nextInt();	
		for(int i=0;i<line;i++){
			for(int j=line-1-i;j>0;j--){
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--){
				System.out.print(j);
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}