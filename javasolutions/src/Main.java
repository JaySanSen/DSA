import ArraySolutions.RemoveDuplicates;

public class Main {
  public static void main(String[] args) {
    // ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
    // containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    //ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
    // int[] nums = {1,2,3,4,5};
    // System.out.println(Arrays.toString(concatenationOfArray.getConcatenation(nums)));
    //IsSubsequence isSubsequence = new IsSubsequence();
    RemoveDuplicates duplicates = new RemoveDuplicates();
    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(duplicates.removeDuplicates(nums));
  }
}
