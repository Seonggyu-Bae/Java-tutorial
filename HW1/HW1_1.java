import java.util.Scanner;

class HW1_1{
	public static void main(String [] args){
		int a;
		int b;
		
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 양의 정수 : ");
		a = s.nextInt();
		System.out.print("두번째 양의 정수 : ");
		b = s.nextInt();
	
		System.out.printf("\n%-11s|%-11s|%-11s|%-11s|\n", "number","decimal","otcal","hexadecimal");
		System.out.printf("%-11s|%+11d|%#11o|%#11x|\n", "number 1",a,a,a);
		System.out.printf("%-11s|%+11d|%#11o|%#11x|\n", "number 2",b,b,b);
		System.out.printf("%-11s|%+-11d|%-#11o|%-#11x|\n", "sum",a+b,a+b,a+b);
		
		//또는 
		/* 
		System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n", "number 1",a);
		System.out.printf("%-11s|%2$+11d|%2$#11o|%2$#11x|\n", "number 2",b);
		System.out.printf("%-11s|%2$+-11d|%2$-#11o|%2$-#11x|\n", "sum",a+b);
		
		*/
	}
}