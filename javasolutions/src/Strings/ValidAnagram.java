package Strings;

import java.util.HashMap;

//Example 1:
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//Input: s = "rat", t = "car"
//Output: false
//Constraints:
//1 <= s.length, t.length <= 5 * 104
//s and t consist of lowercase English letters.

public class ValidAnagram {
  public boolean isAnagram1(String s, String t) {
    if(s.length() != t.length()){
      return false;
    }
    int[] arr = new int[26];
    for (char a : s.toCharArray()) {
      arr[a - 'a'] += 1;
    }
    for (char a : t.toCharArray()) {
      arr[a - 'a'] -= 1;
    }
    for (int a : arr) {
      if (a != 0) {
        return false;
      }
    }
    return true;
  }

  public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> firstMap = new HashMap<>();
    HashMap<Character, Integer> secondMap = new HashMap<>();
    for (char a : s.toCharArray()) {
      if (firstMap.containsKey(a)) {
        firstMap.put(a, firstMap.get(a) + 1);
      } else {
        firstMap.put(a, 1);
      }
    }

    for (char a : t.toCharArray()) {
      if (secondMap.containsKey(a)) {
        secondMap.put(a, secondMap.get(a) + 1);
      } else {
        secondMap.put(a, 1);
      }
    }
    if (firstMap.size() != secondMap.size()) {
      return false;
    }
    System.out.println(firstMap);
    System.out.println(secondMap);
    for (char a : firstMap.keySet()) {
      if (!(secondMap.containsKey(a) && secondMap.get(a) == firstMap.get(a))) {
        return false;
      }
    }
    return true;

  }
}
