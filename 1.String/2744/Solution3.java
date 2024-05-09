package string;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		char  [] a_array = a.toCharArray();
		for(int i =0; i<=a.length()-1; i++) {
			if(a_array[i]>='Z') {
				a_array[i] = (char) (a_array[i]-32);
				System.out.print(a_array[i]);
			}else {
				a_array[i] = (char) (a_array[i]+32);
				System.out.print(a_array[i]);
			}
		}
	}

}
