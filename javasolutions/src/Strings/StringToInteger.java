package Strings;

public class StringToInteger {
  public int ConvertToInteger(String s) {
    s = s.trim();
    if (s.length() == 0) {
      return 0;
    }
    int flag = 1, i = 0;
    int sum = 0;
    if (s.charAt(i) == '-') {
      flag = -1;
      i = i + 1;
    } else if (s.charAt(i) == '+') {
      i = i + 1;
    }
    // The maximum value is 2147483647  -> ends with 7
    // The minimum value is -2147483648 -> ends with 8
    // Both max and min values start with 214748364
    // So we can check the sum before multiplying by 10
    int maxValue = Integer.MAX_VALUE / 10;
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
      // Check for overflow and underflow conditions
      // If sum > 214748364, then multiplying by 10 will definitely cause overflow
      // If sum == 214748364, then we need to check the last digit
      // We check for 7 because the max integer value ends with 7 and min integer value ends with 8
      // Check for overflow and underflow conditions before calculating the next sum
      if (sum > maxValue || (sum == maxValue && (s.charAt(i) - '0') > 7)) {
        if (flag == 1) {
          return Integer.MAX_VALUE;
        } else {
          return Integer.MIN_VALUE;
        }
      }
      sum = sum * 10 + (s.charAt(i) - '0');
      i++;
    }
    return flag * sum;
  }
}
