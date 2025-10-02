package ArraySolutions;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    int maxVolume = 0;
    for (int i = 0; i < height.length - 1; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int volume = (j - i) * (Math.min(height[i], height[j]));
        if (maxVolume < volume) {
          maxVolume = volume;
        }
      }
    }
    return maxVolume;
  }
}
