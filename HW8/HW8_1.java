class Figure{
	protected double perimeter;	
	protected double area;	
	public Figure(){} 
	public Figure(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
	}
	public String toString(){	
		return String.format("이 도형은 %s이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n", this.getClass().getName(), perimeter, area); 
	}
}

class Circle extends Figure{
	protected double radius;
	public Circle(){ 
		this(1);
	}
	public Circle(double r){	
		super(Math.PI*2*r, Math.PI*r*r);
		this.radius = r;
	}
	public String toString(){	
		return super.toString()+"또, 반지름은 "+radius+"입니다.\n";		
	} 
	public boolean equals(Object o){
		return this.radius ==((Circle)o).radius;
	}
}

class EquilateralTriangle extends Figure{
	protected double side;
	protected double height;
	EquilateralTriangle(){ 
		this(1);
	}
	EquilateralTriangle(double s){ 
		super(3*s, Math.sqrt(3)/4*s*s);
		side = s;
		height = Math.sqrt(3)/2*side;
	}
	public String toString(){
		return String.format("%s이 삼각형의 한변의 길이는 %.2f이고, 높이는 %.2f입니다.\n", super.toString(),side, height);		
	} 
}

class HW8_1{
	public static void main(String args []){
		Circle c = new Circle(3);	
		System.out.println(c);	
		EquilateralTriangle r = new EquilateralTriangle(3);	
		System.out.println(r);
	}	
}
