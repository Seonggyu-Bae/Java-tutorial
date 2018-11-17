import java.util.Scanner;
class Gugudan{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int col;
		System.out.print("몇 열씩?? ");
		col=s.nextInt();
		
		for(int i=0; col*i<8;i++){ 
			for(int j=1; j<=9; j++){
				for(int k=2+col*i; k<2+col*(i+1);k++){
					if(k<=9)	System.out.printf("%d X %d = %2d\t", k, j, k*j);
				}
				System.out.println();
			}
			for(int j = 0; j<col; j++) System.out.print("-----------------");
			System.out.println("\n");
				
		}
		
	}
}
