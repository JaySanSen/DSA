"use strict";
/*
 
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 
Input: s = "racecar", t = "carrace"
Output: true

Input: s = "jar", t = "jam"
Output: false

*/
const isValidAnagram = (s, t) => {
    let sArr = new Array(26);
    sArr.fill(0, 0, 26);
    for (let i = 0; i < s.length; i++) {
        sArr[s.charCodeAt(i) - 'a'.charCodeAt(0)] += 1; // Increment the index by one
        sArr[t.charCodeAt(i) - 'a'.charCodeAt(0)] -= 1; // Decrement the index by one
    }
    // If both string are equal then the final array will have 0's in all indices.
    let flag = 0;
    sArr.forEach(item => {
        if (item != 0) {
            flag = 1;
        }
    });
    if (flag === 0) {
        return true;
    }
    else {
        return false;
    }
};
console.log(isValidAnagram("racecar", "carrace"));
console.log(isValidAnagram("jams", "jam"));
