import java.util.Scanner;

class HW2_4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int score;
		
		
		System.out.print("점수: ");
		score = s.nextInt();
		
		if(score>100|| score <0) System.out.println("잘못된 점수입니다. ");
		else if(score>=90) System.out.println("수");
		else if(score>=80) System.out.println("우");  /*
		else if(80<=score<90)는 불가능합니다. 
		else if(score>=80&& score<90)과 같이 쓸수는 있지만
		14번째 라인까지 왔다는 말은 90점을 넘지 않았다는 말이기 때문에 
		score<90는 생략 가능합니다!
		*/
		else if(score>=70) System.out.println("미");
		else if(score>=60) System.out.println("양");
		else System.out.println("가");
	}
}