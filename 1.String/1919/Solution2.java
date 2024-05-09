import java.util.Scanner;

public class Solution2 {
	public static int[] counting(String str){
    	int[] counting  = new int[26];
	for (int i = 0; i <= str.length() - 1; i++) {
		counting[str.charAt(i)-'a']= counting[str.charAt(i)-'a']+1;
	}
	return counting;
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		//소문자 넣어주기
		int[] a_alph = counting(a);
		int[] b_alph = counting(b);
		int count = 0;
		
		for (int i = 0; i<26; i++) {
			if(a_alph[i]-b_alph[i]!=0) {
				count = count + Math.abs(a_alph[i] - b_alph[i]);
			}
		}
		System.out.println(count);
	}
}
