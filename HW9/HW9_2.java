class HW9_2{
	public static void main(String [] args){
		Subject [] subjectsOfkwons = {new Korean(100), new English(), new Mathematics(), new Science(100) };// 상속의 장점1: 여러 클래스를 하나의 배열로 그룹화 가능!!
		//국어와 과학 과목은 100점으로, 영어, 수학 과목은 랜덤한 점수로 생성
		
		Student kwon = new Student();
		//학생 한명 생성 
		for(Subject s: subjectsOfkwons)
			kwon.report(s);
		
	}
}
class Student{
	public void report(Subject s){//상속의 장점2: 각 과목에 대한 report()메소드를 만들지 않아도 됨.
	//	단지 모든 과목의 부모 클래스인 Subject 클래스를 매개변수로 받는 메소드 하나만 만들면 됨. 
		System.out.printf("%s 과목의 점수는 %d입니다.\n", s.getClass().getName(), s.getScore());
	}	
}

class Subject{//과목
	private int score;//private 필드 점수 
	
	public Subject(){ //점수를 지정하지 않고 과목을 생성할 경우 점수를 랜덤하게 설정
		this.score = (int)(Math.random()*101);
	}
	
	public Subject(int score){//점수를 지정하여 과목을 생성할 경우 점수 필드를 해당 점수로 설정
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}
}
class Korean extends Subject{
	//엄밀히 말하면 부모클래스인 Subject의 private 필드 score를 물려받긴 하지만 getter를 통해 접근 할 수 있음. 
	
	public Korean(){
		//super();//생략 가능. 어짜피 부모클래스의 생성자를 호출 하지 않을 경우 디폴트 생성자를 호출하므로. 
	}
	
	public Korean(int score){
		super(score);
	}
}
class English extends Subject{
	
	public English(){
	}
	
	public English(int score){
		super(score);
	}
}
class Mathematics extends Subject{
	
	public Mathematics(){
	}
	
	public Mathematics(int score){
		super(score);
	}
}
class Science extends Subject{
	
	public Science(){
	}
	
	public Science(int score){
		super(score);
	}
}