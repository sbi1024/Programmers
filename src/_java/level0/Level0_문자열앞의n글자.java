package _java.level0;

public class Level0_문자열앞의n글자 {
    public static void main(String[] args) {
        String solution1 = solution("ProgrammerS123", 11);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("He110W0r1d", 5);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }

}
