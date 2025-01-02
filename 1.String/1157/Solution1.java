import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		char [] arr = a.toUpperCase().toCharArray();
		int count [] = new int [26];
		int Max = 0;
		char maxChar = '?';
		for(int i=0; i<arr.length; i++) {
		count[arr[i]-'A']++;
		}
		for(int i=0; i<count.length; i++) {
			if(count[i]>Max) {
				Max = count[i];
				maxChar = (char)(i+'A');
			}else if(count[i]==Max) {
				maxChar = '?';
			}
			}
		System.out.println(maxChar);
	}

}
