package Strings;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

    1 <= s.length <= 2 * 105
    s consists only of printable ASCII characters.

*/
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s.isBlank() || s.isEmpty()) {
            return true;
        }
        for (char a : s.toCharArray()) {
            if (!Character.isLetterOrDigit(a)) {
                s = s.replace(String.valueOf(a), "");
            }
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        String reverseString = stringBuilder.reverse().toString();
        if (reverseString.equals(s))
            return true;
        return false;
    }

}
// for (int i = 0; i < (s.length() / 2); i++) {
// if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
// return false;
// }
// }