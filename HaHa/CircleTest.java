import java.util.Scanner;
import java.io.*;

public class CircleTest{
	public static void main(String [] args){		
		int radius, i=0;
		double area, calArea;
		final double PI = 3.14;
				
		if(args.length!=1){
			System.out.println("사용법: java CircleTest 결과가저장될파일");
			return;
		}
		
		File input = new File("원의 반지름과 넓이.java");
		if(input.exists()==false){
			System.out.println("원의 반지름과 넓이.java 파일이 존재하지 않습니다. 확인해주세요.");
			return;
		}
		
		File output = new File(args[0]);
		if(output.exists()){
			System.out.println(args[0]+" 파일이 이미 존재합니다. 새로운 파일명을 입력해주세요. ");
			return;
		}
		
		try{
			Scanner s = new Scanner(input);
			PrintWriter pw = new PrintWriter(output);
			
			while(s.hasNext()){
				i++;
				radius = s.nextInt();
				area = s.nextDouble();
				calArea = radius*radius*PI; 
				if(area==calArea) pw.printf("%d번째 원의 넓이는 제대로 구해졌습니다: 반지름(%d), 넓이(%.2f)\n", i, radius, area);
				else pw.printf("%d번째 원의 넓이는 잘못 구했습니다: 반지름이 %d일 경우 넓이는 %.2f가 아니라 %.2f입니다. \n", i, radius, area, calArea);
			}
			
			s.close();
			pw.close();
			
		}catch(FileNotFoundException e){
			System.out.println("파일 읽기 또는 쓰기에 실패했습니다. ");
			return;
		}
		
		System.out.println("소스파일이 위치한 폴더에 결과 파일이 생성되었습니다. 확인해보세요. ");
		
	}
}