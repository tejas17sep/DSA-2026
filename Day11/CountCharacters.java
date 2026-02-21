package Day11;

public class CountCharacters {
    
    public static int countValidChars(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Skip space and comma
            if (ch != ' ' && ch != ',') {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String input = "Hello, World! How, are you";
        System.out.println(countValidChars(input)); // 16 (excludes 3 spaces + 2 commas)
    }
}
