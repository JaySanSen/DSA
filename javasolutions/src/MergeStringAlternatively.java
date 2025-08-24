public class MergeStringAlternatively {
    /*
        You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
        Return the merged string.

        Example 1:
        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r

        Example 2:
        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        word1:  a   b
        word2:    p   q   r   s
        merged: a p b q   r   s

        Example 3:

        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
                word1:  a   b   c   d
        word2:    p   q
        merged: a p b q c  d

        Constraints:
        1 <= word1.length, word2.length <= 100
        word1 and word2 consist of lowercase English letters.
    */
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        String finalString = "";

        while (i < word1.length() && j < word2.length()) {
            finalString += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(j));
            i = i + 1;
            j = j + 1;
        }
        if (word1.length() < word2.length()) {
            finalString += word2.substring(j);
        } else {
            finalString += word1.substring(i);
        }
        return finalString;
    }

    // Solution 2 better time complexity
    public String mergeAlternately1(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder finalString = new StringBuilder();
        while (i < word1.length() && j < word2.length()) {
            finalString.append(String.valueOf(word1.charAt(i++)));
            finalString.append(String.valueOf(word2.charAt(j++)));
        }
        if (word1.length() < word2.length()) {
            finalString.append(word2.substring(j));
        } else {
            finalString.append(word1.substring(i));
        }
        return finalString.toString();
    }
}
