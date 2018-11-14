import java.util.Scanner;

class HW3_1{
	public static void main(String [] args){
		double a, b, result;
		String operator;
		Scanner s = new Scanner(System.in);
		
		System.out.print("식을 입력하세요(ex. 7 + 4): ");
		a = s.nextDouble();
		operator = s.next();
		b = s.nextDouble();
		
		switch(operator){
		case "+":
			result = a+b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;
		
		case "-":
			result = a-b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;
			
		case "*":
			result = a*b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;

		
		case "/":
			if(b==0){
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			result = a/b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;	
		
			
		case "%":
			if(b==0){
				System.out.println("0으로 나눈 나머지는 구할 수 없습니다.");
				return;
			}
			result = a%b;
			if(result%1==0) System.out.println((int)result);
			else System.out.println(result);
			break;
		
		default: 
			System.out.println("+, -, *, /, % 연산만 지원합니다. ");
		}
		
	}
}