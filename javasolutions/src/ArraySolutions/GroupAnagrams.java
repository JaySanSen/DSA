/*
 * Given an array of strings strs, group the
 * together. You can return the answer in any order.
 * 
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Explanation:
 * There is no string in strs that can be rearranged to form "bat". The strings "nat" and "tan" are
 * anagrams as they can be rearranged to form each other. The strings "ate", "eat", and "tea" are
 * anagrams as they can be rearranged to form each other.
 * 
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 * 
 * Constraints:
 * 1 <= strs.length <= 104 0 <= strs[i].length <= 100 strs[i] consists of lowercase English letters.
 */

package ArraySolutions;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      int[] arr = new int[26];
      Arrays.fill(arr, 0);
      for (char c : str.toCharArray()) {
        arr[c - 'a']++;
      }
      String value = Arrays.toString(arr);
      if (!map.containsKey(value)) {
        map.put(value, new ArrayList<>());
      }
      map.get(value).add(str);

    }
    return new ArrayList<>(map.values());
  }
}
