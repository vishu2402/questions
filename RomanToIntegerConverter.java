public class RomanToIntegerConverter {
    public static void main(String[] args) {
        String romanNumeral = "XIL";

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = getRomanValue(currentChar);

            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = getRomanValue(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int getRomanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
