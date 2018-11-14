class Elevator{
	//필드
	int floor;
	boolean isOpen;
	
	//메소드
	void open(){
		System.out.println("문이 열립니다.");
		isOpen = true;
	}
	
	void close(){
		System.out.println("문이 닫힙니다.");
		isOpen = false;
	}
	
	void move(int n){
		close();//문을 닫고

		if(n>=-2&&n<=10){//n이 유효한 값일 경우 n층으로 이동	
			try{
				Thread.sleep(200*Math.abs(floor-n));
			}catch(Exception e){
				e.printStackTrace();
			}
			if(n ==0)	System.out.println("로비층으로 이동합니다.");
			else if(n >0) System.out.println(n+"층으로 이동합니다.");
			else  System.out.println("지하"+(-1*n)+"층으로 이동합니다.");
			floor = n;
		}
		else{//n이 유효하지 않은 값인 경우 오류 메시지 출력 후 메소드 종료
			System.out.println(n+"층은 없습니다. 층을 다시 입력해주세요. ");
			return;
		}
		//이 라인까지 왔다는 말은 유효한 층을 입력했다는 말이므로 
		report();//도착 후 현재 층 표시
		
		open();//문 열기
	}
	
	void report(){
		if(floor ==0)	System.out.println("로비층입니다.");
		else if(floor>0) System.out.println(floor+"층입니다.");
		else  System.out.println("지하"+(-1*floor)+"층입니다.");
	}
}

class ElevatorTest{
	public static void main(String [] args){
		Elevator e1 = new Elevator();
		Elevator e2 = new Elevator();
		
		e1.move(3);
		// 아래도 주석 풀고 테스트 가능. 
		//e1.report();
		//e2.move(-2);
		//e2.report();
		
	}
}