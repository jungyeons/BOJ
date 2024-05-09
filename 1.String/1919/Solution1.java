import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		//소문자 넣어주기
		int[] a_alph = new int[26];
		int[] b_alph = new int[26];
		int count = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			a_alph[a.charAt(i)-'a']= a_alph[a.charAt(i)-'a']+1;
		}
		for (int i = 0; i <= b.length() - 1; i++) {
			b_alph[b.charAt(i)-'a']= b_alph[b.charAt(i)-'a']+1;
		}
		for (int i = 0; i<26; i++) {
			if(a_alph[i]-b_alph[i]>0) {
				count = count + (a_alph[i] - b_alph[i]);
			}else if(a_alph[i]-b_alph[i]<0){
				count = count + (b_alph[i] - a_alph[i]);
			}else {
			}
		}
		System.out.println(count);
	}
}
