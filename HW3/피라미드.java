import java.util.Scanner;

class �Ƕ�̵�{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		int line;
		System.out.print("����� �� ��(10������ ���� ����): ");	
		line = s.nextInt();	
		for(int i=0;i<line;i++){
			for(int j=line-1-i;j>0;j--){
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--){
				System.out.print(j);
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}