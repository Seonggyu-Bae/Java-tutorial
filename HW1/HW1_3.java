import java.util.Scanner;

class HW1_3{
	public static void main(String [] args){
		int randomNumber = (int)(Math.random()*10+20);
		
		System.out.format("생성된 난수는 %d입니다.\n", randomNumber);	
		//format() 메소드는 printf() 메소드와 동일하다고 보심 됩니다. 
		//차이점은 String 클래스에서 제공하고 있는지 정도로 볼 수 있습니다. (나중에 String 클래스 다룰때 다시 설명드리겠습니다. ^____^)
	}
}