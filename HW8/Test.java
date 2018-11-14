class Member{
	String name;
	int age;
	static int numofmem;
	
	public static int numofm(){
		return numofmem;
	}
	
	 Member(){
		numofmem++;
	}
	
	Member(int a, String b){
		this();
		this.age=a;
		this.name=b;
	}
	
}


class Test{
	public static void main(String[] args){
		Member m1=new Member(24,"허정빈");
		Member m2=new Member(23,"배성규");
		Member m3=new Member(24,"최병혁");
		Member m4=new Member();
		System.out.println("이 동호회의 인원은"+Member.numofm()+"입니다.");
	} 
}
