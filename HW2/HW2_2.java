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
			abs = -a;
			sign = "음수";
		}
		quo = abs>>2;
		res = abs&0b11;	// 4로 나눈 나머지는 마지막 2비트(0,1,2,3 중 하나)이기 때문에 0b11과 AND 시키면(마지막 2비트만 남음)알아낼 수 있다. 
		
		System.out.format("\"%d는 %s입니다. 이 수의 절댓값은 %d이고,\n", a, sign, abs);
		System.out.format("\t이를 4로 나눈 몫은 %d이고,\n", quo);
		System.out.format("\t\t나머지는 %d입니다.\"\n", res);
		
	}
}
