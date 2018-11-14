import java.util.*;
import java.io.*;

class P{
	public static void main(String [] args){
		int radius,i=0;
		double area, calArea;
		final double pi = 3.14;
		
		if(args.length!=1){
			System.out.print("���� java CircleTest ��������������");
			return;
		}
		File input = new File("���� �������� ����.java");
		if(!input.exists()){
			System.out.println("���� �������� ����.java ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.");
			return;
		}
		File output = new File(args[0]);
		if(output.exists()){
			System.out.print("�� ������ �̹� �����մϴ�. �ٸ� ���ϸ����� �����սô�.");
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
					p.printf("%d��° ���� ���̴� �� ���������ϴ�. ������ %d ���� %.2f",i,radius,area);
				else
					p.printf("%d��° ���� ���̴� �߸� ���������ϴ�. ������ %d �ϰ�� ���̴� %.2f�� �ƴ϶� %.2f ",i,radius,area,calArea);
			}
			p.close();
			s.close();
				
			}catch(FileNotFoundException e){
			System.out.println("���� �б� �Ǵ� ���⿡ �����߽��ϴ�. ");
			return;
	}
}
}