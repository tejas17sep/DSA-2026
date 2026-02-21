package Day11;

public class RemoveVowels {
    
    public static String removeVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) == -1) { // Not a vowel
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(removeVowels("Hello World"));  // "Hll Wrld"
        System.out.println(removeVowels("Java Programming")); // "Jv Prgrmmng"
    }
}
