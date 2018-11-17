class Elevator{
	
	int floor;
	boolean isOpen;
	
	
	void open(){
		System.out.println("문이 열립니다.");
		isOpen = true;
	}
	
	void close(){
		System.out.println("문이 닫힙니다.");
		isOpen = false;
	}
	
	void move(int n){
		close();

		if(n>=-2&&n<=10){
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
		else{
			System.out.println(n+"층은 없습니다. 층을 다시 입력해주세요. ");
			return;
		}
		
		report();
		
		open();
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
