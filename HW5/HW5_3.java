import java.util.Scanner;

public class HW5_3{
	public static void main(String [] args){
		String s1, s2;
		Scanner s = new Scanner(System.in);
		System.out.print("문장 1: ");
		s1 = s.nextLine();		
		System.out.print("문장 2: ");
		s2 = s.nextLine();
		System.out.println("문장 1과 문장 2 연결 결과: "+StringManipulate.concat(s1,s2));
		System.out.print("문장 1 대문자 변환 결과: ");
		StringManipulate.toUpper(s1);
		System.out.print("문장 1과 문장 2의 일치 여부: "+StringManipulate.equals(s1,s2));
	}
}

class StringManipulate{
	public static String concat(String s1, String s2){
		return s1+s2;
	}

	public static void toUpper(String s){
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z')	System.out.print((char)(s.charAt(i)-32)); 
			else System.out.print(s.charAt(i));
		}
		System.out.println();
	}	
	
	public static boolean equals(String s1, String s2){
		int l1, l2;
		boolean result = true;
		
		l1 = s1.length();
		l2 = s2.length();
		
		if(l1 != l2) result = false;
		else{
			for(int i=0; i<l1; i++){
				if(s1.charAt(i) != s2.charAt(i)){
					result = false;
					break;
				}
			}
		}
		return result;
	}	
}