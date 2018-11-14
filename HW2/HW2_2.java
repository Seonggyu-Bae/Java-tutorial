import java.util.Scanner;

class HW2_2{
	public static void main(String [] args){
		int a, abs, quo, res; 
		String sign;
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수: ");
		a = s.nextInt();
		
		if((a & 0b10000000000000000000000000000000)==0){
			abs = a;
			sign = "양수";
		}
		else{
			abs = -a; //abs = ~a+1
			sign = "음수";
		}
		
		
		
		
		/*
			0b10000000000000000000000000000000 이 너무 길기 때문에 
			0x80000000 또는 
			-Math.pow(2, 31)를 쓰는 방법도 있습니다. 
			: 0b10000000000000000000000000000000는 -2의 31승이기 때문입니다. 한번 계산해보세요~~ 
		*/
		/*
			단, -Math.pow(2, 31) 결과는 실수이기 때문에 아래와 같이 int 타입으로 캐스팅(비트연산은 정수형에만 가능하기 때문)해줘야합니다. 
			if((a & -(int)Math.pow(2, 31))==0){
				abs = a;
				sign = "양수";
			}
			else{
				abs = -a; //abs = ~a+1
				sign = "음수";
			}
		*/

		/*
		
		이 방법 외에도 시프트연산자를 사용한다면
		
		
			if((a>>31) == 0)){
				abs = a;
				sign = "양수";
			}
			else{
				abs = -a; //abs = ~a+1
				sign = "음수";
			}
		
		*/
		
		/* 부호확인
			부호는 MSB(MSB:1이면 음수, 0이면 양수)를 통해 알 수 있다. 
			int형은 32비트이므로 최상위 비트가 1인지 여부를 판단하기 위해서는
			입력값을 31비트만큼 오른쪽으로 시프트하고 그 값이 1인지 확인하면 된다. 
			((input>>31)&1)==1 이 참이면 음수, 거짓이면 양수이다. 
			
		*/
		
		
		quo = abs>>2;
		res = abs&0b11;		// 4로 나눈 나머지는 마지막 2비트(0, 1, 2,3 중 하나 )이기 때문에  0b11과 AND 시키면(마지막 2비트만 남음)알아낼 수 있다. 
		
		System.out.format("\"%d는 %s입니다. 이 수의 절댓값은 %d이고,\n", a, sign, abs);
		System.out.format("\t이를 4로 나눈 몫은 %d이고,\n", quo);
		System.out.format("\t\t나머지는 %d입니다.\"\n", res);
		
	}
}