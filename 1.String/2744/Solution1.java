package practice;
import java.util.*;
public class Solution1 {
//charAt은 싫어서 한번에 읽고 나중에 변환하는 것으로 함.
//char로 캐스팅하는 것이랑 등호는 부등호 다음이라는 것을 잊지말자.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		char [] array = a.toCharArray();
		for(int i = 0; i<array.length; i++) {
			if(array[i]>='a'&&array[i]<='z') {
				array[i] = (char)(array[i]-'a'+'A');
				System.out.print(array[i]);
			}else if(array[i]>='A'&&array[i]<='Z'){
				array[i] = (char)(array[i]+'a'-'A');
				System.out.print(array[i]);
			}else {
				
			}
		}
	}

}
