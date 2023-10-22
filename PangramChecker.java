public class PangramChecker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(sentence);
        
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        int[] letterCount = new int[26];
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = Character.toLowerCase(sentence.charAt(i));

            if (c >= 'a' && c <= 'z') {
                letterCount[c - 'a'] = 1;
            }
        }
        
        for (int count : letterCount) {
            if (count == 0) {
                return false;
            }
        }
        
        return true;
    }
}
