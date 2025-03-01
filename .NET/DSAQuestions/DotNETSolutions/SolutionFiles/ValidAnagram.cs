using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DotNETSolutions.SolutionFiles
{
  /*
  
  Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

  An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
  
  Input: s = "racecar", t = "carrace"
  Output: true

  Input: s = "jar", t = "jam"
  Output: false

  */
  public class ValidAnagram
  {
    public bool IsValidAnagram(string s, string t)
    {
      if (s.Length != t.Length)
      {
        return false;
      }

      Dictionary<char, int> sDict = new Dictionary<char, int>();
      Dictionary<char, int> tDict = new Dictionary<char, int>();
      for (int i = 0; i < s.Length; i++)
      {
        sDict[s[i]] = sDict.GetValueOrDefault(s[i], 0) + 1; //GetValueOrDefault will try to see if the key exists. If it does it will get the value otherwise it will default to the value given in this case 0. 
        tDict[t[i]] = tDict.GetValueOrDefault(t[i], 0) + 1;
      }

      if (sDict.Count == tDict.Count && !sDict.Except(tDict).Any()) // Except will create a IEnumerable item with the items in 1 that don't appear in the 2nd one. Any() will check if created item has any values in it or if it is empty.
      {
        return true;
      }
      else
      {
        return false;
      }

    }
  }
}


/*
      string s = "racecar";
      string t = "carrace";
      string s1 = "jar";
      string t1 = "jam";

      ValidAnagram validAnagram = new ValidAnagram();
      Console.WriteLine(validAnagram.IsValidAnagram(s,t));
      Console.WriteLine(validAnagram.IsValidAnagram(s1,t1));
*/