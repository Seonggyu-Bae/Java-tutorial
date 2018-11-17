import java.util.Scanner;

class HW4_4{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String word;
		int nbOfMoeum = 0, nbOfJaeum=0;
		
		if(args.length != 1){
			System.out.println("[입력오류]하나의 영단어를 입력하지 않아 프로그램을 종료합니다. ");
			return;
		}
		
		word = args[0]; 
		
		for(int i=0; i<word.length(); i++){
			if(((word.charAt(i)>='A')&&(word.charAt(i)<='Z'))||((word.charAt(i)>='a')&&(word.charAt(i)<='z'))){
				switch(word.charAt(i)){
					case 'A': case 'E': case 'I': case 'O': case 'U': 
					case 'a': case 'e': case 'i': case 'o': case 'u': 
					nbOfMoeum++;
					break;
				default: 
					nbOfJaeum++;
					break;
				}
			}
		}
		
		System.out.println("자음 개수: "+nbOfJaeum);
		System.out.println("모음 개수: "+nbOfMoeum);
	}
}
