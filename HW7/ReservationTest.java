import java.util.Scanner;

class ReservationTest{
	static Scanner s = new Scanner(System.in);
	public static void main(String [] args){
		boolean [][] seats = new boolean[10][10];
		initSeats(seats);
		showSeats(seats);
		char reservation;
		while(true){
			System.out.print("예약하시겠습니까(Y,y/N,n)?");
			reservation = s.next().charAt(0);
			if(reservation=='Y'||reservation=='y') reserve(seats);
			else if(reservation=='N'||reservation=='n'){
				System.out.println("예약시스템을 종료합니다.");
				break;
			}
			else System.out.println("Y(y) 또는 N(n)으로 입력해주세요.");			
		}
	}
	
	public static void initSeats(boolean [][] seats){
		int x;
		for(int i=0; i<seats.length; i++){
			for(int j=0; j<seats[i].length; j++){
				x = (int)(Math.random()*2);
				if(x==0) seats[i][j] = false;
				else seats[i][j] = true;
			}
		}
	}

	public static void showSeats(boolean [][] seats){
		System.out.printf("  ");
		for(int i=0; i<seats[0].length; i++) System.out.printf("%2d ", i+1);
		System.out.println();
		for(int i=0; i<seats.length; i++){
			System.out.printf("%c ", i+'a');
			for(int j=0; j<seats[i].length; j++){
				if(seats[i][j]==true) System.out.printf(" X ");
				else System.out.print("   ");
			}
			System.out.println();
		}
	}

	public static void reserve(boolean [][] seats){
		int row, col;
		char tmp;
		while(true){
			while(true){
				System.out.print("몇 행? ");
				tmp = s.next().toLowerCase().charAt(0);//사용자가 입력한 문자열을 소문자로 모두 바꾼 후 첫번째 문자만 취해서 tmp에 저장
				if(tmp>='a'&&tmp<='j') break;
				System.out.println("행은 a부터 j까지의 영문자로 입력해주세요.");
			}
			
			row = (int)(tmp-'a');
			
			while(true){
				System.out.print("몇 열? ");
				col = s.nextInt();
				if(col>=1&&col<=seats.length) break;
				System.out.printf("열은 1부터 %d까지의 정수로 입력해주세요.\n", seats.length);
			}
			
			if(seats[row][col-1]==false){
				seats[row][col-1] = true;
				System.out.printf("%c행 %d열 예약에 성공하였습니다.\n", tmp, col);
				showSeats(seats);
				break;
			}else{
				System.out.println("이미 예약된 좌석입니다. 다른 좌석을 선택하세요.");
			}
		}
	}
}