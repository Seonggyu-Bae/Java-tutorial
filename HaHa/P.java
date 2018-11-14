import java.util.*;
import java.io.*;

class P{
	public static void main(String [] args){
		int radius,i=0;
		double area, calArea;
		final double pi = 3.14;
		
		if(args.length!=1){
			System.out.print("사용법 java CircleTest 결과가저장될파일");
			return;
		}
		File input = new File("원의 반지름과 넓이.java");
		if(!input.exists()){
			System.out.println("원의 반지름과 넓이.java 파일이 존재하지 않습니다. 확인해주세요.");
			return;
		}
		File output = new File(args[0]);
		if(output.exists()){
			System.out.print("그 파일은 이미 존재합니다. 다른 파일명으로 저장합시다.");
			return;
		}
		
		try{
			Scanner s = new Scanner(input);
			PrintWriter p = new PrintWriter(output);
			
			while(s.hasNext()){
				i++;
				radius = s.nextInt();
				area = s.nextDouble();
				calArea= radius*radius*pi;
				if(area==calArea)
					p.printf("%d번째 원의 넓이는 잘 구해졌습니다. 반지름 %d 넓이 %.2f",i,radius,area);
				else
					p.printf("%d번째 원의 넓이는 잘못 구해졌습니다. 반지름 %d 일경우 넓이는 %.2f이 아니라 %.2f ",i,radius,area,calArea);
			}
			p.close();
			s.close();
				
			}catch(FileNotFoundException e){
			System.out.println("파일 읽기 또는 쓰기에 실패했습니다. ");
			return;
	}
}
}