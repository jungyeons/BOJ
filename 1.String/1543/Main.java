import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//패턴을 찾아야 하는 단어
		String Pattern = scanner.nextLine();
		//패턴 단어
		String Word = scanner.nextLine();
		scanner.close();
		//단어 찾기 시작 지점
		int startIndex =0;
		int count =0;
		while(true) {
			int findIndex = Pattern.indexOf(Word,startIndex);
			//b에 겹치는 게 없을 때
			if(findIndex<0)
				break;
		startIndex = findIndex + Word.length();
		count++;
		}
		System.out.println(count);
	}

}
