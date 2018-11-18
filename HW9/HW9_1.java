class HW9_1{
	public static void main(String [] args){
		Subject [] subjectsOfkwons = {new Korean(100), new English(), new Mathematics(), new Science(100) };
		
		Student bae = new Student();
		
		for(Subject s: subjectsOfkwons)
			bae.report(s);
		
	}
}
class Student{
	public void report(Subject s){ 
		System.out.printf("%s 과목의 점수는 %d입니다.\n", s.getClass().getName(), s.getScore());
	}	
}

class Subject{
	private int score;
	
	public Subject(){ 
		this.score = (int)(Math.random()*101);
	}
	
	public Subject(int score){
		this.score = score;
	}
	
	public int getScore(){
		return score;
	}
}
class Korean extends Subject{
	 
	
	public Korean(){
		
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
