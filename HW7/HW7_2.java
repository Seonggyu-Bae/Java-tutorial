import java.util.Arrays;

public class HW7_2{
    public static void main(String [] args){
		String tmp;
		
		if(args.length==0){
			System.out.println("커맨드 라인상에 입력된 문자열이 존재하지 않습니다.");
			return;
		}
		
		for(int i=0; i<args.length-1; i++){
			for(int j=i+1; j<args.length; j++){
				if(args[i].length()<args[j].length()){
					tmp = args[i];
					args[i] = args[j];
					args[j] = tmp;
				}
				else if(args[i].length()==args[j].length()){ 
					if (args[i].compareTo(args[j])>0){			
						tmp = args[i];
						args[i] = args[j];
						args[j] = tmp;
					}						
				}
			}
		}
		
		for(String s: args) System.out.printf("%s\t", s);
			
    } 
}