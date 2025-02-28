using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DotNETSolutions.SolutionFiles
{
  /*
   * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
   * Input: nums = [1, 2, 3, 3]
   * Output: true
   * Input: nums = [1, 2, 3, 4]
   * Output: false
   * 
   * You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.
   */
  public class ContainsDuplicate
  {
    public bool DoesContainDuplicate(int[] arr)
    {
      HashSet<int> uniqueSet = new HashSet<int>();
      foreach (int i in arr)
      {
        if (!uniqueSet.Contains(i))
        {
          uniqueSet.Add(i);
        }
        else
        {
          return true;
        }
      }
      return false;
    }
  }

  /*
      ContainsDuplicate containsDuplicate = new ContainsDuplicate();
      int[] arr = new int[4] { 1, 2, 6, 4 };
      Console.WriteLine(containsDuplicate.DoesContainDuplicate(arr)); // False

      ContainsDuplicate containsDuplicate = new ContainsDuplicate();
      int[] arr = new int[4] { 1, 2, 1, 4 };
      Console.WriteLine(containsDuplicate.DoesContainDuplicate(arr)); // True

  */

}
