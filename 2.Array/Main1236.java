import java.util.Scanner;

public class Main1236 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++)
			map[i] = scanner.next().toCharArray();

		boolean existY[] = new boolean[N];
		boolean existX[] = new boolean[M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'X') {
					existY[i] = true;
					existX[j] = true;
				}}}
		int rowNeedCount = N;
		int columnNeedCount = M;
		for (int r = 0; r < N; r++)
			if (existY[r])rowNeedCount--;
		for (int c = 0; c < M; c++)
			if (existX[c])columnNeedCount--;
		System.out.println(Math.max(rowNeedCount, columnNeedCount));
	}
}
