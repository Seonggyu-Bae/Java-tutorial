import java.util.Scanner;

class HW4_3{
	public static void main(String [] args){
		int year, month, date, before; 
		int beforeYear, beforeMonth, beforeDate;
		Scanner s = new Scanner(System.in);
		
		System.out.print("오늘 년도: ");
		year = s.nextInt();
		System.out.print("오늘 월: ");
		month = s.nextInt();
		System.out.print("오늘 일: ");
		date = s.nextInt();
		
		while(true){
			System.out.print("며칠 전: ");
			before = s.nextInt();
			if(before>0) break;
			System.out.println("[입력오류]양수로 입력해주세요. ");
		}
		beforeDate = -before + date;  
		beforeMonth = month;
		beforeYear = year; 
		
		while(beforeDate<=0){ 
			if(beforeMonth==1){
				beforeYear--;
				beforeMonth = 12;
			}
			else beforeMonth--;
			
			switch(beforeMonth){
			case 1: case 3: case 5: case 7: case 8: case 10:  case 12: 
				beforeDate += 31;
				break;
			case 4: case 6: case 9: case 11: 
				beforeDate += 30;
				break;
			case 2: 
				if(((beforeYear%4==0)&&(beforeYear%100!=0))||(beforeYear%400==0)) beforeDate += 29;
				else beforeDate += 28;
			}
		}
		
		System.out.format("%d일 전의 날짜: %d년 %d월 %d일\n", before, beforeYear, beforeMonth, beforeDate);
		
	}
}
