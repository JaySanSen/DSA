public class MergeStringAlternatively {
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
