/*
 * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 * Input: nums = [1, 2, 3, 3]
 * Output: true
 * Input: nums = [1, 2, 3, 4]
 * Output: false
 * 
 * You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.
 */


function containsDuplicate(arr: Array<number>): boolean {
  let uniqueSet: Set<number> = new Set<number>();
  for (let item of arr) {
    if (uniqueSet.has(item)) {
      return true;
    }
    else {
      uniqueSet.add(item);
    }
  }
  return false;
}




let arr: Array<number> = [1, 2, 3, 4];
console.log(containsDuplicate(arr)); //false


let arr2: Array<number> = [1, 2, 2, 4];
console.log(containsDuplicate(arr2)); //true