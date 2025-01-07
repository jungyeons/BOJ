import java.util.Scanner;

public class Main10431 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 테스트 케이스의 수
        
        // 각 테스트 케이스에 대해 반복
        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();  // 테스트 케이스 번호
            int[] bsorted = new int[20];
            
            // 20명의 학생 키를 입력받음
            for (int num = 0; num < 20; num++) {
                bsorted[num] = sc.nextInt();
            }

            int count = 0;  // 이동 횟수를 저장할 변수
            
            // 삽입 정렬을 사용하여 학생들을 정렬하면서 이동 횟수를 셈
            for (int num = 1; num < 20; num++) {
                int current = bsorted[num];  // 현재 학생의 키
                int j = num - 1;
                
                // 정렬된 부분에 현재 학생을 삽입하는 과정에서 이동 횟수 계산
                while (j >= 0 && bsorted[j] > current) {
                    bsorted[j + 1] = bsorted[j];  // 학생을 한 칸 뒤로 이동
                    j--;
                    count++;  // 이동 횟수 증가
                }
                bsorted[j + 1] = current;  // 현재 학생을 적절한 위치에 삽입
            }
            
            // 테스트 케이스 번호와 이동 횟수 출력
            System.out.println(t + " " + count);
        }

        sc.close();
    }
}
