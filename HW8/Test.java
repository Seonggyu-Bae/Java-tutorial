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
		Member m1=new Member(24,"������");
		Member m2=new Member(23,"�輺��");
		Member m3=new Member(24,"�ֺ���");
		Member m4=new Member();
		System.out.println("�� ��ȣȸ�� �ο���"+Member.numofm()+"�Դϴ�.");
	} 
}
