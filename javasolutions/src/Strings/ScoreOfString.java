package Strings;

public class ScoreOfString {
  public int scoreOfStringSolution(String s) {
    if (s.isBlank() || s.isEmpty()) {
      return 0;
    }
    int sum = 0;
    for (int i = 0; i < s.length() - 1; i++) {
      sum += Math.abs((int) s.charAt(i) - (int) s.charAt(i + 1));
    }
    return sum;
  }
}
