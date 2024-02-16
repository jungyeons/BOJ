package practice;

import java.util.*;
public class Solution2 {
//String에서의 toUpperCase를 써보고 싶어서 애썼다. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] array = a.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= 'a' && array[i] <= 'z') {
                array[i] = Character.toUpperCase(array[i]);
				System.out.print(array[i]);
            } else if (array[i] >= 'A' && array[i] <= 'Z') {
                array[i] = Character.toLowerCase(array[i]);
				System.out.print(array[i]);
            }
        }
    }
}

