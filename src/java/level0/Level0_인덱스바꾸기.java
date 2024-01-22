package java.level0;

public class Level0_인덱스바꾸기 {
    public static void main(String[] args) {
        String solution1 = solution("hello", 1, 2);
        System.out.println("solution1 = " + solution1); // "hlelo"

        String solution2 = solution("I love you", 3, 6);
        System.out.println("solution2 = " + solution2); // "I l veoyou"
    }

    public static String solution(String my_string, int num1, int num2) {
        char num1Char = my_string.charAt(num1);
        char num2Char = my_string.charAt(num2);

        char[] charArray = my_string.toCharArray();
        charArray[num1] = num2Char;
        charArray[num2] = num1Char;

        return String.valueOf(charArray);
    }
}
