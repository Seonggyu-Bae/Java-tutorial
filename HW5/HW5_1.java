public class HW5_1{
	public static void main(String args[]){
		setCoord(6,3);
		setCoord(3,6,2);
	}
	
	static void setCoord(int x, int y){
		System.out.printf("x, y ÁÂÇ¥: (%d, %d)\n", x, y);
	}
	
	static void setCoord(int x, int y, int z){
		System.out.printf("x, y, z ÁÂÇ¥: (%d, %d, %d)\n", x, y, z);
	}
}
