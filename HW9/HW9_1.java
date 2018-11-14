public class HW9_1{
	public static void main(String [] args){
		Animal animal[]={new Cat(), new Dolphin(), new Dove()};
		for(Animal a: animal) a.move();
	}
}

class Animal{
	public Animal(){
	}
	
	public void move(){
		System.out.printf("나는 %s이고, ", this.getClass().getName());
	}
}
class Cat extends Animal{
	public Cat(){
	}
	@Override
	public void move(){
		super.move();
		System.out.println("달립니다.");
	}
	
}
class Dolphin extends Animal{
	public Dolphin(){
	}
	
	@Override
	public void move(){
		super.move();
		System.out.println("수영합니다.");
	}
	
}
class Dove extends Animal{
	public Dove(){
	}
	
	@Override
	public void move(){
		super.move();
		System.out.println("날아다닙니다.");
	}
	
}