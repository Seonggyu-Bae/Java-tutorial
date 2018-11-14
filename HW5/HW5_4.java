import java.util.Scanner;

public class HW5_4{
	public static void main(String [] args){
		System.out.print("문장: ");
		String str = Search.input();
		System.out.print("검색할 단어: ");
		String word = Search.input();
		Search.search(str, word);
	}
}

class Search{
	public static String input(){
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	public static void search(String str, String word){
		int len = word.length();
		int cnt = 0;
		int eojeol = 1;
		System.out.print("검색 결과: ");
		for(int i=0; i<str.length()-len; i++){
			if(str.charAt(i)==' ') eojeol++;
			if(word.equalsIgnoreCase(str.substring(i, i+len))){
				cnt++;
				System.out.print(eojeol+"번째, ");
			}
		}
		if(cnt>0) System.out.printf("\b\b 어절에서 \"%s\"가 검색되어, 총 %d회 검색되었습니다.\n", word, cnt);
		else System.out.println("총 0회 검색되었습니다.");
	}
}