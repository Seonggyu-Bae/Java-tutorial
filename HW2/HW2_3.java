import java.util.Scanner;

class HW2_3{
	public static void main(String [] args){
		double x1, y1, x2, y2; //각 점의 x,y 좌표들
		double width, height;  //가로, 세로
		Scanner s = new Scanner(System.in);
		
		System.out.print("점1의 x좌표: ");
		x1 = s.nextDouble();
		System.out.print("점1의 y좌표: ");
		y1 = s.nextDouble();
		
		System.out.print("점2의 x좌표: ");
		x2 = s.nextDouble();
		System.out.print("점2의 y좌표: ");
		y2 = s.nextDouble();
		
		width = x1>x2? x1-x2: x2-x1;
		height = y1>y2? y1-y2: y2-y1;
		
		if((width==0)||(height==0))	System.out.println("직사각형이 아닙니다.");//가로나 세로가 0이면 직사각형이 아니라고 출력
		else{
			System.out.format("둘레의 길이: %.2f\n", 2*(width+height));
			System.out.format("넓이: %.2f\n",width*height);
		}
	}
}