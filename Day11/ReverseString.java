package Day11;

public class ReverseString {
    
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        } 
    }
    
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        ReverseString rs = new ReverseString();  // Create instance
        rs.reverseString(s);                     // Call method on instance
        System.out.println(s);                   // Prints: olleh
    }
}
