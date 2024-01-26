package _java.level2;

public class Level2_예상대진표 {
    public static void main(String[] args) {
        int solution1 = solution(8, 4, 7);
        System.out.println("solution1 = " + solution1);
    }

    public static int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}
