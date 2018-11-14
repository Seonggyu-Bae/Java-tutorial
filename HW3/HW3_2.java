import java.util.Scanner;

public class HW3_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i, input, sum = 0;
		
		System.out.print("1보다 큰 정수를 입력하세요: ");
		input = s.nextInt();
		
		for(i=1; i<=input; i++){
			if(i%2==0){
				System.out.printf(" %d²+", i);
				sum -= i*i;
			}else{
				System.out.printf(" %d²-", i);				
				sum += i*i;
			}
		}
		System.out.printf("\b= %d\n",sum);// \b는 커서를 한칸 앞으로 이동
	}
}
